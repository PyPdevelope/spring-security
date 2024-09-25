package com.varun.spring_security.service;

import com.varun.spring_security.model.Employee;
import com.varun.spring_security.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository  = employeeRepository;
    }
    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
