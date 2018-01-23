package edu.csula.aquila.daos;

import edu.csula.aquila.model.ConflictOfInterestKPNonPHS;

public interface ConflictOfInterestKPNonPHSDao {
	
	public ConflictOfInterestKPNonPHS getConflictOfInterestKPNonPHSById( Long id );
	
	public ConflictOfInterestKPNonPHS saveConflictOfInterestKPNonPHS( ConflictOfInterestKPNonPHS coiKPNonPHS);
	
	public ConflictOfInterestKPNonPHS updateConflictOfInterestKPNonPHS( ConflictOfInterestKPNonPHS coiKPNonPHS);
	

}
