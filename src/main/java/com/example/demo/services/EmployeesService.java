package com.example.demo.services;

import com.example.demo.EmployeesMapper;
import com.example.demo.pojos.Employees;
import com.example.demo.pojos.EmployeesResponse;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService {


    public List<EmployeesResponse> getAllEmployees;
    @Autowired
    private EmployeesMapper mapper;

    @Autowired
    private EmployeeRepository repository;

    public List<EmployeesResponse> getAllEmployees(){

        Iterable<Employees> retrievedEmployees=repository.findAll();
        List<EmployeesResponse> employees= new ArrayList<>();

        for(Employees employee:retrievedEmployees) {

            employees.add(mapper.mapEmployees(employee));
            }
        return  employees;
        }



}
