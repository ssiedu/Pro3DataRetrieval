package com.ssi;

import org.hibernate.Session;

public class ShowSingleProduct {

	public static void main(String[] args) {
		
		Session session=Data.getSF().openSession();
		Products p=session.get(Products.class, 111);
		System.out.println(p);

	}

}
