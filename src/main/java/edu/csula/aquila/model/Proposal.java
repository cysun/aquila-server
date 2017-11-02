package edu.csula.aquila.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proposal")
public class Proposal {

	@Id
	@GeneratedValue
	Long id;
	
	
	@OneToOne
	IntakeForm intakeForm;
	
	@OneToOne
	ApprovalForm approvalForm;
	
	@OneToOne
	ConflictOfInterestNonPHS conflictOfInterestNonPHS;
	
	@OneToOne
	ConflictOfInterestPHS conflictOfInterestPHS;
	
	@OneToOne
	ConflictOfInterestNonPHS conflictOfInterestPINonPHS;
	
	@OneToOne
	EquipmentForm equipmentForm;
	
	@OneToOne
	Timeline timeline;

	@OneToOne
	BudgetFile budgetForm;
}
