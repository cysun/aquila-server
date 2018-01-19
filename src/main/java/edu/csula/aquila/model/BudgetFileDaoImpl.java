package edu.csula.aquila.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class BudgetFileDaoImpl implements BudgetFileDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	private static String directory = "C:\\uas_uploads\\";
	
	
	@Override
	public BudgetFile getBudget(Long id) {
		
		return entityManager.find(BudgetFile.class, id);
		
	}

	@Override
	@Transactional
	public BudgetFile saveBudgetFile(BudgetFile budgetFile) 
	{
		
		return entityManager.merge( budgetFile );

	}
	
	@Override
	public String saveFile(List<MultipartFile> files, Long id) throws IOException 
	{
		//String newFileName = null;
		int count = 1;
		//directory = directory + "budget-id" + "\\";
	
		String checkName =  Calendar.getInstance().get(Calendar.YEAR) + "id" + id + "version" + count + ".xls";

		
		while(new File(directory + checkName).exists()) {
			count++;
			checkName =  Calendar.getInstance().get(Calendar.YEAR) + "id" + id + "version" + count + ".xls";
			
		}
		String newFileName = checkName;
		
		
		for (MultipartFile file : files) 
		{
			if (file.isEmpty()) 
			{
				continue; 
	        }
			
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(directory + newFileName);
	            Files.write(path, bytes);   

	    }
		
		return newFileName;
	}
	
	
	
	@Override
	@Transactional
	public void addFile(Long id, String fileName)
	{
		BudgetFile budget = entityManager.find(BudgetFile.class, id);
		Timestamp fileAddDate = new Timestamp(System.currentTimeMillis());
	
		
		budget.getFilePaths().put(fileName,fileAddDate);
		
		saveBudgetFile( budget );		
		
	}
	

	@Override
	public byte[] getFile(String fileName) {
		Path path = Paths.get(directory + fileName);
		
		byte[] bytes = null;
		try 
		{
			bytes = Files.readAllBytes(path);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return bytes;
	}

	@Override
	public void returnFile(String fileName) {
		try
		{
			Runtime.getRuntime().exec("cmd /c start " + directory + fileName);
		} catch (IOException e) 
		{
			System.out.println("Invalid File Name");
			e.printStackTrace();
		}
		
	}
	
	
}