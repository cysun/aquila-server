package edu.csula.aquila.model;
import java.io.Serializable;
import java.util.*;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "conflict_of_interest_non_phs")

public class ConflictOfInterestKPNonPHS implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "conflict_of_interest_non_phs_id")
	private Long id;

	
	@Column(name = "pi")
	private User pI;

	@Column(name = "proposal_number", nullable = false, unique = true)
	private long proposalNumber;

	@Column(name="proposal_title")
	private	String proposalTitle; //come from intake??

	@Column(name="sponsor")
	private String sponsor;

	@Column(name="sub_award")
	private boolean subAward; 
	//strings for boolean subaward if true
	
	@Column(name = "subaward_sponsor")
	private String subAwardSponsor;
	
	@Column(name = "subaward_agency")
	private String subAwardAgency;

	@ElementCollection
	@MapKeyColumn(name="reasons")
	@Column(name="previous_info")
	private Map<Boolean,String> disclosureReasons;

	@Column(name = "budget_period_start")
	private Date budgetPeriodStart;

	@Column(name = "budget_period_end")
	private Date budgetPeriodEnd;

	@Column(name = "project_period_start")
	private Date projectPeriodStart;

	@Column(name = "project_period_end")
	private Date projectPeriodEnd;

	@Column(name = "amount_requested")
	private double amountRequested;

	@Column
	private long iRBACUCIBCNo; //name unclear

	@Column(name = "significat_fin_interest")
	private boolean significantFinInterest;

	@Column(name = "key_personnel_sign")
	private Signature keyPersonnelSign; //needs signature and print, signature its own class?

	@Column(name = "key_personnel_date")
	private Date keyPersonnelDate;

	@Column(name = "ari_official")
	private boolean aRIOfficial;

	@Column(name = "ari_date")
	private Date aRIDate;
	
	//proposal relationship
//	@OneToOne(mappedBy="coiKpNonPhs")
//	Proposal proposalForm;

	public ConflictOfInterestKPNonPHS(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getpI() {
		return pI;
	}

	public void setpI(User pI) {
		this.pI = pI;
	}

	public long getProposalNumber() {
		return proposalNumber;
	}

	public void setProposalNumber(long proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	public String getProposalTitle() {
		return proposalTitle;
	}

	public void setProposalTitle(String proposalTitle) {
		this.proposalTitle = proposalTitle;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public boolean isSubAward() {
		return subAward;
	}

	public void setSubAward(boolean subAward) {
		this.subAward = subAward;
	}

	public String getSubAwardSponsor() {
		return subAwardSponsor;
	}

	public void setSubAwardSponsor(String subAwardSponsor) {
		this.subAwardSponsor = subAwardSponsor;
	}

	public String getSubAwardAgency() {
		return subAwardAgency;
	}

	public void setSubAwardAgency(String subAwardAgency) {
		this.subAwardAgency = subAwardAgency;
	}

	public Date getBudgetPeriodStart() {
		return budgetPeriodStart;
	}

	public void setBudgetPeriodStart(Date budgetPeriodStart) {
		this.budgetPeriodStart = budgetPeriodStart;
	}

	public Date getBudgetPeriodEnd() {
		return budgetPeriodEnd;
	}

	public void setBudgetPeriodEnd(Date budgetPeriodEnd) {
		this.budgetPeriodEnd = budgetPeriodEnd;
	}

	public Date getProjectPeriodStart() {
		return projectPeriodStart;
	}

	public void setProjectPeriodStart(Date projectPeriodStart) {
		this.projectPeriodStart = projectPeriodStart;
	}

	public Date getProjectPeriodEnd() {
		return projectPeriodEnd;
	}

	public void setProjectPeriodEnd(Date projectPeriodEnd) {
		this.projectPeriodEnd = projectPeriodEnd;
	}

	public double getAmountRequested() {
		return amountRequested;
	}

	public void setAmountRequested(double amountRequested) {
		this.amountRequested = amountRequested;
	}

	public long getiRBACUCIBCNo() {
		return iRBACUCIBCNo;
	}

	public void setiRBACUCIBCNo(long iRBACUCIBCNo) {
		this.iRBACUCIBCNo = iRBACUCIBCNo;
	}

	public boolean isSignificantFinInterest() {
		return significantFinInterest;
	}

	public void setSignificantFinInterest(boolean significantFinInterest) {
		this.significantFinInterest = significantFinInterest;
	}

	public Signature getKeyPersonnelSign() {
		return keyPersonnelSign;
	}

	public void setKeyPersonnelSign(Signature keyPersonnelSign) {
		this.keyPersonnelSign = keyPersonnelSign;
	}

	public Date getKeyPersonnelDate() {
		return keyPersonnelDate;
	}

	public void setKeyPersonnelDate(Date keyPersonnelDate) {
		this.keyPersonnelDate = keyPersonnelDate;
	}

	public boolean isaRIOfficial() {
		return aRIOfficial;
	}

	public void setaRIOfficial(boolean aRIOfficial) {
		this.aRIOfficial = aRIOfficial;
	}

	public Date getaRIDate() {
		return aRIDate;
	}

	public void setaRIDate(Date aRIDate) {
		this.aRIDate = aRIDate;
	}
	
	



}