package edu.csula.aquila.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "conflict_of_interest_phs")
class ConflictOfInterestPHS{

	//identical to Non PHS, excludes bool subaward, sponsor as Map<Boolean,String>
	
	@Id
	@GenerateValue
	Long id;
	
	@Column
	User pI;
	
	@Column
	long proposalNumber;
	
	@Column
	String proposalTitle; //come from intake??
	
	@ElementCollection
	@MapKeyColumn(name="sponsor_name")
	@Column(name="is_sponsor")
	@CollectionTable(name="sponsor", joinColumns=@JoinColumn(name="id"))
	Map<Boolean,String> sponsor;
	
	@ElementCollection
	List<Boolean> disclosureReasons;//possible Map<boolean,String>, need string if boolean is true

	@Column(name = "budget_period_start")
	Date budgetPeriodStart;
	@Column(name = "budget_period_end")
	Date budgetPeriodEnd;
	@Column(name = "project_period_start")
	Date projectPeriodStart;
	@Column(name = "project_period_end")
	Date projectPeriodEnd;
	
	@Column(name = "amount_requested")
	double amountRequested;
	
	@Column
	long iRBACUCIBCNo; //name unclear
	
	@Column(name = "siginificant_financial_interest")
	boolean significantFinInterest;
	
	@Column(name = "key_personnel_sign")
	String keyPersonnelSign; //needs signature and print, signature its own class?
	
	@Column(name = "key_personnel_date")
	Date keyPersonnelDate;
	
	@Column(name = "ari_official")
	boolean aRIOfficial;
	
	@Column(name = "ari_date")
	Date aRIDate;
}