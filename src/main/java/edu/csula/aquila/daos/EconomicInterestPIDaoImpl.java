package edu.csula.aquila.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.EconomicInterestPI;

@Repository
public class EconomicInterestPIDaoImpl implements EconomicInterestPIDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public EconomicInterestPI getEconomicInterestPiById(Long id) 
	{		
		return entityManager.find(EconomicInterestPI.class, id);
	}

	@Override
	@Transactional
	public EconomicInterestPI saveEconomicInterestPI(EconomicInterestPI economicInterestPi) 
	{
		return entityManager.merge(economicInterestPi );
	}

	@Override
	@Transactional
	public EconomicInterestPI updateEconomicInterestPI(EconomicInterestPI economicInterestPi) 
	{
		return entityManager.merge(economicInterestPi );
	}

}
