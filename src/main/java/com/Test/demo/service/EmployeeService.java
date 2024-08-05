package com.Test.demo.service;

import com.Test.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee add(Employee employee);
    public Employee getEmployee(Integer id);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(Integer id);

}
