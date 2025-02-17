package com.wipro.spring.service;

import java.util.List;

import com.wipro.spring.bean.Employee;

public interface IEmployeeService {

	public Employee insertEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	public Employee getEmployeeByid(int eid);

	public List<Employee> getemp();
}
