package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;

@Repository
public class VehicleJPARepositoryAdapter implements VehicleRepository{

	@Override
	public void create(VehicleEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UUID id, VehicleEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VehicleEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VehicleEntity> findByFilter(VehicleEntity filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VehicleEntity findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
