package edu.csula.aquila.model;

import java.io.File;
import java.util.Date;

public class BudgetFile {

	File budget;
	
	Long id;
	String nameOfUploader;
	String description;
	String filePath;
	Date dateOfUpload;
	
	public File getBudget() {
		return budget;
	}
	
	public void setBudget(File budget) {
		this.budget = budget;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNameOfUploader() {
		return nameOfUploader;
	}
	
	public void setNameOfUploader(String nameOfUploader) {
		this.nameOfUploader = nameOfUploader;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getFilePath() {
		return filePath;
	}
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Date getDateOfUpload() {
		return dateOfUpload;
	}
	public void setDateOfUpload(Date dateOfUpload) {
		this.dateOfUpload = dateOfUpload;
	}
	
	
}
