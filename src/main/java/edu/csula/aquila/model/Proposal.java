package edu.csula.aquila.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "proposal")

public class Proposal implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;

	//@Column(name ="intake")
	@OneToOne
	private IntakeForm intakeForm;
	
	//@Column(name = "approval")
	@OneToOne
	private ApprovalForm approvalForm;

	//@Column(name = "coi_nonphs_kp")
	@OneToOne
	private ConflictOfInterestKPNonPHS conflictOfInterestKPNonPHS;

	//@Column(name = "coi_phs_kp")
	@OneToOne
	private ConflictOfInterestKPPHS conflictOfInterestKPPHS;
	
	//@Column(name = "coi_nonphs_pi")
	@OneToOne
	private ConflictOfInterestPINonPHS conflictOfInterestPINonPHS;

	//@Column(name = "coi_phs_pi")
	@OneToOne
	private ConflictOfInterestPHS conflictOfInterestPHS;
	
	//@Column(name = "equipment")
	@OneToOne
	private EquipmentForm equipmentForm;

	//@Column(name = "timeline")
	@OneToOne
	private Timeline timeline;

	
	//@Column(name = "budget")
	@OneToOne
	BudgetFile budgetForm;

	public Proposal(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IntakeForm getIntakeForm() {
		return intakeForm;
	}

	public void setIntakeForm(IntakeForm intakeForm) {
		this.intakeForm = intakeForm;
	}

	public ApprovalForm getApprovalForm() {
		return approvalForm;
	}

	public void setApprovalForm(ApprovalForm approvalForm) {
		this.approvalForm = approvalForm;
	}

	public ConflictOfInterestKPNonPHS getConflictOfInterestKPNonPHS() {
		return conflictOfInterestKPNonPHS;
	}

	public void setConflictOfInterestKPNonPHS(ConflictOfInterestKPNonPHS conflictOfInterestKPNonPHS) {
		this.conflictOfInterestKPNonPHS = conflictOfInterestKPNonPHS;
	}

	public ConflictOfInterestKPPHS getConflictOfInterestKPPHS() {
		return conflictOfInterestKPPHS;
	}

	public void setConflictOfInterestKPPHS(ConflictOfInterestKPPHS conflictOfInterestKPPHS) {
		this.conflictOfInterestKPPHS = conflictOfInterestKPPHS;
	}

	public ConflictOfInterestPINonPHS getConflictOfInterestPINonPHS() {
		return conflictOfInterestPINonPHS;
	}

	public void setConflictOfInterestPINonPHS(ConflictOfInterestPINonPHS conflictOfInterestPINonPHS) {
		this.conflictOfInterestPINonPHS = conflictOfInterestPINonPHS;
	}

	public ConflictOfInterestPHS getConflictOfInterestPIPHS() {
		return conflictOfInterestPHS;
	}

	public void setConflictOfInterestPHS(ConflictOfInterestPHS conflictOfInterestPHS) {
		this.conflictOfInterestPHS = conflictOfInterestPHS;
	}

	public EquipmentForm getEquipmentForm() {
		return equipmentForm;
	}

	public void setEquipmentForm(EquipmentForm equipmentForm) {
		this.equipmentForm = equipmentForm;
	}

	public Timeline getTimeline() {
		return timeline;
	}

	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	public BudgetFile getBudgetForm() {
		return budgetForm;
	}

	public void setBudgetForm(BudgetFile budgetForm) {
		this.budgetForm = budgetForm;
  }
}
