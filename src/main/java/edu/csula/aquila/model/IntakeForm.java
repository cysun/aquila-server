package edu.csula.aquila.model;

import java.util.List;
import java.util.Map;

public class IntakeForm {
	//A
	 String principleInvestogator;
	 String department;
	 String college;
	 String projectTitle;
	 double proposedFundingAmount;
	//B
	List<IntakePersonnel> Personnel;
	//C 
	boolean	anticipatedStipend;
	Map<String,String> Stipends;
	boolean facultyStudentResearchCreativeActivities;
	boolean studentsInResearch;
	int noOfUndergradStudents;
	int noOfGradStudents;
	boolean laboratoryAssistance;
	boolean dataCollection;
	boolean reportWriting;
	boolean literatureReview;
	boolean codingOrDataEntry;
	boolean  presentation;
	boolean archivalResearch;
	boolean dataAnalysis;
	boolean otherActivities;
	List<String> otherActivitiesList;

	//D
	List<IntakeSubGrantSubContract> subGrantsOrSubContracts;
	//E
	List<IntakeProjectLocation> projectLocations;
	//F
	List<IntakeAdditionalParty> additionalInvolvedParties;
	//G
	int agencyCostRatePercentage;
	boolean agencyCostSharing;
	boolean piCostSharing;
	int computersRequested;
	Map<String,Double> requestedEquipment;
	//H
	List<IntakeSpace> spaces;
	//I
	Map<String,String> hazardousSubstances;
	//J
	boolean humanSubject;
	boolean vertebrateAnimals;
	String questionareField;
	String categoryTitle;
	//K
	boolean assistanceWithProposalDevelopment;
	boolean technicalAssistance;
	boolean letterOfSupportPresident;
	boolean letterOfSupportProvost;
	boolean letterOfSupportAssocVPOfReearch;
	boolean duplicationfFinalDocumentPackage;
	int noOfCopies;
	//L
	String summary;
}
