import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conflict_of_interest_pi_non_phs")
public class ConflictOfInterestPINonPHS{

	@Column
	Long id;
	@Column(name = "subaward_with_federal_agency_pass_through")
	String subawardWithFederalAgencyPassThrough;
	@Column(name = "disclosure_reason")
	String disclosureReason; //new proposal, continuation/additional funding, new/change investigator, new interest obtained, new sponsor on existing project, request from irb, no cost time extension, other
	@Column(name = "proposal_title")
	String proposalTitle; //uncertain field
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
	long irbACUibcNos; //what is this
	
//disclosure and certification
	@Column(name = "significant_financial_interest")
	boolean significantFinancialInterest;
	//if above true
	@ElementCollection
	boolean[] significantFinancialInterestReason;
	@ElementCollection
	boolean[] significantFinancialInterestDoesNotInclude; //not sure 
	
	@Column(name = "other_personnel_contribution")
	boolean otherPersonnelContribution;
	//if above true
	@ElementCollection
	List<User> namesOfOtherInvestigators;
	@Column(name = "pi_signature")
	Signature piSignature;
	@Column(name = "signature_date")
	Date signatureDate;
	@Column(name = "pi_name")
	User piName;
	@Column(name = "ari_official_approved")
	boolean ARIOfficialApproved;
	@Column(name = "ari_official")
	String ARIOfficial; //is this a signature or a print name?
	@Column(name = "ari_date")
	Date ARIDate;
	
}