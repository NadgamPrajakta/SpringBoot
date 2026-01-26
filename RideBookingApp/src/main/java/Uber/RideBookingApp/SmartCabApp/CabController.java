package Uber.RideBookingApp.SmartCabApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cab")
public class CabController {

    private final CabService service;

    public CabController(CabService service) {
        this.service = service;
    }

    @GetMapping("/search")
    public String search(
            @RequestParam(required = true, defaultValue = "Mini") String cabType) {

        service.searchCab(cabType);
        return "Cab Search Completed";
    }
}
