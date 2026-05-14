package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.CustomerJPARepository;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJPAEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.IdTypeJPAEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.OrganizationJPAEntity;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T20:06:06-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.50.v20260317-1325, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class CustomerJPARepositoryMapperImpl implements CustomerJPARepositoryMapper {

    @Override
    public CustomerJPAEntity toJPARepository(CustomerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UUID id = null;
        OrganizationJPAEntity organization = null;
        IdTypeJPAEntity idType = null;
        String idNumber = null;
        String fullName = null;
        String email = null;
        String phoneNumber = null;

        id = entity.getId();
        organization = organizationEntityToOrganizationJPAEntity( entity.getOrganization() );
        idType = idTypeEntityToIdTypeJPAEntity( entity.getIdType() );
        idNumber = entity.getIdNumber();
        fullName = entity.getFullName();
        email = entity.getEmail();
        phoneNumber = entity.getPhoneNumber();

        CustomerJPAEntity customerJPAEntity = new CustomerJPAEntity( id, organization, idType, idNumber, fullName, email, phoneNumber );

        return customerJPAEntity;
    }

    @Override
    public CustomerEntity toEntity(CustomerJPARepository jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        return customerEntity;
    }

    protected OrganizationJPAEntity organizationEntityToOrganizationJPAEntity(OrganizationEntity organizationEntity) {
        if ( organizationEntity == null ) {
            return null;
        }

        UUID id = null;
        String name = null;

        id = organizationEntity.getId();
        name = organizationEntity.getName();

        OrganizationJPAEntity organizationJPAEntity = new OrganizationJPAEntity( id, name );

        return organizationJPAEntity;
    }

    protected IdTypeJPAEntity idTypeEntityToIdTypeJPAEntity(IdTypeEntity idTypeEntity) {
        if ( idTypeEntity == null ) {
            return null;
        }

        UUID id = null;
        String name = null;

        id = idTypeEntity.getId();
        name = idTypeEntity.getName();

        IdTypeJPAEntity idTypeJPAEntity = new IdTypeJPAEntity( id, name );

        return idTypeJPAEntity;
    }
}
