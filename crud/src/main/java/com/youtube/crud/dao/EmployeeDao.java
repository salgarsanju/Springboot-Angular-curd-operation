package com.youtube.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youtube.crud.entity.Employee;
@Repository

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
