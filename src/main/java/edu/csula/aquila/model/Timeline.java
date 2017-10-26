package edu.csula.aquila.model;

import java.util.*;

class Timeline{
	
	User pI;
	List<User> coPI;
	String proposal;// unclear if proposal name or code
	String fundingAgency;
	Date shippingDeadline; //??
	Date uASDate;
	Date sponsorDueDate
	Date finalSign;
	Date shippingDate; // same as shipping deadline?
	Map<String,Date> piDueDates;
	Map<String,Date> orspDueDates;

	//signatures, may not be strings
	String piInitial;
	String analystInitial;

	Date piSign;
	Date analystSign;
	List<String> addComments;

	Timeline();
	//working on constructor

	User getPI(){
		return pI;
	}

	List<User> getCoPI(){
		return coPI;
	}

	String getProposal(){
		return proposal;
	}

	String getFundingAgency(){
		return fundingAgency;
	}

	Date getShippingDeadline(){
		return shippingDeadline;
	}

	Date getUASDate(){
		return uASDate;
	}

	Date getSponsorDueDate(){
		return sponsorDueDate;
	}

	Date getFinalSign(){
		return finalSign;
	}

	Date getShippingDate(){
		return shippingDate;
	}


	Map<String,Date> getPIDueDates(){
		return piDueDates;
	}

	Map<String,Date> getORSPDueDates(){
		return orspDueDates;
	}

	String getPIInitial(){
		return piInitial;
	}

	String getAnalystInitial(){
		return analystSign;
	}

	Date getPISign(){
		return piSign;
	}

	Date getAnalystSign(){
		return analystSign;
	}

	List<String> getAddComments(){
		return addComments;
	}


	void setPI(User pI){
		this.pI = pI;
	}

	void setCoPI(List<Users> coPI){
		this.coPI = coPI;
	}

	void setProposal(String proposal){
		this.proposal = proposal;
	}

	void setFundingAgency(String fundingAgency){
		this.fundingAgency = fundingAgency;
	}

	void setShippingDeadline(Date shippingDeadline){
		this.shippingDeadline = shippingDeadline;
	}

	void setUASDate(Date uASDate){
		this.uASDate = uASDate;
	}

	void setSponsorDueDate(Date sponsorDueDate){
		this.sponsorDueDate = sponsorDueDate;
	}

	void setFinalSign(Date finalSign){
		this.finalSign = finalSign;
	}

	void setShippingDate(Date shippingDate){
		this.shippingDate = shippingDate;
	}


	void setPIDueDates(Map<String,Date> piDueDates){
		this.piDueDates = piDueDates;
	}

	void setORSPDueDates(Map<String,Date> orspDueDates){
		this.orspDueDates = orspDueDates;
	}

	void setpiInitial(String piInitial){
		this.piInitial = piInitial;
	}

	void setAnalystInitial(String analystInitial){
		this.analystInitial = analystInitial;
	}

	void setpiSign(Date piSign){
		this.piSign = piSign;
	}

	void setAnalystSign(Date analystSign){
		this.analystSign = analystSign;
	}

	void setAddComments(String addComments){
		this.addComments = addComments;
	}
}