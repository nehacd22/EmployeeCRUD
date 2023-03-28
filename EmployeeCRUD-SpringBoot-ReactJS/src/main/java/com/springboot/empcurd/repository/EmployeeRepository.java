//package net.javaguides.springboot.repository;
package com.springboot.empcurd.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.empcurd.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
