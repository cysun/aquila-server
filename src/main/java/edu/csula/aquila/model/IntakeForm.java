package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
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
@Table(name = "intake_form")
public class IntakeForm implements Serializable {

	private static final long serialVersionUID = 3L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intake_form_id")
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
	@JoinColumn(name = "intake_form_id", nullable = true)
	List<Personnel> personnel;

	// C 
	// find in .txt file

	// D 
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "intake_form_id", nullable = true)
	List<SubgrantsOrSubcontracts> subgrantsOrSubcontracts;

	// E
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "intake_form_id", nullable = true)
	List<ProjectLocations> projectLocations;

	// F
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "intake_form_id", nullable = true)
	List<AdditionalPartiesInvolved> additionalPartiesInvolved;
	
	//H
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "intake_form_id", nullable = true)
	List<Space> space;

	// data structure tests

	// List of strings
	@ElementCollection
	@CollectionTable(name = "other_activities", joinColumns = @JoinColumn(name = "intake_form_id"))
	@Column(name = "other_activity")
	List<String> otherActivitiesList;

	// Map of string and integer
	@ElementCollection // fixed you can follow this example for all other maps
	@MapKeyColumn(name = "equipment_name")
	@Column(name = "amount")
	@CollectionTable(name = "requested_equipment", joinColumns = @JoinColumn(name = "requested_equipment_id"))
	Map<String, Integer> requestedEquipment;

	// Map of String and string
	@ElementCollection
	@MapKeyColumn(name = "name_of_agent")
	@Column(name = "substance_type")
	@CollectionTable(name = "hazardous_substances", joinColumns = @JoinColumn(name = "hazardous_substances_id"))
	Map<String, String> hazardousSubstances;

	// proposal relationship
	@JsonIgnore
	@OneToOne(mappedBy = "intakeForm")
	Proposal proposal;

	public IntakeForm() {
	}

	public IntakeForm(String principleInvestigator, String department, String college, String projectTitle,
			Integer proposedFundingAmount, Date startDate, Date endDate, List<Personnel> personnel,
			List<SubgrantsOrSubcontracts> subgrantsOrSubcontracts, List<ProjectLocations> projectLocations,
			List<AdditionalPartiesInvolved> additionalPartiesInvolved, List<Space> space,
			List<String> otherActivitiesList, Map<String, Integer> requestedEquipment,
			Map<String, String> hazardousSubstances) {
		super();
		this.principleInvestigator = principleInvestigator;
		this.department = department;
		this.college = college;
		this.projectTitle = projectTitle;
		this.proposedFundingAmount = proposedFundingAmount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.personnel = personnel;
		this.subgrantsOrSubcontracts = subgrantsOrSubcontracts;
		this.projectLocations = projectLocations;
		this.additionalPartiesInvolved = additionalPartiesInvolved;
		this.space = space;
		this.otherActivitiesList = otherActivitiesList;
		this.requestedEquipment = requestedEquipment;
		this.hazardousSubstances = hazardousSubstances;
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

	public List<Personnel> getPersonnel() {
		return personnel;
	}

	public void setPersonnel(List<Personnel> personnel) {
		this.personnel = personnel;
	}

	public List<SubgrantsOrSubcontracts> getSubgrantsOrSubcontracts() {
		return subgrantsOrSubcontracts;
	}

	public void setSubgrantsOrSubcontracts(List<SubgrantsOrSubcontracts> subgrantsOrSubcontracts) {
		this.subgrantsOrSubcontracts = subgrantsOrSubcontracts;
	}

	public List<ProjectLocations> getProjectLocations() {
		return projectLocations;
	}

	public void setProjectLocations(List<ProjectLocations> projectLocations) {
		this.projectLocations = projectLocations;
	}

	public List<AdditionalPartiesInvolved> getAdditionalPartiesInvolved() {
		return additionalPartiesInvolved;
	}

	public void setAdditionalPartiesInvolved(List<AdditionalPartiesInvolved> additionalPartiesInvolved) {
		this.additionalPartiesInvolved = additionalPartiesInvolved;
	}

	public List<Space> getSpace() {
		return space;
	}

	public void setSpace(List<Space> space) {
		this.space = space;
	}

	public List<String> getOtherActivitiesList() {
		return otherActivitiesList;
	}

	public void setOtherActivitiesList(List<String> otherActivitiesList) {
		this.otherActivitiesList = otherActivitiesList;
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

	public Proposal getProposal() {
		return proposal;
	}

	public void setProposal(Proposal proposal) {
		this.proposal = proposal;
	}



	// Section B needs an inner class of Personnel for each personnel in the list
	// This class contains the name, employer, position, and time of a person
	// working on the project
	@Entity
	@Table(name = "personnel")
	public static class Personnel implements Serializable {

		private static final long serialVersionUID = 4L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "personnel_id")
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
		@JoinColumn(name = "intake_form_id")
		IntakeForm intakeForm;

		public Personnel() {
		}

		public Personnel(String name, String employer, String positionTitleOnGrant, int units,
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

		public IntakeForm getIntakeForm() {
			return intakeForm;
		}

		public void setIntakeForm(IntakeForm intakeForm) {
			this.intakeForm = intakeForm;
		}

		
	}

	// Section D needs an inner class of Subgrants or Subcontracts
	// This class contains the Subgrant/Subcontract institution,
	// address, proposed funding amount, contact person name,
	// contact person email, and contact person phone number
	@Entity
	@Table(name = "subgrants_or_subcontracts")
	public static class SubgrantsOrSubcontracts implements Serializable {

		private static final long serialVersionUID = 5L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "subgrant_or_subcontract_id")
		Long Id;

		@Column
		String institution;

		@Column
		String address;

		@Column(name = "proposed_funding_amount")
		int proposedFundingAmount;

		@Column(name = "contact_person_name")
		String contactPersonName;

		@Column(name = "contact_person_email")
		String contactPersonEmail;

		@Column(name = "contact_person_phone")
		long contactPersonPhone;

		@JsonIgnore
		@ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "intake_form_id")
		IntakeForm intakeForm;
		
		

		public SubgrantsOrSubcontracts() {
		}

		public SubgrantsOrSubcontracts(String institution, String address, int proposedFundingAmount,
				String contactPersonName, String contactPersonEmail, long contactPersonPhone) {
			this.institution = institution;
			this.address = address;
			this.proposedFundingAmount = proposedFundingAmount;
			this.contactPersonName = contactPersonName;
			this.contactPersonEmail = contactPersonEmail;
			this.contactPersonPhone = contactPersonPhone;
		}

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getInstitution() {
			return institution;
		}

		public void setInstitution(String institution) {
			this.institution = institution;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getProposedFundingAmount() {
			return proposedFundingAmount;
		}

		public void setProposedFundingAmount(int proposedFundingAmount) {
			this.proposedFundingAmount = proposedFundingAmount;
		}

		public String getContactPersonName() {
			return contactPersonName;
		}

		public void setContactPersonName(String contactPersonName) {
			this.contactPersonName = contactPersonName;
		}

		public String getContactPersonEmail() {
			return contactPersonEmail;
		}

		public void setContactPersonEmail(String contactPersonEmail) {
			this.contactPersonEmail = contactPersonEmail;
		}

		public long getContactPersonPhone() {
			return contactPersonPhone;
		}

		public void setContactPersonPhone(long contactPersonPhone) {
			this.contactPersonPhone = contactPersonPhone;
		}

		public IntakeForm getIntakeForm() {
			return intakeForm;
		}

		public void setIntakeForm(IntakeForm intakeForm) {
			this.intakeForm = intakeForm;
		}

		

	}

	// Section E needs an inner class of Project Locations
	// This class contains the site name, the address,
	// the projected percent of time at site and
	// will have a boolean to ask the user if on-campus space or off-campus rental
	// agreement need to be arranged
	@Entity
	@Table(name = "project_locations")
	public static class ProjectLocations implements Serializable {

		private static final long serialVersionUID = 6L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "project_locations_id")
		Long Id;

		@Column(name = "site_name")
		String siteName;

		@Column(name = "site_address")
		String siteAddress;

		@Column(name = "time_on_site")
		int projectedPercentOfTimeAtSite;

		// Will on-campus space or off-campus rental
		// agreement need to be arranged?
		@Column(name = "agreement_arranged")
		boolean agreementArranged;

		@JsonIgnore
		@ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "intake_form_id")
		IntakeForm intakeForm;

		public ProjectLocations() {
		}

		public ProjectLocations(String siteName, String siteAddress, int projectedPercentOfTimeAtSite,
				boolean agreementArranged) {
			this.siteName = siteName;
			this.siteAddress = siteAddress;
			this.projectedPercentOfTimeAtSite = projectedPercentOfTimeAtSite;
			this.agreementArranged = agreementArranged;
		}

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

		public boolean isAgreementArranged() {
			return agreementArranged;
		}

		public void setAgreementArranged(boolean agreementArranged) {
			this.agreementArranged = agreementArranged;
		}

		public IntakeForm getIntakeForm() {
			return intakeForm;
		}

		public void setIntakeForm(IntakeForm intakeForm) {
			this.intakeForm = intakeForm;
		}

	}

	// Section F needs an inner class of Additional Parties Involved
	// This class contains the party name, the supervisor name
	// and explanation of involvement
	@Entity
	@Table(name = "additional_parties_involved")
	public static class AdditionalPartiesInvolved implements Serializable {

		private static final long serialVersionUID = 7L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "additional_parties_involved_id")
		Long Id;

		@Column(name = "party_name")
		String partyName;

		@Column
		String supervisor;

		@Column(name = "explanation_of_involvement")
		String explanationOfInvolvement;

		@JsonIgnore
		@ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "intake_form_id")
		IntakeForm intakeForm;

		public AdditionalPartiesInvolved() {
		}

		public AdditionalPartiesInvolved(String partyName, String supervisor, String explanationOfInvolvement) {
			this.partyName = partyName;
			this.supervisor = supervisor;
			this.explanationOfInvolvement = explanationOfInvolvement;
		}

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

		public IntakeForm getIntakeForm() {
			return intakeForm;
		}

		public void setIntakeForm(IntakeForm intakeForm) {
			this.intakeForm = intakeForm;
		}

	}

	// Section H needs an inner class for space
	//This inner class contains the item name
	//the type of use (new space, change of use, or renovation)
	//and the source of funds
	@Entity
	@Table(name = "space")
	public static class Space implements Serializable {

		private static final long serialVersionUID = 8L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "space_id")
		Long Id;

		@Column
		String item;

		@Column(name = "type_of_use")
		String typeOfUse;

		@Column(name = "source_of_funds")
		String sourceOfFunds;

		@JsonIgnore
		@ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "intake_form_id")
		IntakeForm intakeForm;

		public Space() {
		}

		public Space(String item, String typeOfUse, String sourceOfFunds) {
			this.item = item;
			this.typeOfUse = typeOfUse;
			this.sourceOfFunds = sourceOfFunds;
		}

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

		public String getTypeOfUse() {
			return typeOfUse;
		}

		public void setTypeOfUse(String typeOfUse) {
			this.typeOfUse = typeOfUse;
		}

		public String getSourceOfFunds() {
			return sourceOfFunds;
		}

		public void setSourceOfFunds(String sourceOfFunds) {
			this.sourceOfFunds = sourceOfFunds;
		}

		public IntakeForm getIntakeForm() {
			return intakeForm;
		}

		public void setIntakeForm(IntakeForm intakeForm) {
			this.intakeForm = intakeForm;
		}

	}

}
