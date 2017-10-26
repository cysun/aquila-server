package edu.csula.aquila.model;
import java.util.*

public class College{
	
	long id;
	String name;
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