package edu.csula.aquila.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

public class Proposal {

	Long id;
	IntakeForm intakeForm;
	ApprovalForm approvalForm;
	ConflictOfInterestNonPHS conflictOfInterestNonPHS;
	ConflictOfInterestPHS conflictOfInterestPHS;
	ConflictOfInterestNonPHS conflictOfInterestPINonPHS;
	EquipmentForm equipmentForm;
	Timeline timeline;
	BudgetFile budgetForm;
}
