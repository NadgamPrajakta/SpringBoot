package Hospita.HospitalAppointment.hospital;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AppointmentService {
	
   UUID uuid =UUID.randomUUID();
	
	public String getid()
	{
		return this.uuid+" ";
	}

    public String create() {
    	
        return "New appointment instance created";
    }
}
