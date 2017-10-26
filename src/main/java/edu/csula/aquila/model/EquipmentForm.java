package edu.csula.aquila.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class EquipmentForm {
	String facultyName;
	String department;
	String proposalTitle;
	boolean extension;
	String extensionValue;
	boolean costShare;
	boolean donation;
	boolean newEquipment;
	// type of equipment
	List<String> typeOfEquipment; 
	// location
	String buildingLocation;
	String roomLocation;
	// donation
	boolean isDonation;
	String companyDonating;
	String previousUse;
	// please check all that apply
	boolean spaceModificationRequirement;
	// electrical modification
	boolean electricalModification;
	boolean volts;
	boolean amps;
	boolean phase;
	boolean dedicatedPower;
	boolean circuitBreakerSpecification;
	boolean motorCompressorSpecification;
	boolean specialNeeds;
	boolean FWR;
	String specialNeedsString;
	String fwrPaidBy;
	// hvac
	boolean hvac;
	boolean airChilledWaterFlow;
	boolean temperature;
	boolean humidityControl;
	boolean supplyPressure;
	boolean centralPackageUnit;
	boolean specialWork;
	boolean noiseRequirement;

	// plumbing
	boolean plumbing;
	boolean fluid;
	boolean flowRate;
	boolean pressure;
	boolean fluidTemperature;
	boolean pumpCompressorMotor;
	// NetworkRequirements
	boolean maintenance;
	boolean licenseRequirements;
	boolean hardware;
	// hazardous material
	boolean hazardousMaterial;
	Map<String, Integer> chemicals; // chem/quantity
	String radiationUse;
	boolean maintenanceRequirement;
	List<String> listOfRequirements;
	boolean sizeOfEquipment;
	int height, width, length;
	Signature directorOfResearchDevelopmentSignature;
	Date directorOfResearchDevelopmentSignatureDate;
	Signature directorOfFacilitiesServicesSignature;
	Date directorOfFacilitiesServicesSignatureDate;

}
