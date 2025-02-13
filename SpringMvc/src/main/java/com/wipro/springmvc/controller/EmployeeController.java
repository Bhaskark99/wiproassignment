package com.wipro.springmvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.springmvc.bean.Employee;
import com.wipro.springmvc.dao.ModelEmpl;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	@ResponseBody
	public String getvalue()
	{
		return "empl.html";
	}
	@RequestMapping(value="/hell",method=RequestMethod.POST)
	public String display(@ModelAttribute Employee emp,HttpSession session)
	{
		ModelEmpl t=new ModelEmpl();
		Connection r=t.getcon();
		try {
			String q="insert into employee values(?,?,?)";
			PreparedStatement pst=r.prepareCall(q);
			pst.setInt(1,emp.getEid());
			pst.setString(2, emp.getEname());
			pst.setDouble(3, emp.getSalary());
			pst.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "display";
	}

}
