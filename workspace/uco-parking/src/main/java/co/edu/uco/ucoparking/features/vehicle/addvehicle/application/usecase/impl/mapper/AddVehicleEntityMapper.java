package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.impl.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;

@Mapper(componentModel = "spring")
public interface AddVehicleEntityMapper {

	VehicleEntity toEntity(AddVehicleDomain domain);
	
	AddVehicleDomain toDomain(VehicleEntity entity);
}
