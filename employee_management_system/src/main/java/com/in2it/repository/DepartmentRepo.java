package com.in2it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in2it.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
