package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl.mapper.AddVehicleEntityMapper;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleTypeRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;

@Service
public class AddVehicleUseCaseImpl implements AddVehicleUseCase {
	
	private CustomerRepository customerRepository;
	private VehicleRepository vehicleRepository;
	private VehicleTypeRepository vehicleTypeRepository;
	private AddVehicleEntityMapper mapper;
	
	public AddVehicleUseCaseImpl(CustomerRepository customerRepository, VehicleRepository vehicleRepository, 
			AddVehicleEntityMapper mapper) {
		this.customerRepository = customerRepository;
		this.vehicleRepository = vehicleRepository;
		this.mapper = mapper;
	}


	@Override
	public Void execute(AddVehicleDomain data) {
		// Addvehicledomain -> vehicleEntity - mapper
		
		VehicleEntity vehicleEntity = mapper.toEntity(data);
		vehicleRepository.create(vehicleEntity);
		return null;
	}

}
