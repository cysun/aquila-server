package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "conflict_of_interest_non_phs")

public class ConflictOfInterestKPNonPHS implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(name="pi")
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
	private String subAwardSponsor;
	private String subAwardAgency;

	@Column(name="disclosure_reasons")
	private Map<Boolean,String> disclosureReasons;

	@Column(name = "budget_period_start")
	private Date budgetPeriodStart;

	@Column(name = "budget_period_end")
	Date budgetPeriodEnd;

	@Column(name = "project_period_start")
	Date projectPeriodStart;

	@Column(name = "project_period_end")
	Date projectPeriodEnd;

	@Column(name = "amount_requested")
	double amountRequested;

	@Column(name = "")
	long iRBACUCIBCNo; //name unclear

	@Column(name = "significat_fin_interest")
	boolean significantFinInterest;

	@Column(name = "key_personnel_sign")
	String keyPersonnelSign; //needs signature and print, signature its own class?

	@Column(name = "key_personnel_date")
	Date keyPersonnelDate;

	@Column(name = "ari_official")
	boolean aRIOfficial;

	@Column(name = "ari_date")
	Date aRIDate;

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

	public Map<Boolean, String> getDisclosureReasons() {
		return disclosureReasons;
	}

	public void setDisclosureReasons(Map<Boolean, String> disclosureReasons) {
		this.disclosureReasons = disclosureReasons;
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

	public String getKeyPersonnelSign() {
		return keyPersonnelSign;
	}

	public void setKeyPersonnelSign(String keyPersonnelSign) {
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