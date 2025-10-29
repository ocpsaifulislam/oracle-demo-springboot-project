package com.example.oracledemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
@Data
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "SALARY")
	private Double salary;
}
