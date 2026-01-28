package Hospita.HospitalAppointment.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @GetMapping("/appointment")
    public String appointmentInfo() {
        return service.create();
    }
    
    @GetMapping("/get-id")
	public String getId()
	{
		 return service.getid();
	}

    @PostMapping("/appointment")
    public String bookAppointment(@RequestBody Appointment appt) {
        return "Appointment booked with Dr. " + appt.getDoctor();
    }
}
