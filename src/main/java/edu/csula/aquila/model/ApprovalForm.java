package edu.csula.aquila.model;

import java.util.Date;
import java.util.List;

public class ApprovalForm {
	// 1-4
	String projectTitle;
	String pIName;// ?
	String email;
	String college;// ?
	String department;// ?
	Date deadlineDate;
	Date preparedDate;
	String preparedBy;// ?
	// 5
	// need help
	// 6
	boolean additionalSpace;
	boolean vertebrateAnimal;
	boolean biologicalHazards;
	boolean conflictOfInterestStatement;
	boolean humanSubjects;
	boolean radiologicalHazards;
	boolean computerEquipment;
	boolean recombinantDNA;
	String additionalSpaceApproved;
	String vertebrateAnimalApproved;
	String biologicalHazardsApproved;
	String conflictOfInterestStatementApproved;
	String humanSubjectsApproved;
	String radiologicalHazardsApproved;
	String computerEquipmentApproved;
	String recombinantDNAApproved;

	// 7
	Signature piSignature;
	Date piSignatureDate;
	Signature chairSignature;
	Date chairSignatureDate;
	Signature collegeDeanSignature;
	Date collegeSignatureDate;
	// UCS
	boolean universityCostSharing;
	Signature provostAndVPForAcademicAffairs;
	Date provostAndVPForAcademicAffairsSignature;
	Signature deanOfCollegeOrDesignee;
	Date deanOfCollegeOrDesigneeSignature;
	// 8
	Signature directorSignature;
	Date directorSignatureDate;
	Signature avpSignature;
	Date avpSignatureDate;
	Signature UASExecDirectorSignature;
	Date UASExecDirectorSignatureDate;
	Signature chiefFinancialOfficerSignature;
	Date chiefFinancialOfficerSignatureDate;

	// 9
	boolean costSharingRequired;
	List<College> costSharingColleges;
	double totalOfColleges;
	double calStateLACostSharing;
	double unRecoveredFACostSharing;
	double unRecoveredFAMTDC;
	double thirdParyCostShare;
	double totalCalStateLACostSharing;
	double totalProposalCostSharing;
	List<String> InternalNotes;

	// 10
	Signature proposalPersonnelSignature;
	Signature departmentChairSignature;
	Date departmentChairSignatureDate;
	Signature deanSignature;
	Date deanSignatureDate;

	// 11
	String uasProjectId;
	float proposalCode;
	List<String> coPis;
	String typeOfProposal;
	String typeOfGrantContracts;
	String purposeOfProject;
	int cfdaNumber;
	//innerclass
	public class College {
		 double personelCost;
		 double fringeCost;
		 double meetingExpenses;
		 double totalCost;
	}
}
