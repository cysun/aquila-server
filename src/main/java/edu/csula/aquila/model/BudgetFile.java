package edu.csula.aquila.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "budget")
public class BudgetFile implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="budget_form_id")
	private Long id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "uploader")
	private String nameOfUploader;
	
	//private boolean isCompleted;
	

	@ElementCollection
	@MapKeyColumn(name="file_path")
	@Column(name = "file_date")
	@CollectionTable(name = "file_description", joinColumns=@JoinColumn(name = "budget_id"))
	private Map<String,Timestamp> filePaths;
	
	//proposal relationship
	@OneToOne
	@JoinColumn(name="proposal_id")
	Proposal proposalForm;

	public BudgetFile() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNameOfUploader() {
		return nameOfUploader;
	}

	public void setNameOfUploader(String nameOfUploader) {
		this.nameOfUploader = nameOfUploader;
	}

	

	public Map<String, Timestamp> getFilePaths() {
		return filePaths;
	}

	public void setFilePaths(Map<String, Timestamp> filePaths) {
		this.filePaths = filePaths;
	}

	
	
}
