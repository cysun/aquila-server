package edu.csula.aquila.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
@Table(name = "intake_form")
public class EquipmentForm {
	
	@Id
	@GeneratedValue
	Long id;
	
	@Column(name = "faculty_name")
	String facultyName;
	
	@Column
	String department;
	
	@Column(name = "proposal_title")
	String proposalTitle;
	
	@Column
	boolean extension;
	
	@Column(name = "extension_value")
	String extensionValue;
	
	@Column(name = "cost_share")
	boolean costShare;
	
	@Column
	boolean donation;
	
	@Column(name = "new_equipment")
	boolean newEquipment;
	// type of equipment
	
	@ElementCollection
	List<String> typeOfEquipment; 
	// location
	@Column(name = "building_location")
	String buildingLocation;
	@Column(name = "room_location")
	String roomLocation;
	// donation
	@Column(name = "is_donation")
	boolean isDonation;
	@Column(name = "company_donating")
	String companyDonating;
	@Column(name = "previous_use")
	String previousUse;
	// please check all that apply
	@Column(name = "space_modification_requirement")
	boolean spaceModificationRequirement;
	// electrical modification
	@Column(name = "electrical_modification")
	boolean electricalModification;
	@Column
	boolean volts;
	@Column
	boolean amps;
	@Column
	boolean phase;
	
	@Column(name = "dedicated_power")
	boolean dedicatedPower;
	@Column(name = "circuit_breaker_specification")
	boolean circuitBreakerSpecification;
	@Column(name = "motor_compressor_specification")
	boolean motorCompressorSpecification;
	@Column(name = "special_needs")
	boolean specialNeeds;
	@Column
	boolean FWR;
	
	@Column(name = "special_needs_string")
	String specialNeedsString;
	@Column(name = "fwr_paid_by")
	String fwrPaidBy;
	// hvac
	@Column
	boolean hvac;
	@Column(name = "air_chilled_water_flow")
	boolean airChilledWaterFlow;
	@Column
	boolean temperature;
	@Column(name = "humidity_control")
	boolean humidityControl;
	@Column(name = "supply_pressure")
	boolean supplyPressure;
	@Column(name = "central_package_unit")
	boolean centralPackageUnit;
	@Column(name = "special_work")
	boolean specialWork;
	@Column(name = "noise_requirement")
	boolean noiseRequirement;

	// plumbing
	@Column
	boolean plumbing;
	@Column
	boolean fluid;
	@Column(name = "flow_rate")
	boolean flowRate;
	@Column
	boolean pressure;
	@Column(name = "fluid_temperature")
	boolean fluidTemperature;
	@Column(name = "pump_compressor_motor")
	boolean pumpCompressorMotor;
	// NetworkRequirements
	@Column
	boolean maintenance;
	@Column(name = "license_requirements")
	boolean licenseRequirements;
	@Column
	boolean hardware;
	// hazardous material
	@Column(name = "hazardous_material")
	boolean hazardousMaterial;
	
	@ElementCollection
	@MapKeyColumn(name="chemical_name")
	@Column(name = "amount")
	@CollectionTable(name="chemicals", joinColumns=@JoinColumn(name="id"))
	Map<Integer, String> chemicals; // chem/quantity
	
	@Column(name = "radiation_use")
	String radiationUse;
	
	@Column(name = "maintenance_requirement")
	boolean maintenanceRequirement;
	
	@ElementCollection
	List<String> listOfRequirements;
	
	@Column(name = "size_of_equipment")
	boolean sizeOfEquipment;
	@Column
	int height;
	@Column
	int width; 
	@Column
	int length;
	
	@Column(name = "director_of_research_development_signature")
	Signature directorOfResearchDevelopmentSignature;
	
	@Column(name = "director_of_research_development_signature_date")
	Date directorOfResearchDevelopmentSignatureDate;
	
	@Column(name = "director_of_facilities_services_signature")
	Signature directorOfFacilitiesServicesSignature;
	
	@Column(name = "director_of_facilities_services_signature_date")
	Date directorOfFacilitiesServicesSignatureDate;

}
