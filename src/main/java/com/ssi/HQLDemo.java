package com.ssi;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLDemo {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		
		/*String hql="select pname,price from Products";
		Query qr=session.createQuery(hql);
		List<Object[]> prodList=qr.list();		
		for(Object ar[]:prodList){
			for(Object obj:ar){
			System.out.println(obj);
			}
			System.out.println("__________________________________");
		}
		*/
		
		//String hql="from Products where price>:pricevalue";
		String hql="from Products where price>?";
		Query qr=session.createQuery(hql);
		//qr.setParameter("pricevalue", 90000);
		qr.setParameter(0, 100000);
		List<Products> prodList=qr.list();		
		for(Products p:prodList){
			System.out.println(p);
		}
		
		session.close();
	}

}
