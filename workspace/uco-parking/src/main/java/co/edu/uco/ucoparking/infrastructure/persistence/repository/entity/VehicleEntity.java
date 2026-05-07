package co.edu.uco.ucoparking.infrastructure.persistence.repository.entity;

import java.util.UUID;



public class VehicleEntity {

	private UUID id;
	private String plate;
	private VehicleTypeEntity vehicleType;
	private CustomerEntity customer;
	
	
	public VehicleEntity(UUID id, String plate, VehicleTypeEntity vehicleType, CustomerEntity customer) {
		super();
		setId(id);
		setPlate(plate);
		setVehicleType(vehicleType);
		setCustomer(customer);
	}
	
	public UUID getId() {
		return id;
	}
	public String getPlate() {
		return plate;
	}
	public VehicleTypeEntity getVehicleType() {
		return vehicleType;
	}
	public CustomerEntity getCustomer() {
		return customer;
	}
	
	private void setId(UUID id) {
		this.id = id;
	}
	private void setPlate(String plate) {
		this.plate = plate;
	}
	private void setVehicleType(VehicleTypeEntity vehicleType) {
		this.vehicleType = vehicleType;
	}
	private void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	
	

}
