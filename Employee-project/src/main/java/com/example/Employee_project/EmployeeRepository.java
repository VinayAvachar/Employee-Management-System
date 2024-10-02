package com.example.Employee_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    //cutom method
    //List<EmployeeEntity> findByName(String name);
    //save, delete, finbyId , findall
}
