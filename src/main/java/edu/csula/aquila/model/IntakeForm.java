package edu.csula.aquila.model;

import java.util.List;
import java.util.Map;
import java.util.Date;

public class IntakeForm {
	long id;
	//A
	 String principleInvestogator;
	 String department;
	 String college;
	 String projectTitle;
	 Integer proposedFundingAmount;
	 Date startDate;
	 Date endDate;
	//B
	List<Personnel> Personnel;
	//C 
	boolean	anticipateStipend;
	String stipends;
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
	List<SubGrantSubContract> subGrantsOrSubContracts;
	//E
	List<ProjectLocation> projectLocations;
	//F
	List<AdditionalParty> additionalInvolvedParties;
	//G
	int agencyCostRatePercentage;
	boolean agencyCostSharing;
	boolean piCostSharing;
	int computersRequested;
	Map<String,Double> requestedEquipment;
	//H
	List<Space> spaces;
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
	//inner classes
	public class Personnel{
		 String name;
		 String employer;
		 String positionTitleOnGrant;
		 int units;
		 int percentOfTimeProposed;
	}
	public class AdditionalParty {
		 String partyName;
		 String supervisor;
		 String explanationOfInvolvement;
	}
	public class ProjectLocation {
		 String siteName;
		 String siteAddress;
		 int projectedPercentOfTimeAtSite;
		 boolean onCampusSpaceOrOnCampusRentalNeeded;
	}
	public class Space {
		 String item;
		 String typeOFSpace;
		 String sourceOfFunds;
	}
	public class SubGrantSubContract {
		String institutionName;
		String address;
		double proposedFundingAmount;
		String contactPerson;
		String contactInfo;
	}

	
}
