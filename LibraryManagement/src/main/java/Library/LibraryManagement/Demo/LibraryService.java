package Library.LibraryManagement.Demo;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class LibraryService {

    public String status() {
        return "Library service initialized once";
    }
    

	UUID uuid =UUID.randomUUID();
	
	public String getid()
	{
		return this.uuid+" ";
	}
}
