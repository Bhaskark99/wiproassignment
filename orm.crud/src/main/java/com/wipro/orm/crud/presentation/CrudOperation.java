package com.wipro.orm.crud.presentation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.spi.SessionFactoryBuilderFactory;

import com.mysql.cj.xdevapi.SessionFactory;
import com.wipro.orm.crud.entity.Employe;
import com.wipro.orm.crud.entity.dao.HibernateUtil;

public class CrudOperation {

	public static void main(String[] args) {
		 org.hibernate.SessionFactory sf=HibernateUtil.getSessionFactory();
		 Session se=  sf.openSession();
		 Transaction tr=se.beginTransaction();
		 Employe emp=new Employe(101, "King", 50000);
		 se.save(emp);
		 tr.commit();

	}

}
