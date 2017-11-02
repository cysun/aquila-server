package edu.csula.aquila.model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "intake_form")
public class IntakeForm {
	
	@Id
	@GeneratedValue
	Long id;
	//A
	@Column(name = "pi")
	String principleInvestogator;
	@Column
	String department;
	@Column
	String college;
	@Column(name = "project_title")
	String projectTitle;
	@Column(name = "proposed_funding_amount")
	Integer proposedFundingAmount;
	@Column(name = "start_date")
	Date startDate;
	@Column(name = "end_date")
	Date endDate;
	//B
	
	@OneToMany
	List<Personnel> Personnel;
	//C 
	
	@Column(name = "anticipate_stipend")
	boolean	anticipateStipend;
	
	@Column(name = "stipends")
	String stipends;
	
	@Column(name = "faculty_student_research_creative_activities")
	boolean facultyStudentResearchCreativeActivities;
	
	@Column(name = "students_in_research")
	boolean studentsInResearch;
	
	@Column(name = "number_of_undergrad_students")
	int noOfUndergradStudents;
	
	@Column(name = "number_of_graduate_students")
	int noOfGradStudents;
	
	@Column(name = "lab_assistance")
	boolean laboratoryAssistance;
	
	@Column(name = "data_collection")
	boolean dataCollection;
	
	@Column(name = "report_writing")
	boolean reportWriting;
	
	@Column(name = "literature_review")
	boolean literatureReview;
	
	@Column(name = "coding_or_data_entry")
	boolean codingOrDataEntry;
	
	@Column
	boolean presentation;
	
	@Column(name = "archival_research")
	boolean archivalResearch;
	
	@Column(name = "data_analysis")
	boolean dataAnalysis;
	
	@Column(name = "other_activities")
	boolean otherActivities;
	
	@ElementCollection
	@Column(name = "other_activities")
	List<String> otherActivitiesList;

	//D
	@OneToMany
	List<SubGrantSubContract> subGrantsOrSubContracts;
	//E
	@OneToMany
	List<ProjectLocation> projectLocations;
	//F
	@OneToMany
	List<AdditionalParty> additionalInvolvedParties;
	//G
	@Column(name = "agency_cost_rate_percentage")
	int agencyCostRatePercentage;
	
	@Column(name = "agency_cost_sharing")
	boolean agencyCostSharing;
	
	@Column(name = "pi_cost_sharing")
	boolean piCostSharing;
	
	@Column(name = "computers_requested")
	int computersRequested;
	
	@ElementCollection //fixed you can follow this example for all other maps
	@MapKeyColumn(name="equipment_name")
	@Column(name = "amount")
	@CollectionTable(name="requested_equipment", joinColumns=@JoinColumn(name="id"))
	Map<String,Double> requestedEquipment;
	//H
	
	@ElementCollection
	List<Space> spaces;
	//I
	
	@ElementCollection
	@Column
	Map<String,String> hazardousSubstances;
	//J
	@Column(name = "human_subject")
	boolean humanSubject;
	@Column(name = "vertebrate_animals")
	boolean vertebrateAnimals;
	
	@Column(name = "questionaire")
	String questionaireField;
	@Column(name = "category_title")
	String categoryTitle;
	//K
	@Column(name = "assistance_with_proposal_development")
	boolean assistanceWithProposalDevelopment;
	@Column(name = "technical_assistance")
	boolean technicalAssistance;
	@Column(name = "letter_of_support_president")
	boolean letterOfSupportPresident;
	@Column(name = "letter_of_support_provost")
	boolean letterOfSupportProvost;
	@Column(name = "letter_of_support_assoc_vp_of_research")
	boolean letterOfSupportAssocVPOfResearch;
	@Column(name = "duplication_of_final_document_package")
	boolean duplicationfFinalDocumentPackage;
	@Column(name = "number_of_copies")
	int noOfCopies;
	//L
	@Column
	String summary;
	
	
	//inner classes
	
	
	//create as different tables if needed
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
