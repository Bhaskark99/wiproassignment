package com.wipro.SpringTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wipro.SpringTest.entity.Empolyee;
import com.wipro.SpringTest.repr.Iemrepr;
@Service
public class Emplservice implements Iemplserv {
    @Autowired
	Iemrepr re;
	@Override
	public Empolyee add(Empolyee emp) {
		
		return re.save(emp);
	}

	@Override
	public Empolyee getById(int eid) {
		
		return re.findById(eid).orElse(null);
	}
	
	

	
}
