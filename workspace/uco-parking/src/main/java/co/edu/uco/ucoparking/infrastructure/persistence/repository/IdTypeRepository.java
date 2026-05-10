package co.edu.uco.ucoparking.infrastructure.persistence.repository;

import java.util.List;
import java.util.UUID;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;

public interface IdTypeRepository {
	List<IdTypeEntity> findAll();
	List<IdTypeEntity> findByFilter(IdTypeEntity filter);
	IdTypeEntity findById(UUID id);
}
