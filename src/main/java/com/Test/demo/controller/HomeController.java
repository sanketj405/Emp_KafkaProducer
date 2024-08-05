package com.Test.demo.controller;



import com.Test.demo.entity.Employee;
import com.Test.demo.exceptions.FieldMissing;
import com.Test.demo.service.EmployeeService;
import com.Test.demo.service.KafkaServicetest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/emp")
public class HomeController {
    @Autowired
    private EmployeeService userservice;
    @Autowired
    private KafkaServicetest kafkaServicetest;


    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
       //return ;
        if(!employee.getName().isEmpty()) {
            return ResponseEntity.status(HttpStatus.CREATED).body(userservice.add(employee));
        }
        else{
            throw new FieldMissing("Mandatory field missing");
        }
    }
    
    @GetMapping("/{EmployeeID}")
    public Employee getEmployee(@PathVariable Integer EmployeeID){
       return userservice.getEmployee(EmployeeID);
    }

    @GetMapping("/getalls")
    public List<Employee> getAllEmployees(Employee employee){
        return userservice.getAllEmployees();
    }

    @DeleteMapping("/delete/{EmployeeID}")
    public void deleteEmployee(@PathVariable Integer EmployeeID){
        userservice.deleteEmployee(EmployeeID);
    }

    @PostMapping("/location")
    public ResponseEntity<?> postLocation(){
        kafkaServicetest.updateLocation("co-ordinate");
        return new ResponseEntity<>(Map.of("Message", "Location Updated"),HttpStatus.OK);
    }

}
