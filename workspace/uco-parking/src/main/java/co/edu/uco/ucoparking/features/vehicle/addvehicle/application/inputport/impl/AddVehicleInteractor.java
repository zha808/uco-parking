package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.AddVehicleInputPort;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper.AddVehicleDTOMapper;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;



@Service
@Transactional(rollbackFor = Exception.class)
public class AddVehicleInteractor implements AddVehicleInputPort {
	
	private AddVehicleUseCase useCase;
	private AddVehicleDTOMapper mapper;
	
	public AddVehicleInteractor(AddVehicleUseCase useCase, AddVehicleDTOMapper mapper) {
		this.useCase = useCase;
		this.mapper = mapper;
	}

	@Override
	public Void execute(AddVehicleDTO data) {
		AddVehicleDomain domain = mapper.toDomain(data); // map DTO -> Domain using MapStruct mapper
		return useCase.execute(domain);
	}

}
