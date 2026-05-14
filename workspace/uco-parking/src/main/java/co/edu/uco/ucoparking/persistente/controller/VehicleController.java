package co.edu.uco.ucoparking.persistente.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.AddVehicleInputPort;
import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;
import co.edu.uco.ucoparking.persistente.controller.dto.Response;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
	private final AddVehicleInputPort addVehicleInputPort;
	
    public VehicleController(final AddVehicleInputPort addVehicleInputPort) {
        this.addVehicleInputPort = addVehicleInputPort;
    }
	
	@GetMapping("/dummy")
	public AddVehicleDTO getVehicleDTODummy() {
		return new AddVehicleDTO();
	}
	
	@PostMapping
	public ResponseEntity<Response<AddVehicleDTO>> addVehicle( final @RequestBody AddVehicleDTO dto) {
		// Aquí se llamaría al interactor para agregar el vehículo
		Response<AddVehicleDTO> response = Response.createSuccededResponse();
		HttpStatus status = HttpStatus.OK;
		
		try {
			// Simulación de llamada al interactor
			// addVehicleInputPort.execute(dto);
			addVehicleInputPort.execute(dto);
			response.addMessage("Vehicle added successfully");
		} catch (Exception e) {
			response = Response.createFailedResponse();
			response.addMessage("Failed to add vehicle: " + e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<>(response, status);
	}

}
