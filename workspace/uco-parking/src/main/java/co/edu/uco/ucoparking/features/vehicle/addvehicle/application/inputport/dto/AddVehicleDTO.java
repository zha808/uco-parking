package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscuting.helper.TextHelper;
import co.edu.uco.ucoparking.crosscuting.helper.UUIDHelper;

public class AddVehicleDTO {
	private String plate;
	private UUID vehicleType;
	private UUID owner;
	
	public AddVehicleDTO() {
		super();
	}
		
	
	public AddVehicleDTO(String plate, UUID vehicleType, UUID owner) {
		super();
		setPlate(plate);
		setVehicleType(vehicleType);
		setOwner(owner);
	}
	
	public String getPlate() {
		return plate;
	}
	public UUID getVehicleType() {
		return vehicleType;
	}
	public UUID getOwner() {
		return owner;
	}
	
	private void setPlate(String plate) {
		this.plate = TextHelper.getDefaultWithTrim(plate);
	}
	private void setVehicleType(UUID vehicleType) {
		this.vehicleType = UUIDHelper.getUUIDHelper().getDefault(vehicleType);
	}
	private void setOwner(UUID owner) {
		this.owner = UUIDHelper.getUUIDHelper().getDefault(owner);
	}

}
