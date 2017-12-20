package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name = "dummy_form")
public class DummyForm  implements Serializable{

	private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dummy_form_id")
	Long id;
	
	//A
	
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
	
	//B
	@ElementCollection
	  @CollectionTable(
	        name="dummy_personnel",
	        joinColumns=@JoinColumn(name="dummy_personnel_id")
	  )
	List<DummyPersonnel> dummyPersonnel;
	
	
	
	//proposal relationship
	@JsonIgnore
	@OneToOne(mappedBy="dummyForm")
	Proposal proposal;
	
	public DummyForm() {}
	
	public DummyForm(String principleInvestigator, String department, String college, String projectTitle, Integer proposedFundingAmount,
			Date startDate, Date endDate, List<DummyPersonnel> dummyPersonnel) {
		
		this.principleInvestigator = principleInvestigator;
		this.department = department;
		this.college = college;
		this.projectTitle = projectTitle;
		this.proposedFundingAmount = proposedFundingAmount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.dummyPersonnel = dummyPersonnel;
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
	
	
}

//Section B needs an inner class of Personnel for each personnel in the list
//This class contains the name, employer, position, and time of a person working on the project
@Embeddable
class DummyPersonnel implements Serializable{
	
	private static final long serialVersionUID = 4L;
	
//	@Id
//	@GeneratedValue
//	@Column(name="dummy_personnel_id")
//	Long id;
	
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
	
	//relation
	@JsonIgnore
	@ManyToOne
	DummyForm dummyForm;
	
	public DummyPersonnel() {}
	
	public DummyPersonnel(String name, String employer, String positionTitleOnGrant, int units, int percentOfTimePropose) {
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