package edu.csula.aquila.model;

import java.io.File;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "budget")
public class BudgetFile {

	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "uploader")
	String nameOfUploader;
	
	@Column(name = "file_name")
	String nameOfFile;
	
	@Column(name = "file_type")
	String type;
	
	@Column(name = "file_path")
	String filePath;
	
	@Column(name = "date")
	Date dateOfUpload;
	
	@OneToOne(mappedBy="budgetForm")
	Proposal proposal;
	
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
