package edu.csula.aquila.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ConflictOfInterestKPNonPHSDaoImpl implements ConflictOfInterestKPNonPHSDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public ConflictOfInterestKPNonPHS getConflictOfInterestKPNonPHSById( Long id )
	{
		return entityManager.find(ConflictOfInterestKPNonPHS.class, id);
	}

	@Override
	@Transactional
	public ConflictOfInterestKPNonPHS saveConflictOfInterestKPNonPHS(ConflictOfInterestKPNonPHS coiKPNonPHS) 
	{
		return entityManager.merge( coiKPNonPHS );
	}

	@Override
	@Transactional
	public ConflictOfInterestKPNonPHS updateConflictOfInterestKPNonPHS(ConflictOfInterestKPNonPHS coiKPNonPHS) 
	{
		return entityManager.merge( coiKPNonPHS );
	}
}
