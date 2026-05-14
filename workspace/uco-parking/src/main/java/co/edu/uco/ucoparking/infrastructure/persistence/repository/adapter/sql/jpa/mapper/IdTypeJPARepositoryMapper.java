package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.IdTypeJPARepository;

@Mapper(componentModel = "spring")
public interface IdTypeJPARepositoryMapper {
	IdTypeJPARepository toJPARepository(IdTypeEntity entity);
	IdTypeEntity toEntity(IdTypeJPARepository jpaEntity);
}
