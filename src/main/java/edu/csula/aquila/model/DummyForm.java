package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "dummy_form")
public class DummyForm implements Serializable {

	private static final long serialVersionUID = 3L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dummy_form_id")
	Long id;

	// A
	@Column(name = "pi")
	String principleInvestigator;

	@Column
	String department;

	@Column
	String college;

	@Column(name = "project_title")
	String projectTitle;

	@Column(name = "proposed_funding_amount")
	Integer proposedFundingAmount;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "start_date")
	Date startDate;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "end_date")
	Date endDate;

	// B
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "dummy_form_id", nullable = true)
	List<DummyPersonnel> dummyPersonnel;

	//C
	
	//Question 1: 
	//Do you anticipate any participation stipends as a part 
	//of your proposal?
	@Column(name = "anticipate_stipend")
	boolean	anticipateStipend;
	
	//Question 2:
	//If Yes, please identitify type of Stipend:
	//Study Participant, Student Tuition, Books, Travel, etc.
	//and provide your Participation Stipend eligiblity criteria
	//and selection process below
	@Column(name = "stipend")
	String stipend;
	
	//Question 3:
	//Faculty-Student Research/Creative Activities
	@Column(name = "faculty_student_research_creative_activities")
	boolean facultyStudentResearchCreativeActivities;
	
	//If Yes, please answer the following two sections:
	//Will this project actively involve students in
	//Research, Scholarly, or Creative Activities (RSCA)
	//including non-paid activities?
	@Column(name = "students_involved")
	boolean studentsInvolved;
	
	//How many Graduate Students?
	@Column(name = "number_of_graduate_students")
	int noOfGradStudents;

	//How many Undergrad Students?
	@Column(name = "number_of_undergrad_students")
	int noOfUndergradStudents;
	
	//What Types of RSCA activities will be incorporated?
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
	boolean presentations;
	
	@Column(name = "archival_research")
	boolean archivalResearch;
	
	@Column(name = "data_analysis")
	boolean dataAnalysis;
	
	@Column(name = "other_activities")
	boolean otherActivities;
	
	//if other activities is true, then list the names of activities
	@ElementCollection
	@Column(name = "other_activities")
	List<String> otherActivitiesList;
	
	//D
	//inner class and requests need to be implemented
	
	//E
	//inner class and requests need to be implemented
	
	//F
	//inner class and requests need to be implemented
	
	//G
	//Agency's F&A (Indirect) Cost Rate
	//IF THIS ATTRIBUTE IS LESS THAN 46
	//INFORM THE USER(PI) TO CONTACT
	//THE ASSOCIATE VICE PRESIDENT FOR RESEARCH
	@Column(name = "agency_cost_rate_percentage")
	int agencyCostRatePercentage;
	
	//IF THE NEXT TWO ATTRIBUTES ARE TRUE INFORM USER(PI)
	//TO INFORM DEPT CHAIR, COLLEGE DEAN/ASSOCIATE DEAN
	//ASSOCIATE VICE PRESIDENT FOR RESEARCH
	
	//Is costsharing required by the agency?
	@Column(name = "agency_cost_sharing")
	boolean agencyCostSharing;
	
	//Is costsharing requested by the PI?
	@Column(name = "pi_cost_sharing")
	boolean piCostSharing;
	
	//Computers to be requested. How Many?
	@Column(name = "computers_requested")
	int computersRequested;
	
	//Equipment to be requested. How Many?
	@ElementCollection //fixed you can follow this example for all other maps
	@MapKeyColumn(name="equipment_name")
	@Column(name = "amount")
	@CollectionTable(name="requested_equipment", joinColumns=@JoinColumn(name="id"))
	Map<String,Integer> requestedEquipment;
	
	//H
	//inner class and request need to be implemented
	
	//I
	//Hazardous Substances
	//Inform the User(PI) to consult with EHS
	//to obtain proper clearance or confirmation of approval
	//to work with hazardous agents
	@ElementCollection
	@MapKeyColumn(name="name_of_agent")
	@Column(name="substance_type")
	@CollectionTable(name="hazardous_substances", joinColumns=@JoinColumn(name="id"))
	Map<String,String> hazardousSubstances;
	
	//J
	//Human Subjects?
	//If true, inform User(PI) to consult with IRB Compliance Specialist
	@Column(name = "human_subjects")
	boolean humanSubjects;
	
	//Vertebrate Animals?
	//If true, inform User(PI) to consult with IACUC Compliance Specialist
	@Column(name = "vertebrate_animals")
	boolean vertebrateAnimals;
	
	//National Center for Education Statistics (NCES)
	//Classification of Instructional Programs (CIP)
	//*see separate "Crosswalk" handout for Science, Engineering,
	//and non-Science, non-Engineering Fields
	@Column(name = "questionnaire")
	String questionnaireField;
	@Column(name = "cip_category_title")
	String cipCategoryTitle;
	@Column(name = "cip_classification")
	String cipClassification;
	
	//K
	
	//Assistance with proposal development(e.g. conceptualization, writing, editing)
	//If true, inform User(PI) to contact UAS Grants & Contracts
	//and/or the Associate Vice President for Research at least
	//one month in advance
	@Column(name = "assistance_with_proposal_development")
	boolean assistanceWithProposalDevelopment;
	
	//Technical Assistance
	@Column(name = "technical_assistance")
	boolean technicalAssistance;
	
	//Letters of Support
	//President
	@Column(name = "letter_of_support_president")
	boolean letterOfSupportPresident;
	
	//Provost
	@Column(name = "letter_of_support_provost")
	boolean letterOfSupportProvost;
	
	//Associate Vice President for Research
	@Column(name = "letter_of_support_assoc_vp_of_research")
	boolean letterOfSupportAssocVPOfResearch;

	//Duplication of final document package
	@Column(name = "duplication_of_final_document_package")
	boolean duplicationfFinalDocumentPackage;
	
	//# of copies needed for your files
	@Column(name = "number_of_copies")
	int noOfCopies;
	
	
	//L
	@Column(name = "project_summary")
	String projectSummary;
	
	// proposal relationship
	@JsonIgnore
	@OneToOne(mappedBy = "dummyForm")
	Proposal proposal;

	public DummyForm() {
	}



	public DummyForm(Long id, String principleInvestigator, String department, String college, String projectTitle,
			Integer proposedFundingAmount, Date startDate, Date endDate, List<DummyPersonnel> dummyPersonnel,
			boolean anticipateStipend, String stipend, boolean facultyStudentResearchCreativeActivities,
			boolean studentsInvolved, int noOfGradStudents, int noOfUndergradStudents, boolean laboratoryAssistance,
			boolean dataCollection, boolean reportWriting, boolean literatureReview, boolean codingOrDataEntry,
			boolean presentations, boolean archivalResearch, boolean dataAnalysis, boolean otherActivities,
			List<String> otherActivitiesList, int agencyCostRatePercentage, boolean agencyCostSharing,
			boolean piCostSharing, int computersRequested, Map<String, Integer> requestedEquipment,
			Map<String, String> hazardousSubstances, boolean humanSubjects, boolean vertebrateAnimals,
			String questionnaireField, String cipCategoryTitle, String cipClassification,
			boolean assistanceWithProposalDevelopment, boolean technicalAssistance, boolean letterOfSupportPresident,
			boolean letterOfSupportProvost, boolean letterOfSupportAssocVPOfResearch,
			boolean duplicationfFinalDocumentPackage, int noOfCopies, String projectSummary) {
		this.principleInvestigator = principleInvestigator;
		this.department = department;
		this.college = college;
		this.projectTitle = projectTitle;
		this.proposedFundingAmount = proposedFundingAmount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dummyPersonnel = dummyPersonnel;
		this.anticipateStipend = anticipateStipend;
		this.stipend = stipend;
		this.facultyStudentResearchCreativeActivities = facultyStudentResearchCreativeActivities;
		this.studentsInvolved = studentsInvolved;
		this.noOfGradStudents = noOfGradStudents;
		this.noOfUndergradStudents = noOfUndergradStudents;
		this.laboratoryAssistance = laboratoryAssistance;
		this.dataCollection = dataCollection;
		this.reportWriting = reportWriting;
		this.literatureReview = literatureReview;
		this.codingOrDataEntry = codingOrDataEntry;
		this.presentations = presentations;
		this.archivalResearch = archivalResearch;
		this.dataAnalysis = dataAnalysis;
		this.otherActivities = otherActivities;
		this.otherActivitiesList = otherActivitiesList;
		this.agencyCostRatePercentage = agencyCostRatePercentage;
		this.agencyCostSharing = agencyCostSharing;
		this.piCostSharing = piCostSharing;
		this.computersRequested = computersRequested;
		this.requestedEquipment = requestedEquipment;
		this.hazardousSubstances = hazardousSubstances;
		this.humanSubjects = humanSubjects;
		this.vertebrateAnimals = vertebrateAnimals;
		this.questionnaireField = questionnaireField;
		this.cipCategoryTitle = cipCategoryTitle;
		this.cipClassification = cipClassification;
		this.assistanceWithProposalDevelopment = assistanceWithProposalDevelopment;
		this.technicalAssistance = technicalAssistance;
		this.letterOfSupportPresident = letterOfSupportPresident;
		this.letterOfSupportProvost = letterOfSupportProvost;
		this.letterOfSupportAssocVPOfResearch = letterOfSupportAssocVPOfResearch;
		this.duplicationfFinalDocumentPackage = duplicationfFinalDocumentPackage;
		this.noOfCopies = noOfCopies;
		this.projectSummary = projectSummary;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrincipleInvestigator() {
		return principleInvestigator;
	}

	public void setPrincipleInvestigator(String principleInvestigator) {
		this.principleInvestigator = principleInvestigator;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public Integer getProposedFundingAmount() {
		return proposedFundingAmount;
	}

	public void setProposedFundingAmount(Integer proposedFundingAmount) {
		this.proposedFundingAmount = proposedFundingAmount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Proposal getProposal() {
		return proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}

	public List<DummyPersonnel> getDummyPersonnel() {
		return dummyPersonnel;
	}

	public void setDummyPersonnel(List<DummyPersonnel> dummyPersonnel) {
		this.dummyPersonnel = dummyPersonnel;
	}

	public void addPersonnel(DummyPersonnel personnel) {
		List<DummyPersonnel> personnelList = getDummyPersonnel();
		personnelList.add(personnel);
		setDummyPersonnel(personnelList);
	}
	
	public boolean isAnticipateStipend() {
		return anticipateStipend;
	}

	public void setAnticipateStipend(boolean anticipateStipend) {
		this.anticipateStipend = anticipateStipend;
	}

	public String getStipend() {
		return stipend;
	}

	public void setStipend(String stipend) {
		this.stipend = stipend;
	}

	public boolean isFacultyStudentResearchCreativeActivities() {
		return facultyStudentResearchCreativeActivities;
	}

	public void setFacultyStudentResearchCreativeActivities(boolean facultyStudentResearchCreativeActivities) {
		this.facultyStudentResearchCreativeActivities = facultyStudentResearchCreativeActivities;
	}

	public boolean isStudentsInvolved() {
		return studentsInvolved;
	}

	public void setStudentsInvolved(boolean studentsInvolved) {
		this.studentsInvolved = studentsInvolved;
	}

	public int getNoOfGradStudents() {
		return noOfGradStudents;
	}

	public void setNoOfGradStudents(int noOfGradStudents) {
		this.noOfGradStudents = noOfGradStudents;
	}

	public int getNoOfUndergradStudents() {
		return noOfUndergradStudents;
	}

	public void setNoOfUndergradStudents(int noOfUndergradStudents) {
		this.noOfUndergradStudents = noOfUndergradStudents;
	}

	public boolean isLaboratoryAssistance() {
		return laboratoryAssistance;
	}

	public void setLaboratoryAssistance(boolean laboratoryAssistance) {
		this.laboratoryAssistance = laboratoryAssistance;
	}

	public boolean isDataCollection() {
		return dataCollection;
	}

	public void setDataCollection(boolean dataCollection) {
		this.dataCollection = dataCollection;
	}

	public boolean isReportWriting() {
		return reportWriting;
	}

	public void setReportWriting(boolean reportWriting) {
		this.reportWriting = reportWriting;
	}

	public boolean isLiteratureReview() {
		return literatureReview;
	}

	public void setLiteratureReview(boolean literatureReview) {
		this.literatureReview = literatureReview;
	}

	public boolean isCodingOrDataEntry() {
		return codingOrDataEntry;
	}

	public void setCodingOrDataEntry(boolean codingOrDataEntry) {
		this.codingOrDataEntry = codingOrDataEntry;
	}

	public boolean isPresentations() {
		return presentations;
	}

	public void setPresentations(boolean presentations) {
		this.presentations = presentations;
	}

	public boolean isArchivalResearch() {
		return archivalResearch;
	}

	public void setArchivalResearch(boolean archivalResearch) {
		this.archivalResearch = archivalResearch;
	}

	public boolean isDataAnalysis() {
		return dataAnalysis;
	}

	public void setDataAnalysis(boolean dataAnalysis) {
		this.dataAnalysis = dataAnalysis;
	}

	public boolean isOtherActivities() {
		return otherActivities;
	}

	public void setOtherActivities(boolean otherActivities) {
		this.otherActivities = otherActivities;
	}

	public List<String> getOtherActivitiesList() {
		return otherActivitiesList;
	}

	public void setOtherActivitiesList(List<String> otherActivitiesList) {
		this.otherActivitiesList = otherActivitiesList;
	}



	public int getAgencyCostRatePercentage() {
		return agencyCostRatePercentage;
	}



	public void setAgencyCostRatePercentage(int agencyCostRatePercentage) {
		this.agencyCostRatePercentage = agencyCostRatePercentage;
	}



	public boolean isAgencyCostSharing() {
		return agencyCostSharing;
	}



	public void setAgencyCostSharing(boolean agencyCostSharing) {
		this.agencyCostSharing = agencyCostSharing;
	}



	public boolean isPiCostSharing() {
		return piCostSharing;
	}



	public void setPiCostSharing(boolean piCostSharing) {
		this.piCostSharing = piCostSharing;
	}



	public int getComputersRequested() {
		return computersRequested;
	}



	public void setComputersRequested(int computersRequested) {
		this.computersRequested = computersRequested;
	}



	public Map<String, Integer> getRequestedEquipment() {
		return requestedEquipment;
	}



	public void setRequestedEquipment(Map<String, Integer> requestedEquipment) {
		this.requestedEquipment = requestedEquipment;
	}



	public Map<String, String> getHazardousSubstances() {
		return hazardousSubstances;
	}



	public void setHazardousSubstances(Map<String, String> hazardousSubstances) {
		this.hazardousSubstances = hazardousSubstances;
	}



	public boolean isHumanSubjects() {
		return humanSubjects;
	}



	public void setHumanSubjects(boolean humanSubjects) {
		this.humanSubjects = humanSubjects;
	}



	public boolean isVertebrateAnimals() {
		return vertebrateAnimals;
	}



	public void setVertebrateAnimals(boolean vertebrateAnimals) {
		this.vertebrateAnimals = vertebrateAnimals;
	}



	public String getQuestionnaireField() {
		return questionnaireField;
	}



	public void setQuestionnaireField(String questionnaireField) {
		this.questionnaireField = questionnaireField;
	}



	public String getCipCategoryTitle() {
		return cipCategoryTitle;
	}



	public void setCipCategoryTitle(String cipCategoryTitle) {
		this.cipCategoryTitle = cipCategoryTitle;
	}



	public String getCipClassification() {
		return cipClassification;
	}



	public void setCipClassification(String cipClassification) {
		this.cipClassification = cipClassification;
	}



	public boolean isAssistanceWithProposalDevelopment() {
		return assistanceWithProposalDevelopment;
	}



	public void setAssistanceWithProposalDevelopment(boolean assistanceWithProposalDevelopment) {
		this.assistanceWithProposalDevelopment = assistanceWithProposalDevelopment;
	}



	public boolean isTechnicalAssistance() {
		return technicalAssistance;
	}



	public void setTechnicalAssistance(boolean technicalAssistance) {
		this.technicalAssistance = technicalAssistance;
	}



	public boolean isLetterOfSupportPresident() {
		return letterOfSupportPresident;
	}



	public void setLetterOfSupportPresident(boolean letterOfSupportPresident) {
		this.letterOfSupportPresident = letterOfSupportPresident;
	}



	public boolean isLetterOfSupportProvost() {
		return letterOfSupportProvost;
	}



	public void setLetterOfSupportProvost(boolean letterOfSupportProvost) {
		this.letterOfSupportProvost = letterOfSupportProvost;
	}



	public boolean isLetterOfSupportAssocVPOfResearch() {
		return letterOfSupportAssocVPOfResearch;
	}



	public void setLetterOfSupportAssocVPOfResearch(boolean letterOfSupportAssocVPOfResearch) {
		this.letterOfSupportAssocVPOfResearch = letterOfSupportAssocVPOfResearch;
	}



	public boolean isDuplicationfFinalDocumentPackage() {
		return duplicationfFinalDocumentPackage;
	}



	public void setDuplicationfFinalDocumentPackage(boolean duplicationfFinalDocumentPackage) {
		this.duplicationfFinalDocumentPackage = duplicationfFinalDocumentPackage;
	}



	public int getNoOfCopies() {
		return noOfCopies;
	}



	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}



	public String getProjectSummary() {
		return projectSummary;
	}



	public void setProjectSummary(String projectSummary) {
		this.projectSummary = projectSummary;
	}



	// Section B needs an inner class of Personnel for each personnel in the list
	// This class contains the name, employer, position, and time of a person
	// working on the project
	@Entity
	@Table(name = "dummy_personnel")
	public static class DummyPersonnel implements Serializable {

		private static final long serialVersionUID = 4L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "dummy_personnel_id")
		Long Id;

		@Column
		String name;
		@Column
		String employer;
		@Column(name = "position_title_on_grant")
		String positionTitleOnGrant;
		@Column
		int units;
		@Column(name = "percent_of_time_proposed")
		int percentOfTimeProposed;

		// relation
		@JsonIgnore
		@ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "dummy_form_id")
		DummyForm dummyForm;

		public DummyPersonnel() {
		}

		public DummyPersonnel(String name, String employer, String positionTitleOnGrant, int units,
				int percentOfTimeProposed) {
			this.name = name;
			this.employer = employer;
			this.positionTitleOnGrant = positionTitleOnGrant;
			this.units = units;
			this.percentOfTimeProposed = percentOfTimeProposed;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmployer() {
			return employer;
		}

		public void setEmployer(String employer) {
			this.employer = employer;
		}

		public String getPositionTitleOnGrant() {
			return positionTitleOnGrant;
		}

		public void setPositionTitleOnGrant(String positionTitleOnGrant) {
			this.positionTitleOnGrant = positionTitleOnGrant;
		}

		public int getUnits() {
			return units;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public void setUnits(int units) {
			this.units = units;
		}

		public int getPercentOfTimeProposed() {
			return percentOfTimeProposed;
		}

		public void setPercentOfTimeProposed(int percentOfTimeProposed) {
			this.percentOfTimeProposed = percentOfTimeProposed;
		}

		public DummyForm getDummyForm() {
			return dummyForm;
		}

		public void setDummyForm(DummyForm dummyForm) {
			this.dummyForm = dummyForm;
		}
	}

}
