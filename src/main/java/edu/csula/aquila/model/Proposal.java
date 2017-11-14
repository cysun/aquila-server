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

	
	@OneToOne
	private IntakeForm intakeForm;
	
	@OneToOne
	private ApprovalForm approvalForm;

	@OneToOne
	private ConflictOfInterestKPNonPHS conflictOfInterestKPNonPHS;

	@OneToOne
	private ConflictOfInterestKPPHS conflictOfInterestKPPHS;
	
	@OneToOne
	private ConflictOfInterestPINonPHS conflictOfInterestPINonPHS;

	@OneToOne
	private ConflictOfInterestPHS conflictOfInterestPHS;
	
	@OneToOne
	private EquipmentForm equipmentForm;

	@OneToOne
	private Timeline timeline;
	
	@OneToOne
	BudgetFile budgetForm;

	public Proposal(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name ="intake")
	public IntakeForm getIntakeForm() {
		return intakeForm;
	}

	public void setIntakeForm(IntakeForm intakeForm) {
		this.intakeForm = intakeForm;
	}

	@Column(name = "approval")
	public ApprovalForm getApprovalForm() {
		return approvalForm;
	}

	public void setApprovalForm(ApprovalForm approvalForm) {
		this.approvalForm = approvalForm;
	}

	@Column(name ="conflict_of_interest_kp_non_phs")
	public ConflictOfInterestKPNonPHS getConflictOfInterestKPNonPHS() {
		return conflictOfInterestKPNonPHS;
	}

	public void setConflictOfInterestKPNonPHS(ConflictOfInterestKPNonPHS conflictOfInterestKPNonPHS) {
		this.conflictOfInterestKPNonPHS = conflictOfInterestKPNonPHS;
	}

	@Column(name ="conflict_of_interest_kp_phs")
	public ConflictOfInterestKPPHS getConflictOfInterestKPPHS() {
		return conflictOfInterestKPPHS;
	}

	public void setConflictOfInterestKPPHS(ConflictOfInterestKPPHS conflictOfInterestKPPHS) {
		this.conflictOfInterestKPPHS = conflictOfInterestKPPHS;
	}

	@Column(name ="conflict_of_interest_pi_non_phs")
	public ConflictOfInterestPINonPHS getConflictOfInterestPINonPHS() {
		return conflictOfInterestPINonPHS;
	}

	public void setConflictOfInterestPINonPHS(ConflictOfInterestPINonPHS conflictOfInterestPINonPHS) {
		this.conflictOfInterestPINonPHS = conflictOfInterestPINonPHS;
	}

	@Column(name ="conflict_of_interest_phs")
	public ConflictOfInterestPHS getConflictOfInterestPHS() {
		return conflictOfInterestPHS;
	}

	public void setConflictOfInterestPHS(ConflictOfInterestPHS conflictOfInterestPHS) {
		this.conflictOfInterestPHS = conflictOfInterestPHS;
	}

	@Column(name="equipment_form")
	public EquipmentForm getEquipmentForm() {
		return equipmentForm;
	}

	public void setEquipmentForm(EquipmentForm equipmentForm) {
		this.equipmentForm = equipmentForm;
	}

	@Column(name="timeline")
	public Timeline getTimeline() {
		return timeline;
	}

	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	@Column(name="budget_form")
	public BudgetFile getBudgetForm() {
		return budgetForm;
	}

	public void setBudgetForm(BudgetFile budgetForm) {
		this.budgetForm = budgetForm;
	}
	

}
