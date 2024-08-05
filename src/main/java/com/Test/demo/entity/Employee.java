package com.Test.demo.entity;

import jakarta.persistence.*;

@Entity
@Table (name="employeeData")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer EmployeeID;

    @Column
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getEmployeeID() {
        return EmployeeID;
    }

    public Employee(String name) {
        this.Name = name;
    }
    public Employee(){

    }

    @Override
    public String toString() {
        return "Entity1{" +
                "EmployeeID=" + EmployeeID +
                ", Name='" + Name + '\'' +
                '}';
    }
}
