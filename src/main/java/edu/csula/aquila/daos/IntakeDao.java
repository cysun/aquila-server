package edu.csula.aquila.daos;


import edu.csula.aquila.model.IntakeForm;

public interface IntakeDao {
	

	IntakeForm getIntakeForm(Long id);
	
	IntakeForm saveIntakeForm(IntakeForm intakeForm);
	
}
