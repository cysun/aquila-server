package edu.csula.aquila.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="timeline")

public class Timeline implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	User pI;
	
	@ElementCollection
	@OneToMany
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
	
	@ElementCollection
	@OneToMany
	Map<String,Date> piDueDates;

	@ElementCollection
	@OneToMany
	Map<String,Date> orspDueDates;

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
	@OneToMany
	List<String> addComments;

	Timeline(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getpI() {
		return pI;
	}

	public void setpI(User pI) {
		this.pI = pI;
	}

	public List<User> getCoPI() {
		return coPI;
	}

	public void setCoPI(List<User> coPI) {
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

	public List<String> getAddComments() {
		return addComments;
	}

	public void setAddComments(List<String> addComments) {
		this.addComments = addComments;
	};
	//working on constructor

	
	
	
}