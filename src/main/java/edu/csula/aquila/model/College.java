package edu.csula.aquila.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "colleges")
public class College {
	
	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "college_name")
	String name;
	
	@OneToOne
	User dean;

	College(long id, String name, User dean){
	this.id = id;
	this.name = name;
	this.dean = dean;
	
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id)
	{
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public User getDean(){
		return dean;
	}

	public void setDean(User dean)
	{
		this.dean = dean;
	}

	
}
