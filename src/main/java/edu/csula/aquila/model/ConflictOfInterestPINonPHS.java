package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conflict_of_interest_pi_non_phs")
public class ConflictOfInterestPINonPHS implements Serializable{

	@Id
	@GeneratedValue
	Long Id;
	
	@Column(name = "subaward_with_federal_agency_pass_through")
	private String subawardWithFederalAgencyPassThrough;
	
	@Column(name = "disclosure_reason")
	private String disclosureReason; //new proposal, continuation/additional funding, new/change investigator, new interest obtained, new sponsor on existing project, request from irb, no cost time extension, other
	
	@Column(name = "proposal_title")
	private String proposalTitle; //uncertain field
	
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
	private long irbACUibcNos; //what is this
	
	//disclosure and certification
	@Column(name = "significant_financial_interest")
	private boolean significantFinancialInterest;
	
	//if above true
	@ElementCollection
	@Column(name = "significant_financial_interest_reason")
	private List<Boolean> significantFinancialInterestReason;
	
	@ElementCollection
	@Column(name = "significant_financial_interest_reason_does_not_include")
	private List<Boolean> significantFinancialInterestDoesNotInclude; //not sure 

	
	@Column(name = "other_personnel_contribution")
	private boolean otherPersonnelContribution;
	
	//if above true
	@OneToMany(mappedBy ="coiPiNonPHS")
	@Column(name = "names_of_other_investigators")
	List<User> namesOfOtherInvestigators;
	
	@Column(name = "pi_signature")
	private Signature piSignature;
	
	@Column(name = "signature_date")
	private Date signatureDate;
	
	@Column(name = "pi_name")
	private User piName;
	
	@Column(name = "ari_official_approved")
	private boolean ARIOfficialApproved;
	
	@Column(name = "ari_official")
	private String ARIOfficial; //is this a signature or a print name?
	
	@Column(name = "ari_date")
	private Date ARIDate;
	
	//proposal relationship
	@OneToOne(mappedBy="conflictOfInterestPINonPHS")
	Proposal proposalForm;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getSubawardWithFederalAgencyPassThrough() {
		return subawardWithFederalAgencyPassThrough;
	}
	public void setSubawardWithFederalAgencyPassThrough(String subawardWithFederalAgencyPassThrough) {
		this.subawardWithFederalAgencyPassThrough = subawardWithFederalAgencyPassThrough;
	}
	public String getDisclosureReason() {
		return disclosureReason;
	}
	public void setDisclosureReason(String disclosureReason) {
		this.disclosureReason = disclosureReason;
	}
	public String getProposalTitle() {
		return proposalTitle;
	}
	public void setProposalTitle(String proposalTitle) {
		this.proposalTitle = proposalTitle;
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
	public long getIrbACUibcNos() {
		return irbACUibcNos;
	}
	public void setIrbACUibcNos(long irbACUibcNos) {
		this.irbACUibcNos = irbACUibcNos;
	}
	public boolean isSignificantFinancialInterest() {
		return significantFinancialInterest;
	}
	public void setSignificantFinancialInterest(boolean significantFinancialInterest) {
		this.significantFinancialInterest = significantFinancialInterest;
	}
	
	public List<Boolean> getSignificantFinancialInterestReason() {
		return significantFinancialInterestReason;
	}
	public void setSignificantFinancialInterestReason(List<Boolean> significantFinancialInterestReason) {
		this.significantFinancialInterestReason = significantFinancialInterestReason;
	}
	public List<Boolean> getSignificantFinancialInterestDoesNotInclude() {
		return significantFinancialInterestDoesNotInclude;
	}
	public void setSignificantFinancialInterestDoesNotInclude(List<Boolean> significantFinancialInterestDoesNotInclude) {
		this.significantFinancialInterestDoesNotInclude = significantFinancialInterestDoesNotInclude;
	}
	public boolean isOtherPersonnelContribution() {
		return otherPersonnelContribution;
	}
	public void setOtherPersonnelContribution(boolean otherPersonnelContribution) {
		this.otherPersonnelContribution = otherPersonnelContribution;
	}
	
	public List<User> getNamesOfOtherInvestigators() {
		return namesOfOtherInvestigators;
	}
	public void setNamesOfOtherInvestigators(List<User> namesOfOtherInvestigators) {
		this.namesOfOtherInvestigators = namesOfOtherInvestigators;
	}
	public Signature getPiSignature() {
		return piSignature;
	}
	public void setPiSignature(Signature piSignature) {
		this.piSignature = piSignature;
	}
	public Date getSignatureDate() {
		return signatureDate;
	}
	public void setSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
	}
	public User getPiName() {
		return piName;
	}
	public void setPiName(User piName) {
		this.piName = piName;
	}
	public boolean isARIOfficialApproved() {
		return ARIOfficialApproved;
	}
	public void setARIOfficialApproved(boolean aRIOfficialApproved) {
		ARIOfficialApproved = aRIOfficialApproved;
	}
	public String getARIOfficial() {
		return ARIOfficial;
	}
	public void setARIOfficial(String aRIOfficial) {
		ARIOfficial = aRIOfficial;
	}
	public Date getARIDate() {
		return ARIDate;
	}
	public void setARIDate(Date aRIDate) {
		ARIDate = aRIDate;
	}
	
	
	
}