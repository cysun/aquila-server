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
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="timeline")
public class Timeline implements Serializable{
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column(name = "pi")
	User pI;
	

	@OneToMany(mappedBy = "timelineForm")
	//@Column(name = "co_pis")
	List<User> coPI;

	@Column(name="proposal")
	String proposal;// unclear if proposal name or code
	
	@Column(name="funding_agency")
	String fundingAgency;
	
	@Column(name="shipping_deadline")
	Date shippingDeadline; //??
	
	@Column(name="uas_date")
	Date uASDate;
	
	@Column(name="sponsor_date")
	Date sponsorDueDate;
	
	@Column(name="final_sign_date")
	Date finalSign;
	
	@Column(name="shipping_date")
	Date shippingDate; // same as shipping deadline?
	
	//add meaningful column names to piDueDates and orspDueDates
	
	@ElementCollection
	@MapKeyColumn(name ="principal_investigator")
	@Column(name ="pi_date_due")
	@CollectionTable(name="pi_due_dates", joinColumns=@JoinColumn(name="id"))
	Map<String,Date> piDueDates;

	@ElementCollection
	@MapKeyColumn(name ="orsp")
	@Column(name ="orsp_date_due")
	@CollectionTable(name="orsp_due_dates", joinColumns=@JoinColumn(name="id"))
	Map<String,Date> orspDueDates;

	public Map<String, Date> getPiDueDates() {
		return piDueDates;
	}

	public void setPiDueDates(Map<String, Date> piDueDates) {
		this.piDueDates = piDueDates;
	}

	public Map<String, Date> getOrspDueDates() {
		return orspDueDates;
	}

	public void setOrspDueDates(Map<String, Date> orspDueDates) {
		this.orspDueDates = orspDueDates;
	}

	@Column(name="pi_initial")
	//signatures, may not be strings
	String piInitial;
	
	@Column(name="analyst_initial")
	String analystInitial;

	@Column(name="pi_sign_date")
	Date piSign;
	
	@Column(name="analyst_sign_date")
	Date analystSign;
	
	@ElementCollection
	@Column(name="add_comments")
	List<String> addComments;
	
	//proposal relationship
	@OneToOne(mappedBy="timeline")
	Proposal proposalForm;

	Timeline(){}

	public Long getId() {
		return Id;
	}

	public void setId(Long Id) {
		this.Id = Id;
	}

	public User getpI() {
		return pI;
	}

	public void setpI(User pI) {
		this.pI = pI;
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

	public Date getShippingDeadline() {
		return shippingDeadline;
	}

	public void setShippingDeadline(Date shippingDeadline) {
		this.shippingDeadline = shippingDeadline;
	}

	public Date getuASDate() {
		return uASDate;
	}

	public void setuASDate(Date uASDate) {
		this.uASDate = uASDate;
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

	public Date getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

	public String getPiInitial() {
		return piInitial;
	}

	public void setPiInitial(String piInitial) {
		this.piInitial = piInitial;
	}

	public String getAnalystInitial() {
		return analystInitial;
	}

	public void setAnalystInitial(String analystInitial) {
		this.analystInitial = analystInitial;
	}

	public Date getPiSign() {
		return piSign;
	}

	public void setPiSign(Date piSign) {
		this.piSign = piSign;
	}

	public Date getAnalystSign() {
		return analystSign;
	}

	public void setAnalystSign(Date analystSign) {
		this.analystSign = analystSign;
	}

	public List<User> getCoPI() {
		return coPI;
	}

	public void setCoPI(List<User> coPI) {
		this.coPI = coPI;
	}

	public List<String> getAddComments() {
		return addComments;
	}

	public void setAddComments(List<String> addComments) {
		this.addComments = addComments;
	}


	
	
	
}