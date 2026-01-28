package System.SystemMonitoring.monitoring;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class SystemMonitor {

    public String health() {
    	
        return "System running normally";
    }
    
   UUID uuid =UUID.randomUUID();
	
	public String getid()
	{
		return this.uuid+" ";
	}
}
