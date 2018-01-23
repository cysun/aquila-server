package edu.csula.aquila.daos;

import edu.csula.aquila.model.ConflictOfInterestPHS;

public interface ConflictOfInterestPHSDao {
	
	public ConflictOfInterestPHS getConflictOfInterestPHSById( Long id );
	
	public ConflictOfInterestPHS saveConflictOfInterestPHS( ConflictOfInterestPHS coiPHS);
	
	public ConflictOfInterestPHS updateConflictOfInterestPHS( ConflictOfInterestPHS coiPHS);
	

}
