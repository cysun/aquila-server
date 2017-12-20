package edu.csula.aquila.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OptionalDummyForm {
	@Id
	@GeneratedValue
	@Column(name="optional_dummy_form_id")
	Long id;
	
	@Column(name = "faculty_name")
	String facultyName;
	
	@Column
	String department;
	
	@Column(name = "proposal_title")
	String proposalTitle;
}
