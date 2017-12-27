package edu.csula.aquila.model;

public interface EconomicInterestPIDao {

	public EconomicInterestPI getEconomicInterestPiById( Long id );
	
	public EconomicInterestPI saveEconomicInterestPI( EconomicInterestPI economicInterestPi );
	
	public EconomicInterestPI updateEconomicInterestPI( EconomicInterestPI economicInterestPi );
}
