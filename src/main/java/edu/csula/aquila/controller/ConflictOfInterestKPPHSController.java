package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.daos.ConflictOfInterestKPPHSDao;
import edu.csula.aquila.model.ConflictOfInterestKPPHS;

@RestController
public class ConflictOfInterestKPPHSController {
	
	@Autowired
	private ConflictOfInterestKPPHSDao conflictOfInterestKPPHSDao;
	
	@RequestMapping(value = "/proposal/coikpphs", method = RequestMethod.GET)
	public ConflictOfInterestKPPHS getConflictOfInterestKPPHSById( @RequestParam Long id )
	{
		return conflictOfInterestKPPHSDao.getConflictOfInterestKPPHSById(id);
	}
	
	@RequestMapping(value = "/proposal/savecoikpphs", method = RequestMethod.POST)
    public ConflictOfInterestKPPHS saveConflictOfInterestKPPHS( @RequestBody ConflictOfInterestKPPHS coiKPPHS )
    {
    	return conflictOfInterestKPPHSDao.saveConflictOfInterestKPPHS( coiKPPHS );
    			
    }
	
	@RequestMapping(value = "/proposal/editcoikpphs", method = RequestMethod.PUT)
    public ConflictOfInterestKPPHS updateConflictOfInterestKPPHS( @RequestBody ConflictOfInterestKPPHS coiKPPHS )
    {
    	return conflictOfInterestKPPHSDao.updateConflictOfInterestKPPHS( coiKPPHS );
    			
    }

}
