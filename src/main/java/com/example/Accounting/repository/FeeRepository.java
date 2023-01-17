package com.example.Accounting.repository;

import com.example.Accounting.model.Fee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeRepository extends JpaRepository<Fee,Long> {

 Fee findByName(String name);






}
