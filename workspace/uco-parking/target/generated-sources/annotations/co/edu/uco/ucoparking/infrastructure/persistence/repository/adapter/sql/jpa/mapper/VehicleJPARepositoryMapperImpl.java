package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.CustomerEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.IdTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.OrganizationEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.CustomerJPAEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.IdTypeJPAEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.OrganizationJPAEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleJPAEntity;
import co.edu.uco.ucoparking.infrastructure.persistence.repository.sql.jpa.entity.VehicleTypeJPAEntity;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T20:06:06-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.50.v20260317-1325, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class VehicleJPARepositoryMapperImpl implements VehicleJPARepositoryMapper {

    @Override
    public VehicleJPAEntity toJPARepository(VehicleEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UUID id = null;
        String plate = null;
        VehicleTypeJPAEntity vehicleType = null;
        CustomerJPAEntity customer = null;

        id = entity.getId();
        plate = entity.getPlate();
        vehicleType = vehicleTypeEntityToVehicleTypeJPAEntity( entity.getVehicleType() );
        customer = customerEntityToCustomerJPAEntity( entity.getCustomer() );

        VehicleJPAEntity vehicleJPAEntity = new VehicleJPAEntity( id, plate, vehicleType, customer );

        return vehicleJPAEntity;
    }

    @Override
    public VehicleEntity toEntity(VehicleJPAEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        VehicleEntity vehicleEntity = new VehicleEntity();

        return vehicleEntity;
    }

    protected VehicleTypeJPAEntity vehicleTypeEntityToVehicleTypeJPAEntity(VehicleTypeEntity vehicleTypeEntity) {
        if ( vehicleTypeEntity == null ) {
            return null;
        }

        UUID id = null;
        String name = null;

        id = vehicleTypeEntity.getId();
        name = vehicleTypeEntity.getName();

        VehicleTypeJPAEntity vehicleTypeJPAEntity = new VehicleTypeJPAEntity( id, name );

        return vehicleTypeJPAEntity;
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

    protected CustomerJPAEntity customerEntityToCustomerJPAEntity(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        UUID id = null;
        OrganizationJPAEntity organization = null;
        IdTypeJPAEntity idType = null;
        String idNumber = null;
        String fullName = null;
        String email = null;
        String phoneNumber = null;

        id = customerEntity.getId();
        organization = organizationEntityToOrganizationJPAEntity( customerEntity.getOrganization() );
        idType = idTypeEntityToIdTypeJPAEntity( customerEntity.getIdType() );
        idNumber = customerEntity.getIdNumber();
        fullName = customerEntity.getFullName();
        email = customerEntity.getEmail();
        phoneNumber = customerEntity.getPhoneNumber();

        CustomerJPAEntity customerJPAEntity = new CustomerJPAEntity( id, organization, idType, idNumber, fullName, email, phoneNumber );

        return customerJPAEntity;
    }
}
