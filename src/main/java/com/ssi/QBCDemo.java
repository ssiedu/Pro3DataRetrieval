package com.ssi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCDemo {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Products.class);
		
//		Order order1=Order.desc("price");
//		cr.addOrder(order1);
//		Order order2=Order.asc("pcode");
//		cr.addOrder(order2);
		
		
		//Criterion crt1=Restrictions.gt("price", 50000);
		//Criterion crt2=Restrictions.eq("pcat", "furniture");
		//Criterion crt3=Restrictions.and(crt1, crt2);
		
		//cr.add(crt1);
		//cr.add(crt2);
		//cr.add(crt3);
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("auto"); list.add("books");
		Criterion crt1=Restrictions.in("pcat", list);
		cr.add(crt1);
		
		Criterion crt2=Restrictions.between("price", 100000, 200000);
		cr.add(crt2);
		
		List<Products> products=cr.list();

		for(Products p:products){
			System.out.println(p);
		}
		
		session.close();
	}

}
