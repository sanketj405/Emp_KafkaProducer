package com.Test.demo.userRepository;

import com.Test.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Employee, Integer> {

}
