package com.wipro.springmvc.serives;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springmvc.entity.Employee;



public interface IEmployeeservice {
	
	public Employee insertEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	public Employee getEmployeeByid(int eid);
	public ResponseEntity<String> delById(int eid);

	public List<Employee> getemp();
	
	public Employee findByname(String anme);

}
