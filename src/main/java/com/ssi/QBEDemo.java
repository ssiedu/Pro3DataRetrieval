package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBEDemo {

	public static void main(String[] args) {
		
		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Products.class);
		Criterion crt1=Restrictions.eq("pcat", "auto");
		cr.add(crt1);
		List<Products> products=cr.list();
		for(Products pr:products){
			System.out.println(pr);
		}
		session.close();
		

	}

}
