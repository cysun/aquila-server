package edu.csula.aquila.model;

import java.util.*;

class ConflictOfInterestNonPHS{
	
	long id;
	User pI;
	long proposalNumber;
	String proposalTitle; //come from intake??
	String sponsor;
	boolean subAward; // also may need string
	//strings for boolean subaward if true
	String subAwardSponsor;
	String subAwardAgency;

	List<Boolean> disclosureReasons;//possible Map<boolean,String>, need string if boolean is true

	Date budgetPeriodStart;
	Date budgetPeriodEnd;
	Date projectPeriodStart;
	Date projectPeriodEnd;
	double amountRequested;
	long iRBACUCIBCNo; //name unclear
	boolean significantFinInterest;
	String keyPersonnelSign; //needs signature and print, signature its own class?
	Date keyPersonnelDate;
	boolean aRIOfficial;
	Date aRIDate;
}