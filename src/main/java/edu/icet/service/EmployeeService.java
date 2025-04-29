package edu.icet.service;

import edu.icet.dto.Employee;

public interface EmployeeService {
    Employee addEmployee();
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(Integer id);
    Employee deleteEmployeeById(Integer id);
}
