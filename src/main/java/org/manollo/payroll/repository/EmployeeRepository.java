package org.manollo.payroll.repository;

import org.manollo.payroll.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * EmployeeRepository
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    
}