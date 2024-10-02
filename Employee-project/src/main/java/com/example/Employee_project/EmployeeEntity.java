package com.example.Employee_project;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="emp_db")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;

    // Lombok will generate the following methods automatically:
    // public Long getId();
    // public String getName();
    // public String getPhone();
    // public String getEmail();
    // public void setId(Long id);
    // public void setName(String name);
    // public void setPhone(String phone);
    // public void setEmail(String email);
}
