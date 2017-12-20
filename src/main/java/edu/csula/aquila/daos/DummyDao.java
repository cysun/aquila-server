package edu.csula.aquila.daos;

import edu.csula.aquila.model.DummyForm;

public interface DummyDao {

	DummyForm getDummyForm(Long id);
	
	DummyForm saveDummyForm(DummyForm dummyForm);
	
}
