package com.example.oracledemo.controller;

import com.example.oracledemo.entity.Employee;
import com.example.oracledemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private final EmployeeService service;

	public EmployeeController(EmployeeService service) {
		this.service = service;
	}

	@GetMapping
	public List<Employee> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Employee create(@RequestBody Employee emp) {
		return service.save(emp);
	}

	@GetMapping("/{id}")
	public Employee getById(@PathVariable Long id) {
		return service.getById(id);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "Deleted Employee with ID " + id;
	}
}
