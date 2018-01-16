package edu.csula.aquila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.csula.aquila.model.ConflictOfInterestKPNonPHS;
import edu.csula.aquila.model.ConflictOfInterestKPNonPHSDao;

@RestController
public class ConflictOfInterestKPNonPHSController {
	
	@Autowired
	private ConflictOfInterestKPNonPHSDao conflictOfInterestKPNonPHSDao;
	
	@RequestMapping(value = "/proposal/coikpnonphs", method = RequestMethod.GET)
	public ConflictOfInterestKPNonPHS getConflictOfInterestKPNonPHSById( @RequestParam Long id )
	{
		return conflictOfInterestKPNonPHSDao.getConflictOfInterestKPNonPHSById(id);
	}
	
	@RequestMapping(value = "/proposal/savecoikpnonphs", method = RequestMethod.POST)
    public ConflictOfInterestKPNonPHS saveConflictOfInterestKPNonPHS( @RequestBody ConflictOfInterestKPNonPHS coiKPNonPHS )
    {
    	return conflictOfInterestKPNonPHSDao.saveConflictOfInterestKPNonPHS( coiKPNonPHS );
    			
    }
	
	@RequestMapping(value = "/proposal/editcoikpnonphs", method = RequestMethod.PUT)
    public ConflictOfInterestKPNonPHS updateConflictOfInterestKPNonPHS( @RequestBody ConflictOfInterestKPNonPHS coiKPNonPHS )
    {
    	return conflictOfInterestKPNonPHSDao.updateConflictOfInterestKPNonPHS( coiKPNonPHS );
    			
    }


}
