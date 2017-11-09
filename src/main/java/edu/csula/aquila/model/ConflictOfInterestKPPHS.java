package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.*;

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
@Table(name = "conflict_of_interest_phs")
public class ConflictOfInterestKPPHS implements Serializable{

	//identical to Non PHS, excludes bool subaward, sponsor as Map<Boolean,String>
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "pi")
	private User pI;

	@Column(name="proposal_number")
	private long proposalNumber;

	@Column(name="proposal_title")
	private String proposalTitle; //come from intake??

	@ElementCollection
	@MapKeyColumn(name="sponsor_type")
	@Column(name="sponsor_name")
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
	private Integer amountRequested;

	@Column
	private long iRBACUCIBCNo; //name unclear

	@Column(name = "significant_fin_interest")
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
	@OneToOne(mappedBy="conflictOfInterestKPPHS")
	Proposal proposalForm;
	
	public ConflictOfInterestKPPHS() {}

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

	public Integer getAmountRequested() {
		return amountRequested;
	}

	public void setAmountRequested(Integer amountRequested) {
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