package edu.csula.aquila.model;

import java.util.*

class ConflictOfInterestPHS{

	//identical to Non PHS, excludes bool subaward, sponsor as Map<Boolean,String>
	
	long id;
	User pI;
	long proposalNumber;
	String proposalTitle; //come from intake??
	Map<Boolean,String> sponsor;
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