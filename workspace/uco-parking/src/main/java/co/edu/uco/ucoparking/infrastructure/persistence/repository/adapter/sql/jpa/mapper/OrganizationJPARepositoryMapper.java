package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.OrganizationJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.OrganizationJPAEntity;

@Mapper(componentModel = "spring")
public interface OrganizationJPARepositoryMapper {
	OrganizationJPAEntity toJPAEntity(OrganizationEntity entity);
	OrganizationEntity toRepository(OrganizationJPAEntity jpaEntity);

}
