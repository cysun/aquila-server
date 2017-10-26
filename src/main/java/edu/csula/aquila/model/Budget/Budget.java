//budget class has all letters and max totals

public class Budget {
//header
	String sponsoring_agency;//is program detailed budget a field?
	User principal_investigator;
	List<User> co_investigators;
	String project_title;
	Date project_period_start;
	Date project_period_end;
	Date project_year_start;
	Date project_year_end;
//A	
	Personnel personnel;
//B
	FringeBenefits fringe_benefits;
//C
	OtherPersonnel other_personnel;
//D
	Subcontracts subcontracts;
//E
	ParticipantCosts participant_costs;
//F
	Travel travel;
//G
	Equipment equipment;
//H
	OtherDirectCosts other_direct_costs;
//I
	DirectCost direct_cost;
//J	
	ModifiedTotalDirectCosts modified_total_direct_costs;
//K
	FacilitiesAndAdministrativeCost facilities_and_administrative_cost;  
//L
	UnrecoveredFacilitiesAndAdministrativeCost unrecovered_facilities_and_administrative_cost; 
//M
	Totals total_cost;
//NOTES
	List<Strings> notes;
	
	



}