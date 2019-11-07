package com.example.demo.repositories;

import com.example.demo.pojos.Units;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitsRepository extends CrudRepository<Units,Long> {

}
