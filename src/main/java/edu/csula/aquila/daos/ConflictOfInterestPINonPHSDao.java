package edu.csula.aquila.daos;

import edu.csula.aquila.model.ConflictOfInterestPINonPHS;

public interface ConflictOfInterestPINonPHSDao {

	public ConflictOfInterestPINonPHS getConflictOfInterestPINonPHSById( Long id );
	
	public ConflictOfInterestPINonPHS saveConflictOfInterestPINonPHS( ConflictOfInterestPINonPHS coiPINonPHS );
	
	public ConflictOfInterestPINonPHS updateConflictOfInterestPINonPHS( ConflictOfInterestPINonPHS coiPINonPHS );

}
