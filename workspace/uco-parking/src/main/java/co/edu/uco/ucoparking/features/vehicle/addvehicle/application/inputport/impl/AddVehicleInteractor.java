package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.impl;

import org.springframework.stereotype.Service;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.AddVehicleInputPort;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.AddVehicleUseCase;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl.AddVehicleUseCaseImpl;
import jakarta.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class AddVehicleInteractor implements AddVehicleInputPort {
	
	private AddVehicleUseCase useCase;
	
	public AddVehicleInteractor(AddVehicleUseCase useCase) {
		this.useCase = useCase;
	}
	
	public AddVehicleInteractor(AddVehicleUseCaseImpl useCase) {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public Void execute(AddVehicleDTO data) {
		AddVehicleDomain domain = null;
		return useCase.execute(domain);
	}

}
