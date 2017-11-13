package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conflict_of_interest_phs")
class ConflictOfInterestPHS implements Serializable{

	//identical to Non PHS, excludes bool subaward, sponsor as Map<Boolean,String>
	
	@Id
	@GeneratedValue
	@Column(name="conflict_of_interest_phs_id")
	private Long id;
	
	@Column(name = "pi")
	private User pI;
	
	@Column(name = "proposal_number")
	private long proposalNumber;
	
	@Column(name = "proposal_title")
	private String proposalTitle; //come from intake??
	
	@ElementCollection
	@MapKeyColumn(name="sponsor_name")
	@Column(name="is_sponsor")
	private Map<Boolean,String> sponsor;
	
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
	
	@Column(name="irb_iacuc_ibc_no")
	private long iRBACUCIBCNo; //name unclear
	
	@Column(name = "siginificant_financial_interest")
	boolean significantFinInterest;
	
	@Column(name = "key_personnel_sign")
	private Signature keyPersonnelSign; 
	
	@Column(name = "key_personnel_date")
	Date keyPersonnelDate;
	
	@Column(name = "ari_official")
	boolean aRIOfficial;
	
	@Column(name = "ari_date")
	Date aRIDate;
	
	//proposal relationship
	@OneToOne(mappedBy="coi_phs")
	Proposal proposalForm;

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
	
	
	public Map<Boolean, String> getSponsor() {
		return sponsor;
	}

	public void setSponsor(Map<Boolean, String> sponsor) {
		this.sponsor = sponsor;
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