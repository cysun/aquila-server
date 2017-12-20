package edu.csula.aquila.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.DummyForm;
import edu.csula.aquila.model.Proposal;

@Repository
public class DummyDaoImpl implements DummyDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public DummyForm saveDummyForm(DummyForm dummyForm) {
		return entityManager.merge(dummyForm);
	}
	
	@Override
	public DummyForm getDummyForm(Long id) {
		return entityManager.find(DummyForm.class, id);
	}
	
}
