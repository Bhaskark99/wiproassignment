package com.wipro.SpringTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.SpringTest.entity.Empolyee;
import com.wipro.SpringTest.repr.Iemrepr;
import com.wipro.SpringTest.service.Iemplserv;

@RestController
public class RestCtr {
	@Autowired
	Iemplserv pr;
	
	@PostMapping("/add")
	public Empolyee adddata(@RequestBody Empolyee emp)
	{
		return pr.add(emp);
	}
	@GetMapping("get/{eid}")
	public Empolyee getbyid(@PathVariable int eid)
	{
		return pr.getById(eid);
	}
	

}
