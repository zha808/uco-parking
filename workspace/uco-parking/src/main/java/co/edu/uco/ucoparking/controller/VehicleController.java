package co.edu.uco.ucoparking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.ucoparking.features.vehicle.addvehicle.application.inputport.dto.AddVehicleDTO;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
	
	@GetMapping("/dummy")
	public AddVehicleDTO getVehicleDTODUmmy() {
		return new AddVehicleDTO();
	}

}
