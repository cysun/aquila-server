package edu.csula.aquila.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.ConflictOfInterestPHS;

@Repository
public class ConflictOfInterestPHSDaoImpl implements ConflictOfInterestPHSDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public ConflictOfInterestPHS getConflictOfInterestPHSById( Long id )
	{
		return entityManager.find(ConflictOfInterestPHS.class, id);
	}

	@Override
	@Transactional
	public ConflictOfInterestPHS saveConflictOfInterestPHS(ConflictOfInterestPHS coiPHS) 
	{
		return entityManager.merge( coiPHS );
	}

	@Override
	@Transactional
	public ConflictOfInterestPHS updateConflictOfInterestPHS(ConflictOfInterestPHS coiPHS) 
	{
		return entityManager.merge( coiPHS );
	}

}
