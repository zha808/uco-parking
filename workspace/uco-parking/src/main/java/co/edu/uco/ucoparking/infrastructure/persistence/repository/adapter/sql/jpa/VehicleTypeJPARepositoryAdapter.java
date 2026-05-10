package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleTypeRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;

@Repository
public class VehicleTypeJPARepositoryAdapter implements VehicleTypeRepository{

	@Override
	public List<VehicleTypeEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VehicleTypeEntity> findByFilter(VehicleTypeEntity filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VehicleTypeEntity findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
