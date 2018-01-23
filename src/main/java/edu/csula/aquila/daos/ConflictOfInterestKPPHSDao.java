package edu.csula.aquila.daos;

import edu.csula.aquila.model.ConflictOfInterestKPPHS;

public interface ConflictOfInterestKPPHSDao {
	
	public ConflictOfInterestKPPHS getConflictOfInterestKPPHSById( Long id );
	
	public ConflictOfInterestKPPHS saveConflictOfInterestKPPHS( ConflictOfInterestKPPHS coiKPPHS );
	
	public ConflictOfInterestKPPHS updateConflictOfInterestKPPHS( ConflictOfInterestKPPHS coiKPPHS );

}
