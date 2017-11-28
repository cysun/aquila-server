package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "budget")
public class BudgetFile implements Serializable{

	@Id
	@GeneratedValue
	@Column(name ="budget_form_id")
	Long id;
	
//	@Column(name = "file")
//	File budgetFile;
// still deciding where/how to save into disk
	
	
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
	
	//proposal relationship
//	@OneToOne(mappedBy="budgetForm")
//	Proposal proposalForm;

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

	public String getNameOfFile() {
		return nameOfFile;
	}

	public void setNameOfFile(String nameOfFile) {
		this.nameOfFile = nameOfFile;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
