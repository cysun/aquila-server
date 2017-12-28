package edu.csula.aquila.daos;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.csula.aquila.model.DummyForm;
import edu.csula.aquila.model.DummyForm.DummyPersonnel;

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

	@Transactional
	public DummyForm.DummyPersonnel saveDummyPersonnel(DummyForm.DummyPersonnel personnel) {
		return entityManager.merge(personnel);
	}
	
	@Override
	public DummyForm.DummyPersonnel getDummyPersonnelById(Long id){
		return entityManager.find(DummyForm.DummyPersonnel.class, id);
	}

	
	//has issues where dummy personnel is not mapped?
	@Override
	public List<DummyForm.DummyPersonnel> getDummyPersonnelOfForm(Long id) {
		String query = "from DummyForm where dummy_form_id = :id";
		return entityManager.createQuery(query, DummyForm.DummyPersonnel.class)
				.setParameter("id", id)
				.getResultList();
	}
	

	
}
