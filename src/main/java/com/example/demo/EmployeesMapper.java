package com.example.demo;


import com.example.demo.pojos.Employees;
import com.example.demo.pojos.EmployeesResponse;
import org.springframework.stereotype.Component;

@Component
public class EmployeesMapper {

    public EmployeesResponse mapEmployees(Employees employees){

        return new EmployeesResponse(
                employees.getId(),
                employees.getEntryNumber(),
                employees.getLastName(),
                employees.getFirstName(),
                employees.getAddress(),
                employees.getPhone(),
                employees.getHireDate(),
                employees.getFireDate(),
                employees.getStatus(),
                employees.getContract(),
                employees.getCompany(),
                employees.getBusiness(),
                employees.getDepartment(),
                employees.getUnits(),
                employees.getPosition()


        );

    }
}
