package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCProjectionDemo {
	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Criteria cr=session.createCriteria(Products.class);
			
		ProjectionList pList=Projections.projectionList();
		
		Projection p1=Projections.property("pname");
		Projection p2=Projections.property("price");
		Projection p3=Projections.property("pdesc");
		
		pList.add(p1); pList.add(p2); pList.add(p3);
		
		cr.setProjection(pList);
		
		
		List<Object[]> products=cr.list();
		
		
		for(Object ar[]:products){
			
			for(Object obj:ar){

				System.out.println(obj);
			}
			System.out.println("_______________________________________");
		}
		
		
		session.close();
	}
	
}
