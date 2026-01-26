package Uber.RideBookingApp.SmartCabApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	private final LocationService service;
	
	public LocationController(LocationService service) {
		
		this.service=service;
	}
	
	@PostMapping("/select")
	public String select(
			@RequestParam(required=true, defaultValue="Railway Station") String pickup,
			@RequestParam(required=true, defaultValue="Airport") String drop) {
		
		service.selectLocation(pickup,  drop);
		
		return "Location Selected";
	}
	

}
