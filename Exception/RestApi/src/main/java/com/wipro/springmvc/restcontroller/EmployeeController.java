package com.wipro.springmvc.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springmvc.entity.Employee;
import com.wipro.springmvc.execption.EmployeeNotFound;
import com.wipro.springmvc.serives.Employeeimpl;
import com.wipro.springmvc.serives.IEmployeeservice;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class EmployeeController {
	 @Autowired 
	 IEmployeeservice ie;
	
	@PostMapping("/create")
	public Employee creatEmployee(@RequestBody Employee emp)
	{
		return ie.insertEmp(emp);
	}
	@PutMapping("/update")
	public Employee updatEmp(@RequestBody Employee emp)
	{
		return ie.updateEmp(emp);
	}
    @GetMapping("/get/{eid}")
	public Employee getByid(@PathVariable int  eid) throws EmployeeNotFound
	{
    	Employee t=ie.getEmployeeByid(eid);
		if(t==null) {
			
			throw new EmployeeNotFound();
			
		}
		else
		{
			return t;
		}
	}
    @GetMapping("/allemp")
    public List<Employee> getallemp()
    {
    	return ie.getemp();
    }
    @DeleteMapping("/delete/{eid}")
    public ResponseEntity<String> deletbyid(@PathVariable int eid)
    {
    	return ie.delById(eid);
    }
   
}
