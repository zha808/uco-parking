package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.impl;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.mapper.AddVehicleMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.AddVehicleInputPort;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl.AddVehicleUseCaseImpl;



@Service
@Transactional(rollbackFor = Exception.class)
public class AddVehicleInteractor implements AddVehicleInputPort {
	
	private AddVehicleUseCase useCase;
	private AddVehicleMapper mapper;
	
	public AddVehicleInteractor(AddVehicleUseCase useCase, AddVehicleMapper mapper) {
		this.useCase = useCase;
		this.mapper = mapper;
	}

	@Override
	public Void execute(AddVehicleDTO data) {
		AddVehicleDomain domain = mapper.toDomain(data); // map DTO -> Domain using MapStruct mapper
		return useCase.execute(domain);
	}

}
