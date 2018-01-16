package edu.csula.aquila.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ConflictOfInterestPINonPHSDaoImpl implements ConflictOfInterestPINonPHSDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ConflictOfInterestPINonPHS getConflictOfInterestPINonPHSById(Long id) 
	{
		return entityManager.find( ConflictOfInterestPINonPHS.class, id);
	}

	@Override
	@Transactional
	public ConflictOfInterestPINonPHS saveConflictOfInterestPINonPHS(ConflictOfInterestPINonPHS coiPINonPHS) 
	{
		return entityManager.merge( coiPINonPHS );
	}

	@Override
	@Transactional
	public ConflictOfInterestPINonPHS updateConflictOfInterestPINonPHS(ConflictOfInterestPINonPHS coiPINonPHS) 
	{
		return entityManager.merge( coiPINonPHS );
	}

}
