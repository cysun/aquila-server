package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.DummyDao;
import edu.csula.aquila.model.DummyForm;

@RestController
public class DummyController {

	@Autowired
	private DummyDao dummyDao;
	
	@RequestMapping(value = "dummy", method = RequestMethod.POST)
	public DummyForm newDummyForm(@RequestBody DummyForm dummyForm) {
		
		return dummyDao.saveDummyForm(dummyForm);
	}
	
	@RequestMapping(value = "dummy/{id}", method = RequestMethod.PUT)
	public DummyForm updateDummyForm(@RequestBody DummyForm dummyForm) {
		
		return dummyDao.saveDummyForm(dummyForm);
	}
	
	@RequestMapping(value = "dummy/{id}", method = RequestMethod.GET)
	public DummyForm getDummyForm(@RequestParam Long id) {
		
		return dummyDao.getDummyForm(id);
	}
}
