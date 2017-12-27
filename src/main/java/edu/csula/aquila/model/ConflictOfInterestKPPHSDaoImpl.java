package edu.csula.aquila.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class ConflictOfInterestKPPHSDaoImpl implements ConflictOfInterestKPPHSDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public ConflictOfInterestKPPHS getConflictOfInterestKPPHSById(Long id) 
	{
		return entityManager.find(ConflictOfInterestKPPHS.class, id);
	}

	@Override
	@Transactional
	public ConflictOfInterestKPPHS saveConflictOfInterestKPPHS(ConflictOfInterestKPPHS coiKPPHS) 
	{
		return entityManager.merge( coiKPPHS );
	}

	@Override
	@Transactional
	public ConflictOfInterestKPPHS updateConflictOfInterestKPPHS(ConflictOfInterestKPPHS coiKPPHS) 
	{
		return entityManager.merge( coiKPPHS );
	}

}
