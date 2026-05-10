package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.OrganizationRepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;

@Repository
public class OrganizationJPARepositoryAdapter implements OrganizationRepository {

	@Override
	public List<OrganizationEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrganizationEntity> findByFilter(OrganizationEntity filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrganizationEntity findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
