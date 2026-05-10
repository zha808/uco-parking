package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;

@Mapper(componentModel = "spring")
public interface AddVehicleDomainMapper {
	
	@Mapping(target = "id", ignore = true)
	AddVehicleDomain toDomain(AddVehicleDTO dto);
	
	AddVehicleDTO toDTO(AddVehicleDomain domain);
}
