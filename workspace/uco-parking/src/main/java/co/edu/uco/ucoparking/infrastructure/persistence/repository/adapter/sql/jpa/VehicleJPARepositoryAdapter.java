package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.VehicleRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper.VehicleJPARepositoryMapper;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.VehicleJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleJPAEntity;

@Repository
public class VehicleJPARepositoryAdapter implements VehicleRepository{
	private VehicleJPARepository repository;
	private VehicleJPARepositoryMapper mapper;
	
	public VehicleJPARepositoryAdapter(final VehicleJPARepository repository, final VehicleJPARepositoryMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public void create(final VehicleEntity entity) {
		VehicleJPAEntity jpaEntity = mapper.toJPARepository(entity);
		repository.save(jpaEntity);
		
	}

	@Override
	public void update(final UUID id, final VehicleEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(final UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VehicleEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VehicleEntity> findByFilter(final VehicleEntity filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VehicleEntity findById(final UUID id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
