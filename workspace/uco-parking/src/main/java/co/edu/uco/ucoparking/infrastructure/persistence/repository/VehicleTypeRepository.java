package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;

public interface VehicleTypeRepository {
	List<VehicleTypeEntity> findAll();
	List<VehicleTypeEntity> findByFilter(VehicleTypeEntity filter);
	VehicleTypeEntity findById(UUID id);

}
