package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;

public interface OrganizationRepository {
	List<OrganizationEntity> findAll();
	List<OrganizationEntity> findByFilter(OrganizationEntity filter);
	OrganizationEntity findById(UUID id);
}
