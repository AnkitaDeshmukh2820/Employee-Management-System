package com.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EMS.Entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>

{
	
}