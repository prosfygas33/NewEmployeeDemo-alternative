package com.example.demo.controllers;

import com.example.demo.pojos.GetAllEmployeesResponse;
import com.example.demo.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeesController {

    @Autowired
    private EmployeesService service;

    @GetMapping("/allEmployees")
    public GetAllEmployeesResponse getAllEmployees(){
        return new GetAllEmployeesResponse(service.getAllEmployees);
    }

}
