package com.example.demo.pojos;

import java.util.List;

public class GetAllEmployeesResponse {

    List<EmployeesResponse> employees;

    public GetAllEmployeesResponse(List<EmployeesResponse> employees) {
        this.employees = employees;
    }

    public List<EmployeesResponse> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeesResponse> employees) {
        this.employees = employees;
    }
}
