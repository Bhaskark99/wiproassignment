package com.wipro.springmvc.serives;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.springmvc.entity.Employee;
import com.wipro.springmvc.repq.Emplre;
@Service
public class Employeeimpl implements IEmployeeservice {
	@Autowired
	Emplre rep;

	@Override
	public Employee insertEmp(Employee emp) {
    return   rep.save(emp);
	
	}

	@Override
	public Employee updateEmp(Employee emp) {
		return rep.save(emp);
		
	}

	@Override
	public Employee getEmployeeByid(int eid) {
		
		return rep.findById(eid).orElse(null);
	}

	@Override
	public ResponseEntity<String> delById(int eid) {
		rep.deleteById(eid);
		return new ResponseEntity<String>("Recored", HttpStatus.OK);
	}

	@Override
	public List<Employee> getemp() {
		
		return rep.findAll();
	}

	@Override
	public Employee findByname(String anme) {
		
		return rep.findByEname(anme);
	}

	

	
}
