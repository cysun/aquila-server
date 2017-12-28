package edu.csula.aquila.daos;

import java.util.List;

import edu.csula.aquila.model.DummyForm;
import edu.csula.aquila.model.Proposal;
import edu.csula.aquila.model.DummyForm.DummyPersonnel;

public interface DummyDao {
	
	DummyForm.DummyPersonnel saveDummyPersonnel(DummyForm.DummyPersonnel personnel);

	DummyForm getDummyForm(Long id);
	
	DummyForm saveDummyForm(DummyForm dummyForm);

	DummyPersonnel getDummyPersonnelById(Long id);
	
	List<DummyPersonnel> getDummyPersonnelOfForm( Long id );
	
}
