package com.example.Employee_project;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.example.Employee_project.Employee;
import com.example.Employee_project.EmployeeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin("http://localhost:3000/")
public class EmpController {

    //EmployeeSerivce employeeSerivce = new EmployeeSerivceImpl();
    //Dependcy Injection
    @Autowired
    EmployeeSerivce employeeSerivce;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeSerivce.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        System.out.println("Yes me a raha hu ");
        return employeeSerivce.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        //employees.add(employee);
        return employeeSerivce.createEmployee(employee);

    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeSerivce.deleteEmployee(id))
            return "Delete Succesfully";
        return "Not found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeSerivce.updateEmployee(id, employee);
    }


}
