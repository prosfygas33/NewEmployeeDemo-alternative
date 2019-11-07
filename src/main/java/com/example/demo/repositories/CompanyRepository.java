package com.example.demo.repositories;

import com.example.demo.pojos.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {

}
