package com.wipro.springmvc.repq;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springmvc.entity.Employee;



public interface Emplre extends JpaRepository<Employee, Integer>{
  

public Employee findByEname(String anme);

}
