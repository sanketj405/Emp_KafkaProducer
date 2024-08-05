package com.Test.demo.service;


import com.Test.demo.entity.Employee;
import com.Test.demo.exceptions.IDNotFound;
import com.Test.demo.userRepository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    Repo repo;

    @Override
    public Employee add(Employee employee) {
       return repo.save(employee);

    }

    @Override
    public Employee getEmployee(Integer id) {

        Optional<Employee> emp= repo.findById(id);
        if(emp.isPresent()){
            return emp.get();
        }
        else{
            throw new IDNotFound("ID not found");
        }

    }

    @Override
    public List<Employee> getAllEmployees() {
       return repo.findAll();
        }

    @Override
    public void deleteEmployee(Integer id) {
       repo.deleteById(id);
    }


}
