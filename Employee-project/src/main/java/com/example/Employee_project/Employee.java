package com.example.Employee_project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String phone;
    private String email;

    // No need to manually define getters and setters
    // Lombok's @Data annotation will automatically generate them.
}
