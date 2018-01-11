package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "timeline")
public class Timeline implements Serializable {

	private static final long serialVersionUID = -3646369830165962564L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "timeline_id")
	private Long Id;

	@Column(name = "pi")
	User pI;

	@ElementCollection
	@Column(name = "co_pis")
	List<String> coPI;

	@Column(name = "proposal")
	String proposal;// unclear if proposal name or code

	@Column(name = "funding_agency")
	String fundingAgency;

	@Column(name = "uas_date")
	Date uasDueDate;

	@Column(name = "sponsor_date")
	Date sponsorDueDate;

	@Column(name = "final_sign_date")
	Date finalSign;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "timeline_id", nullable = true)
	List<Stage> stages;

	// proposal relationship
	// @OneToOne(mappedBy="timeline")
	// Proposal proposalForm;

	Timeline() {
	}

	public Timeline(User pI, List<String> coPI, String proposal, String fundingAgency, Date uasDueDate,
			Date sponsorDueDate, Date finalSign, List<Stage> stages) {
		super();
		this.pI = pI;
		this.coPI = coPI;
		this.proposal = proposal;
		this.fundingAgency = fundingAgency;
		this.uasDueDate = uasDueDate;
		this.sponsorDueDate = sponsorDueDate;
		this.finalSign = finalSign;
		this.stages = stages;
	}

	// premade PI stages
	// String name,
	// Date expectedDate,
	// Date completedDate,
	// List<Form> forms,
	// List<String> addComments
	public List<Stage> piStages() {
		this.stages = new ArrayList<Stage>();
		// what are these stages even

		return this.stages;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public User getpI() {
		return pI;
	}

	public void setpI(User pI) {
		this.pI = pI;
	}

	public List<String> getCoPI() {
		return coPI;
	}

	public void setCoPI(List<String> coPI) {
		this.coPI = coPI;
	}

	public String getProposal() {
		return proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

	public String getFundingAgency() {
		return fundingAgency;
	}

	public void setFundingAgency(String fundingAgency) {
		this.fundingAgency = fundingAgency;
	}

	public Date getUasDueDate() {
		return uasDueDate;
	}

	public void setUasDueDate(Date uasDueDate) {
		this.uasDueDate = uasDueDate;
	}

	public Date getSponsorDueDate() {
		return sponsorDueDate;
	}

	public void setSponsorDueDate(Date sponsorDueDate) {
		this.sponsorDueDate = sponsorDueDate;
	}

	public Date getFinalSign() {
		return finalSign;
	}

	public void setFinalSign(Date finalSign) {
		this.finalSign = finalSign;
	}

	public List<Stage> getStages() {
		return stages;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}

	// Timeline contains a list of stages
	// This is the innerclass of stage to help a uas member
	// manage the timeline
	@Entity
	@Table(name = "stage")
	public static class Stage implements Serializable {

		private static final long serialVersionUID = 4793986574923358796L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "stage_id")
		Long Id;

		@Column
		String name;

		@Column(name = "expected_date")
		Date expectedDate;

		@Column(name = "completed_date")
		Date completedDate;

		// allows uas member to add a needed form
		@OneToMany(cascade = { CascadeType.ALL })
		@JoinColumn(name = "stage_id", nullable = true)
		List<Form> forms;

		// allows uas member to add needed file

		// allows uas member to add comments to a stage if needed
		@ElementCollection
		@Column(name = "add_comments")
		List<String> addComments;

		public Stage() {
		}

		public Stage(String name, Date expectedDate, Date completedDate, List<Form> forms, List<String> addComments) {
			super();
			this.name = name;
			this.expectedDate = expectedDate;
			this.completedDate = completedDate;
			this.forms = forms;
			this.addComments = addComments;
		}

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

		public Date getExpectedDate() {
			return expectedDate;
		}

		public void setExpectedDate(Date expectedDate) {
			this.expectedDate = expectedDate;
		}

		public Date getCompletedDate() {
			return completedDate;
		}

		public void setCompletedDate(Date completedDate) {
			this.completedDate = completedDate;
		}

		public List<Form> getForms() {
			return forms;
		}

		public void setForms(List<Form> forms) {
			this.forms = forms;
		}

		public List<String> getAddComments() {
			return addComments;
		}

		public void setAddComments(List<String> addComments) {
			this.addComments = addComments;
		}

	}

}