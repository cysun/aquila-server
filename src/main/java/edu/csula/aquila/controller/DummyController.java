package edu.csula.aquila.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.DummyDao;
import edu.csula.aquila.model.DummyForm;
import edu.csula.aquila.model.DummyForm.DummyPersonnel;

@RestController
public class DummyController {

	@Autowired
	private DummyDao dummyDao;
	
	//create a new form
	@RequestMapping(value = "dummy", method = RequestMethod.POST)
	public DummyForm newDummyForm(@RequestBody DummyForm dummyForm) {
		
		return dummyDao.saveDummyForm(dummyForm);
	}
	
	//save a personnel
	@RequestMapping(value = "dummy/{id}/personnel", method = RequestMethod.POST)
	public DummyForm.DummyPersonnel savePersonnel(@RequestBody DummyForm.DummyPersonnel dummyPersonnel, @PathVariable Long id) throws IllegalArgumentException, IllegalAccessException{
		dummyPersonnel.setDummyForm(dummyDao.getDummyForm(id));
		return dummyDao.saveDummyPersonnel(dummyPersonnel);
		
	}
	
	//return a personnel
	@RequestMapping(value = "dummy/{formId}/personnel/{id}")
	public DummyForm.DummyPersonnel getPersonnelById(@PathVariable Long id, @PathVariable Long formId){
		return dummyDao.getDummyPersonnelById(formId);
	}
	
	//return a list of personnel of a form
	@RequestMapping(value = "dummy/{id}/personnel", method = RequestMethod.GET)
	public List<DummyPersonnel> getPersonnelList(@PathVariable Long id){
		return dummyDao.getDummyPersonnelOfForm(id);
	}
	

	//update a form
	@RequestMapping(value = "dummy/{id}", method = RequestMethod.PUT)
	public DummyForm updateDummyForm(@RequestBody DummyForm dummyForm, @PathVariable Long id) {
		return dummyDao.saveDummyForm(dummyForm);
	}
	
	//return a form
	@RequestMapping(value = "dummy/{id}", method = RequestMethod.GET)
	public DummyForm getDummyForm(@PathVariable Long id) {
		
		return dummyDao.getDummyForm(id);
	}
}
