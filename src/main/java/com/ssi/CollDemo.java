package com.ssi;

import java.util.ArrayList;



public class CollDemo {

	public static void main(String[] args) {
		
		int sone[]={50,60};
		int stwo[]={70,80};
		int sthree[]={85,95};
		
		ArrayList<int[]> list=new ArrayList<int[]>();
		list.add(sone); list.add(stwo); list.add(sthree);
		
		for(int ar[]:list){
			for(int n:ar){
				System.out.println(n);
			}
			System.out.println("__________________________________");
		}
		
		
		
		
/*
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
*/		

	}

}
