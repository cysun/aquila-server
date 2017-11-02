package edu.csula.aquila.model;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "departments")
public class Department{

	@Id
	@GeneratedValue
	Long id;
	
	@Column(nullable = false, unique = true, name = "department_name")
	String name;
	
	@OneToOne
	User depChair;
	
	@ManyToOne
	College college;

	Department(long id, String name, User depChair, College college){
		this.id = id;
		this.name= name;
		this.depChair = depChair;
		this.college = college;
	}

	long getId() {
		return id;
	}

	String getName(){
		return name;
	}

	User getDepChair(){
		return depChair;
	}

	College getCollege(){
		return college;
	}

	void setName(String name){
		this.name = name;
	}

	void setDepChair(User depChair){
		this.depChair = depChair;
	}

	void setCollege(College college){
		this.college = college;
	}
}