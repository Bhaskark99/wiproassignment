package com.wipro.orm.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Info")
public class Employe {
	@Id
	private int eid;
	@Column(name="emp_name")
	private String ename;
	private double salary;
	public Employe() {
		
	}
	public Employe(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
