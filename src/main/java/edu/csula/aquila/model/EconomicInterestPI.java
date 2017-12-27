package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "economic_interest_pi")
public class EconomicInterestPI implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "economic_interest_pi_id")
	private Long id;
	
	private int progress;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_initial")
	private String middleInitial;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	private Department department;
	
	@Column(name="mail_code")
	private String mailCode; //int or string?
	
	private String email;
	
	@Column(name = "project_title")
	private String projectTitle;
	
	//Section 1 - Funding Entity
	
	@Column(name ="entity_name")
	private String entityName;
	
	@Column(name = "entity_address")
	private String entityAddress;
	
	@Column(name = "principal_business")
	private String principalBusiness; //??
	
	@Column(name = "funding_amount")
	private Integer fundingAmount;
	
	private Map<String,Boolean> estimate;
	
	//Section 2 - Type of Statement
	
	@Column(name = "statement_type")
	private Map<Boolean,Date> statementType;
	
	//Section 3 - Filer info
	
	//Section 4 - Verification
	 
	@Column(name = "date_signed")
	private Date dateSigned;
	
	private String signature;
}
