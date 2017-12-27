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
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "intake_form")
public class IntakeForm implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="intake_form_id")
	Long id;
	
	private int progress;
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
	
	@OneToMany(mappedBy="intake")
	@Column(name="personnel")
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
	@OneToMany(mappedBy="intake")
	@Column(name="subgrants_or_subcontracts")
	List<SubGrantSubContract> subGrantsOrSubContracts;
//	//E
	@OneToMany(mappedBy="intake")
	@Column(name="project_locations")
	List<ProjectLocation> projectLocations;
//	//F
	@OneToMany(mappedBy="intake")
	@Column(name="additional_involved_parties")
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
//	//H
//	
	@OneToMany(mappedBy="intake")
	@Column(name="spaces")
	List<Space> spaces;
//	//I
//	
	@ElementCollection
	@MapKeyColumn(name="name_of_agent")
	@Column(name="substance_type")
	@CollectionTable(name="hazardous_substances", joinColumns=@JoinColumn(name="id"))
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
	
	//proposal relationship
//	@OneToOne(mappedBy="intakeForm")
//	Proposal proposal;
	
	
	//inner classes
	
	
	//create as different tables if needed
	@Entity
	@Table(name = "personnel")
	public class Personnel implements Serializable{
		
		@Id
		@GeneratedValue
		@Column(name="personnel_id")
		Long Id;
		
		@ManyToOne
		IntakeForm intake;
		
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
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
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
		public void setUnits(int units) {
			this.units = units;
		}
		public int getPercentOfTimeProposed() {
			return percentOfTimeProposed;
		}
		public void setPercentOfTimeProposed(int percentOfTimeProposed) {
			this.percentOfTimeProposed = percentOfTimeProposed;
		}
		
		
	}
	@Entity
	@Table(name = "additional_party")
	public class AdditionalParty implements Serializable{
		@Id
		@GeneratedValue
		@Column(name="additional_party_id")
		Long Id;
		@ManyToOne
		IntakeForm intake;
		@Column(name = "party_name")
		 String partyName;
		@Column
		 String supervisor;
		@Column(name = "explanation_of_involvement") 
		String explanationOfInvolvement;
		

		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getPartyName() {
			return partyName;
		}
		public void setPartyName(String partyName) {
			this.partyName = partyName;
		}
		public String getSupervisor() {
			return supervisor;
		}
		public void setSupervisor(String supervisor) {
			this.supervisor = supervisor;
		}
		public String getExplanationOfInvolvement() {
			return explanationOfInvolvement;
		}
		public void setExplanationOfInvolvement(String explanationOfInvolvement) {
			this.explanationOfInvolvement = explanationOfInvolvement;
		}
	}
	@Entity
	@Table(name = "project_location")
	public class ProjectLocation implements Serializable{
		@Id
		@GeneratedValue
		@Column(name="project_location_id")
		Long Id;
		@ManyToOne
		IntakeForm intake;
		@Column(name = "site_name")
		 String siteName;
		@Column(name = "site_address")
		 String siteAddress;
		@Column(name = "projected_percent_of_time_at_site")
		 int projectedPercentOfTimeAtSite;
		@Column(name = "on_campus_space_or_on_campus_rental_needed")
		 boolean onCampusSpaceOrOnCampusRentalNeeded;
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getSiteName() {
			return siteName;
		}
		public void setSiteName(String siteName) {
			this.siteName = siteName;
		}
		public String getSiteAddress() {
			return siteAddress;
		}
		public void setSiteAddress(String siteAddress) {
			this.siteAddress = siteAddress;
		}
		public int getProjectedPercentOfTimeAtSite() {
			return projectedPercentOfTimeAtSite;
		}
		public void setProjectedPercentOfTimeAtSite(int projectedPercentOfTimeAtSite) {
			this.projectedPercentOfTimeAtSite = projectedPercentOfTimeAtSite;
		}
		public boolean isOnCampusSpaceOrOnCampusRentalNeeded() {
			return onCampusSpaceOrOnCampusRentalNeeded;
		}
		public void setOnCampusSpaceOrOnCampusRentalNeeded(boolean onCampusSpaceOrOnCampusRentalNeeded) {
			this.onCampusSpaceOrOnCampusRentalNeeded = onCampusSpaceOrOnCampusRentalNeeded;
		}
		
		
	}
	
	@Entity
	@Table(name = "space")
	public class Space implements Serializable{
		@Id
		@GeneratedValue
		@Column(name="space_id")
		Long Id;
		@ManyToOne
		IntakeForm intake;
		@Column
		 String item;
		@Column(name = "type_of_space")
		 String typeOfSpace;
		@Column(name = "source_of_funds")
		 String sourceOfFunds;
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public String getTypeOfSpace() {
			return typeOfSpace;
		}
		public void setTypeOfSpace(String typeOfSpace) {
			this.typeOfSpace = typeOfSpace;
		}
		public String getSourceOfFunds() {
			return sourceOfFunds;
		}
		public void setSourceOfFunds(String sourceOfFunds) {
			this.sourceOfFunds = sourceOfFunds;
		}
		
		
	}
	
	@Entity
	@Table(name = "subgrant_subcontract")
	public class SubGrantSubContract implements Serializable{
		@Id
		@GeneratedValue
		@Column(name="subgrant_subcontract_id")
		Long Id;
		
		@ManyToOne
		IntakeForm intake;
		@Column(name = "institution_name")
		String institutionName;
		@Column
		String address;
		@Column(name = "proposed_funding_amount")
		double proposedFundingAmount;
		@Column(name = "contact_person")
		String contactPerson;
		@Column(name = "contact_info")
		String contactInfo;
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getInstitutionName() {
			return institutionName;
		}
		public void setInstitutionName(String institutionName) {
			this.institutionName = institutionName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public double getProposedFundingAmount() {
			return proposedFundingAmount;
		}
		public void setProposedFundingAmount(double proposedFundingAmount) {
			this.proposedFundingAmount = proposedFundingAmount;
		}
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		public String getContactInfo() {
			return contactInfo;
		}
		public void setContactInfo(String contactInfo) {
			this.contactInfo = contactInfo;
		}
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public String getPrincipleInvestogator() {
		return principleInvestogator;
	}

	public void setPrincipleInvestogator(String principleInvestogator) {
		this.principleInvestogator = principleInvestogator;
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

	public boolean isAnticipateStipend() {
		return anticipateStipend;
	}

	public void setAnticipateStipend(boolean anticipateStipend) {
		this.anticipateStipend = anticipateStipend;
	}

	public String getStipends() {
		return stipends;
	}

	public void setStipends(String stipends) {
		this.stipends = stipends;
	}

	public boolean isFacultyStudentResearchCreativeActivities() {
		return facultyStudentResearchCreativeActivities;
	}

	public void setFacultyStudentResearchCreativeActivities(boolean facultyStudentResearchCreativeActivities) {
		this.facultyStudentResearchCreativeActivities = facultyStudentResearchCreativeActivities;
	}

	public boolean isStudentsInResearch() {
		return studentsInResearch;
	}

	public void setStudentsInResearch(boolean studentsInResearch) {
		this.studentsInResearch = studentsInResearch;
	}

	public int getNoOfUndergradStudents() {
		return noOfUndergradStudents;
	}

	public void setNoOfUndergradStudents(int noOfUndergradStudents) {
		this.noOfUndergradStudents = noOfUndergradStudents;
	}

	public int getNoOfGradStudents() {
		return noOfGradStudents;
	}

	public void setNoOfGradStudents(int noOfGradStudents) {
		this.noOfGradStudents = noOfGradStudents;
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

	public boolean isPresentation() {
		return presentation;
	}

	public void setPresentation(boolean presentation) {
		this.presentation = presentation;
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

	public boolean isHumanSubject() {
		return humanSubject;
	}

	public void setHumanSubject(boolean humanSubject) {
		this.humanSubject = humanSubject;
	}

	public boolean isVertebrateAnimals() {
		return vertebrateAnimals;
	}

	public void setVertebrateAnimals(boolean vertebrateAnimals) {
		this.vertebrateAnimals = vertebrateAnimals;
	}

	public String getQuestionaireField() {
		return questionaireField;
	}

	public void setQuestionaireField(String questionaireField) {
		this.questionaireField = questionaireField;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	
}
