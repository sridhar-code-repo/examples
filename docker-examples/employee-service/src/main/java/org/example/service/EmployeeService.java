package org.example.service;

import org.example.model.Employee;
import org.example.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(path = "/employee-service")
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        employeeRepo.save(employee);
        return "Success";
    }

    @GetMapping(path = "/{id}")
    public Employee getEmployee(@PathVariable(name = "id") String id) {
        return employeeRepo.findById(id).orElse(null);
    }
}
