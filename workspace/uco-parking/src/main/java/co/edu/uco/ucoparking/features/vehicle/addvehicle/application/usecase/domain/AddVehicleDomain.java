package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain;

import java.util.UUID;

import co.edu.uco.ucoparking.crosscuting.helper.TextHelper;
import co.edu.uco.ucoparking.crosscuting.helper.UUIDHelper;

public class AddVehicleDomain {
	private UUID id;
	private String plate;
	private UUID vehicleType;
	private UUID owner;
	
	
	public AddVehicleDomain(String plate, UUID vehicleType, UUID owner) {
		super();
		generateId();
		setPlate(plate);
		setVehicleType(vehicleType);
		setOwner(owner);
	}

	private void generateId() {
		this.id = UUIDHelper.getUUIDHelper().generateNewUUID();
	}

	public void regenerateId() {
		generateId();
	}

	public UUID getId() {
		return id;
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
