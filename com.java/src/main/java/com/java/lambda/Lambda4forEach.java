package com.java.lambda;

import java.util.*;

public class Lambda4forEach {
	public static void main(String[] args) {
		  List<String> list=new ArrayList<String>();  
		   
	       list.add("ankit");  
	       list.add("mayank");  
	       list.add("irfan");  
	       list.add("jai");  
	       
	       list.forEach(n->{
	    	   System.out.println(n);
	       });
		
	}
	 

}
