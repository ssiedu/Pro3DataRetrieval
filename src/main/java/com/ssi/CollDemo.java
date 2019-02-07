package com.ssi;

import java.util.ArrayList;



public class CollDemo {

	public static void main(String[] args) {

		String sone[]={"cricket","dance"};
		String stwo[]={"music","singing"};
		String sthree[]={"cooking","travelling"};
		
		ArrayList<String[]> list=new ArrayList<String[]>();
		
		list.add(sone); list.add(stwo); list.add(sthree);		
		
		
		for(String s[]:list){
			
			for(String str:s){
				System.out.println(str);
			}
			System.out.println("__________________________________________");
		}
		

	}

}
