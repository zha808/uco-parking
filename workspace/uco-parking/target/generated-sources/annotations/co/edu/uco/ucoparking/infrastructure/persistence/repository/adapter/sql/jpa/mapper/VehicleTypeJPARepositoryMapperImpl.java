package co.edu.uco.ucoparking.infrastructure.persistence.repository.adapter.sql.jpa.mapper;

import co.edu.uco.ucoparking.infrastructure.persistence.repository.entity.VehicleTypeEntity;
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
public class VehicleTypeJPARepositoryMapperImpl implements VehicleTypeJPARepositoryMapper {

    @Override
    public VehicleTypeJPAEntity toJPAEntity(VehicleTypeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UUID id = null;
        String name = null;

        id = entity.getId();
        name = entity.getName();

        VehicleTypeJPAEntity vehicleTypeJPAEntity = new VehicleTypeJPAEntity( id, name );

        return vehicleTypeJPAEntity;
    }

    @Override
    public VehicleTypeEntity toEntity(VehicleTypeJPAEntity jpaEntity) {
        if ( jpaEntity == null ) {
            return null;
        }

        VehicleTypeEntity vehicleTypeEntity = new VehicleTypeEntity();

        return vehicleTypeEntity;
    }
}
