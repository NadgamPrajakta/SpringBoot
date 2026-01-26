package Uber.RideBookingApp.SmartCabApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusService service;

    public StatusController(StatusService service) {
        this.service = service;
    }

    @GetMapping("/ride")
    public String status(
            @RequestParam(required = true, defaultValue = "Driver Arriving") String status) {

        service.checkStatus(status);
        return "Ride Status Checked";
    }
}
