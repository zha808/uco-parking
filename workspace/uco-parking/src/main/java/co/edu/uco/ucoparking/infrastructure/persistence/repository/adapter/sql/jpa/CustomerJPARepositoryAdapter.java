package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.CustomerRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper.CustomerJPARepositoryMapper;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.CustomerJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJPAEntity;

@Repository
public class CustomerJPARepositoryAdapter implements CustomerRepository {
	
	private final CustomerJPARepository repository;
	private final CustomerJPARepositoryMapper mapper;
	
	public CustomerJPARepositoryAdapter (CustomerJPARepository repository, CustomerJPARepositoryMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public void create(CustomerEntity entity) {
		// CustomerEntity -> CustomerJPAEntity (Mapper)
		CustomerJPAEntity jpaEntity = mapper.toJPARepository(entity);
		repository.save(jpaEntity);
		
	}

	@Override
	public void update(UUID id, CustomerEntity entity) {
		// CustomerEntity -> CustomerJPAEntity (Mapper)
		
		
	}

	@Override
	public void delete(UUID id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<CustomerEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerEntity> findByFilter(CustomerEntity filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerEntity findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
