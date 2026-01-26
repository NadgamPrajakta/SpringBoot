package Uber.RideBookingApp.SmartCabApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ride")
public class RideController {

    private final RideService service;

    public RideController(RideService service) {
        this.service = service;
    }

    @PostMapping("/book")
    public String book(
            @RequestParam(required = true, defaultValue = "Sedan") String cabType,
            @RequestParam(required = true, defaultValue = "350") double fare) {

        service.bookRide(cabType, fare);
        return "Ride Booked";
    }
}
