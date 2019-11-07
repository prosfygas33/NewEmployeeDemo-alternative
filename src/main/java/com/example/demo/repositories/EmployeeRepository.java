package com.example.demo.repositories;

import com.example.demo.pojos.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees,Long> {

}
