package edu.csula.aquila.controller;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.csula.aquila.model.BudgetFile;
import edu.csula.aquila.model.BudgetFileDao;

@RestController
public class BudgetFileController {
	
	@Autowired
	private BudgetFileDao budgetFileDao;
	
	@RequestMapping(value = "/proposal/budget", method = RequestMethod.GET)
	public BudgetFile getBudget(@RequestParam Long id)
	{
		return budgetFileDao.getBudget(id);
	}
	
	@RequestMapping(value = "/proposal/budget/save", method = RequestMethod.POST)
	public BudgetFile saveBudgetFile(@RequestBody BudgetFile budget)
	{
		return budgetFileDao.saveBudgetFile(budget);
		
	}
	
	
	@RequestMapping(value = "/proposal/budget/upload", method = RequestMethod.PUT)
	public String uploadSaveFile(@RequestParam("file") MultipartFile file, @RequestParam Long id)throws IOException
	{
		
		String status;
		String fileName = null;
		
		if(file.isEmpty())
		{
			return "no file!";
		}
		
		try
		{
			fileName = budgetFileDao.saveFile(Arrays.asList(file), id);
			System.out.println(fileName);
		

        } catch (IOException e) 
		{
            status = "Bad Request";
        }
		
		budgetFileDao.addFile(id, fileName);
		
		status = "success! - " + fileName;
		
		return status;
	}

}
