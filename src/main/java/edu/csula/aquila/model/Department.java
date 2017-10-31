package edu.csula.aquila.model;
import java.util.*;


public class Department{
	
	long id;
	String name;
	User depChair;
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