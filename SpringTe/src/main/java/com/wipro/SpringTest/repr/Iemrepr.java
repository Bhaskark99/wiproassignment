package com.wipro.SpringTest.repr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.SpringTest.entity.Empolyee;
@Repository
public interface Iemrepr extends JpaRepository<Empolyee, Integer>{

}
