package com.example.oracledemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.oracledemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
