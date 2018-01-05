package edu.csula.aquila.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.IntakeForm;

@Repository
public class IntakeDaoImpl implements IntakeDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public IntakeForm saveIntakeForm(IntakeForm intakeForm) {
		return entityManager.merge(intakeForm);
	}
	
	@Override
	public IntakeForm getIntakeForm(Long id) {
		return entityManager.find(IntakeForm.class, id);
	}

}
