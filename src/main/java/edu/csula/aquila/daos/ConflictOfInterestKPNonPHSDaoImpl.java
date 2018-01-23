package edu.csula.aquila.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.ConflictOfInterestKPNonPHS;

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
