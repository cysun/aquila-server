package edu.csula.aquila.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.ConflictOfInterestPINonPHS;

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
