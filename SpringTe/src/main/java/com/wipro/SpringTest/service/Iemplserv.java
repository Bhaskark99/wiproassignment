package com.wipro.SpringTest.service;

import org.springframework.stereotype.Service;

import com.wipro.SpringTest.entity.Empolyee;

@Service
public interface Iemplserv {
	
	public Empolyee add(Empolyee emp);
	public Empolyee getById(int eid);

}
