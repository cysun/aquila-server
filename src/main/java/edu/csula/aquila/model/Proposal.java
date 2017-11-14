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
	@Column(name="proposal_id")
	private Long id;

	//relation constraint manytoone? manytomany? onetomany?
	//private User user;
	
	@OneToOne
	private IntakeForm intake_form;
	
	@OneToOne
	private ApprovalForm approval_form;

	@OneToOne
	private ConflictOfInterestKPNonPHS coi_kp_nonphs;

	@OneToOne
	private ConflictOfInterestKPPHS coi_kp_phs;
	
	@OneToOne
	private ConflictOfInterestPINonPHS coi_pi_nonphs;

	@OneToOne
	private ConflictOfInterestPHS coi_phs;
	
	@OneToOne
	private EquipmentForm equipment_form;

	@OneToOne
	private Timeline timeline;
	
	@OneToOne
	BudgetFile budget_form;

	public Proposal(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "intake_form")
	public IntakeForm getIntake_form() {
		return intake_form;
	}

	public void setIntake_form(IntakeForm intake_form) {
		this.intake_form = intake_form;
	}

	@Column(name="approval_form")
	public ApprovalForm getApproval_form() {
		return approval_form;
	}

	public void setApproval_form(ApprovalForm approval_form) {
		this.approval_form = approval_form;
	}

	@Column(name="coi_kp_nonphs")
	public ConflictOfInterestKPNonPHS getCoi_kp_nonphs() {
		return coi_kp_nonphs;
	}

	public void setCoi_kp_nonphs(ConflictOfInterestKPNonPHS coi_kp_nonphs) {
		this.coi_kp_nonphs = coi_kp_nonphs;
	}

	@Column(name="coi_kp_phs")
	public ConflictOfInterestKPPHS getCoi_kp_phs() {
		return coi_kp_phs;
	}

	public void setCoi_kp_phs(ConflictOfInterestKPPHS coi_kp_phs) {
		this.coi_kp_phs = coi_kp_phs;
	}

	@Column(name="coi_pi_nonphs")
	public ConflictOfInterestPINonPHS getCoi_pi_nonphs() {
		return coi_pi_nonphs;
	}

	public void setCoi_pi_nonphs(ConflictOfInterestPINonPHS coi_pi_nonphs) {
		this.coi_pi_nonphs = coi_pi_nonphs;
	}

	@Column(name="coi_phs")
	public ConflictOfInterestPHS getCoi_phs() {
		return coi_phs;
	}

	public void setCoi_phs(ConflictOfInterestPHS coi_phs) {
		this.coi_phs = coi_phs;
	}

	@Column(name="equipment_form")
	public EquipmentForm getEquipment_form() {
		return equipment_form;
	}

	public void setEquipment_form(EquipmentForm equipment_form) {
		this.equipment_form = equipment_form;
	}

	@Column(name="timeline")
	public Timeline getTimeline() {
		return timeline;
	}

	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	@Column(name="budget_form")
	public BudgetFile getBudget_form() {
		return budget_form;
	}

	public void setBudget_form(BudgetFile budget_form) {
		this.budget_form = budget_form;
	}

}
