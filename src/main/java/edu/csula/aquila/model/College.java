package edu.csula.aquila.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "college")

public class College implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false; unique = true)
	private String name;

	@Column(name="dean")
	private User dean;

	public College()
	{
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