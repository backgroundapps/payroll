package org.manollo.payroll;

import org.manollo.payroll.model.Employee;
import org.manollo.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * DatabaseLoader
 */
@Component
public class DatabaseLoader implements CommandLineRunner{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

	@Override
	public void run(String... args) throws Exception {
		this.employeeRepository.save(new Employee("Froodo", "Baggins", "ring bearer"));
	}
    
    
}