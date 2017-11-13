package edu.csula.aquila.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "departments")
public class Department implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="department_id")
	Long id;
	
	@Column(nullable = false, unique = true, name = "department_name")
	String name;
	
	@Column(name = "department_chair")
	User depChair;
	
	@Column(name = "college")
	College college;

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

	public User getDepChair() {
		return depChair;
	}

	public void setDepChair(User depChair) {
		this.depChair = depChair;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	
}