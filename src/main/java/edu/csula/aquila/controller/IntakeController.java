package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.csula.aquila.daos.IntakeDao;
import edu.csula.aquila.model.IntakeForm;

public class IntakeController {
	
	@Autowired
	private IntakeDao intakeDao;
	
	@RequestMapping(value = "intake", method = RequestMethod.POST)
	public IntakeForm newIntakeForm(@RequestBody IntakeForm intakeForm) {
		return intakeDao.saveIntakeForm(intakeForm);
	}
	
	@RequestMapping(value = "intake/{id}", method = RequestMethod.PUT)
	public IntakeForm updateIntakeForm(@RequestBody IntakeForm intakeForm) {
		return intakeDao.saveIntakeForm(intakeForm);
	}
	
	@RequestMapping(value = "intake/{id}", method = RequestMethod.GET)
	public IntakeForm getIntakeForm(@RequestParam Long id) {
		return intakeDao.getIntakeForm(id);
	}

	

}
