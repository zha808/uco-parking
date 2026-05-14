package co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.mapper;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.usecase.domain.AddVehicleDomain;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-13T20:06:06-0500",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.50.v20260317-1325, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class AddVehicleDTOMapperImpl implements AddVehicleDTOMapper {

    @Override
    public AddVehicleDomain toDomain(AddVehicleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        String plate = null;
        UUID vehicleType = null;
        UUID owner = null;

        plate = dto.getPlate();
        vehicleType = dto.getVehicleType();
        owner = dto.getOwner();

        AddVehicleDomain addVehicleDomain = new AddVehicleDomain( plate, vehicleType, owner );

        return addVehicleDomain;
    }

    @Override
    public AddVehicleDTO toDTO(AddVehicleDomain domain) {
        if ( domain == null ) {
            return null;
        }

        AddVehicleDTO addVehicleDTO = new AddVehicleDTO();

        return addVehicleDTO;
    }
}
