package EmployeeDetails.Employee.Model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
    	
        employees.add(new Employee(1, "Prajkta"));
        employees.add(new Employee(2, "Pratibha"));
    }

    public Employee getEmployeeById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
