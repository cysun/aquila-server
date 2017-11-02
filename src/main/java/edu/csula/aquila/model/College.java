package edu.csula.aquila.model;
import java.util.*;

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

	long getId() {
		return id;
	}

	String getName(){
		return name;
	}

	User getDean(){
		return dean;
	}

	void setName(String name){
		this.name = name;
	}

	void setDean(User dean){
		this.dean = dean;
	}
}