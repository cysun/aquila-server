package edu.csula.aquila.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signature")
public class Signature implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="signature_id")
	Long Id;
	
	@Column
	String name;
	//for testing purposes
	
	Signature(String name){
		this.name = name;
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


}
