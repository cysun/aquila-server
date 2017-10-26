public class ConflictOfInterestPINonPHS{

	long id;
	String subawardWithFederalAgencyPassThrough;
	String disclosureReason; //new proposal, continuation/additional funding, new/change investigator, new interest obtained, new sponsor on existing project, request from irb, no cost time extension, other
	String proposalTitle; //uncertain field
	Date budgetPeriodStart;
	Date budgetPeriodEnd;
	Date projectPeriodStart;
	Date projectPeriodEnd;
	double amountRequested;
	long irbACUibcNos; //what is this
	
//disclosure and certification

	boolean significantFinancialInterest;
	//if above true
	boolean[] significantFinancialInterestReason;
	boolean[] significantFinancialInterestDoesNotInclude; //not sure 
	
	
	boolean otherPersonnelContribution;
	//if above true
	List<User> namesOfOtherInvestigators;
	Signature piSignature;
	Date signatureDate;
	User piName;
	boolean ARIOfficial;
	String ARIOfficia; //is this a signature or a print name?
	Date ARIDate;
	
}