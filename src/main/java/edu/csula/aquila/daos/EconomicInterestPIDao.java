package edu.csula.aquila.daos;

import edu.csula.aquila.model.EconomicInterestPI;

public interface EconomicInterestPIDao {

	public EconomicInterestPI getEconomicInterestPiById( Long id );
	
	public EconomicInterestPI saveEconomicInterestPI( EconomicInterestPI economicInterestPi );
	
	public EconomicInterestPI updateEconomicInterestPI( EconomicInterestPI economicInterestPi );
}
