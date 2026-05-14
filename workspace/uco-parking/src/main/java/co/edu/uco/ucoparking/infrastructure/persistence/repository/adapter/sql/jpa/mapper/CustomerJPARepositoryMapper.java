package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import org.mapstruct.Mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.CustomerJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJPAEntity;

@Mapper(componentModel = "spring")
public interface CustomerJPARepositoryMapper {
	CustomerJPAEntity toJPARepository(CustomerEntity entity);
	CustomerEntity toEntity(CustomerJPARepository jpaEntity);
}
