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
	

	@ElementCollection
	@MapKeyColumn(name="file_path")
	@Column(name = "file_date")
	@CollectionTable(name = "file_description", joinColumns=@JoinColumn(name = "budget_id"))
	private Map<String,Timestamp> filePaths;
	
	
	/*
	@Entity
	@Table(name = "budget_files")
	public class Budget implements Serializable{
		
	
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;
		
		@ManyToOne
		BudgetFile budgetFile;
		
		@Column(name = "file_name")
		private String name;
		
		@Column(name = "file_date")
		private Date date;
		
		@Column(name = "bytes")
		private byte[] bytes;
		
		public Budget(String name, Date date, byte[] bytes) {
			this.name = name;
			this.date = date;
			this.bytes = bytes;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public byte[] getBytes() {
			return bytes;
		}

		public void setBytes(byte[] bytes) {
			this.bytes = bytes;
		}
		
		
	}
	*/
	
	//proposal relationship
//	@OneToOne(mappedBy="budgetForm")
//	Proposal proposalForm;


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
