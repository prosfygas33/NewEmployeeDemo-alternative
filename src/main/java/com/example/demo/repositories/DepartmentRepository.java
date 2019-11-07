package com.example.demo.repositories;

import com.example.demo.pojos.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {

}
