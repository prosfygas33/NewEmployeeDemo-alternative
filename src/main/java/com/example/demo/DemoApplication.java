package com.example.demo;

import com.example.demo.pojos.*;
import com.example.demo.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner //to run code in application start up
{

	/* Remove Autowire in order not to have circular dependecies*/
	private final
	EmployeeRepository employeeRepository;

	private final
	DepartmentRepository departmentRepository;

	private final CompanyRepository companyRepository;

	private final BusinessRepository businessRepository;

	private final UnitsRepository unitsRepository;

	public DemoApplication(final EmployeeRepository employeeRepository, final DepartmentRepository departmentRepository,
			final CompanyRepository companyRepository, final BusinessRepository businessRepository, final UnitsRepository unitsRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
		this.companyRepository = companyRepository;
		this.businessRepository = businessRepository;
		this.unitsRepository = unitsRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public void run(String... args) throws Exception {

		Company newCompany = companyRepository.findById(1L).orElseThrow(() -> new RuntimeException("Wrong query in database Company"));
		Business newBusiness = businessRepository.findById(1L).orElseThrow(() -> new RuntimeException("Wrong query in database Business"));;
		Department newDepartment = departmentRepository.findById(1L).orElseThrow(() -> new RuntimeException("Wrong query in database Department"));
		Units newUnit = unitsRepository.findById(1L).orElseThrow(() -> new RuntimeException("Wrong query in database Department"));

		Employees employee1 = new Employees(1, "Giannopoulos", "Kostis", "salaminos 85", 1234, new Date(2017, Calendar.JANUARY, 17),
				new Date(2019, Calendar.FEBRUARY, 17),
				"ACTIVE", "ACTIVE", newCompany, newBusiness, newDepartment, newUnit, "Manager");

		Employees employee2 = new Employees(2, "Mathousas", "dim", "Olynthou 85", 124534, new Date(2017, Calendar.JANUARY, 17),
				new Date(2019, Calendar.FEBRUARY, 17),
				"ACTIVE", "ACTIVE", newCompany, newBusiness, newDepartment, newUnit, "Marketing");

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);

	}

}
