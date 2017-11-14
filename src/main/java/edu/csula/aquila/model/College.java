package edu.csula.aquila.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "colleges")
public class College implements Serializable{

	
	@Id
	@GeneratedValue
	Long Id;

	@Column(name = "college_name")
	String name;
	
	@Column
	User dean;


	College(){

	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User getDean() {
		return dean;
	}


	public void setDean(User dean) {
		this.dean = dean;
	}


	
}
