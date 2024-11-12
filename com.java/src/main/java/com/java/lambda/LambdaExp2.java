package com.java.lambda;

interface Addable{
	int add(int a,int b);
	
}

public class LambdaExp2 {
	public static void main(String[] args) {
		
		//Multiple parameters in lambda expression  
		Addable a1=(a,b)->{
			return a+b;
		};
		
		 // Multiple parameters with data type in lambda expression
		Addable a2=(int a,int b)->{
			return a*b;
		};
		
		System.out.println(a1.add(20, 100));
		System.out.println(a2.add(20, 100));
		
		
	}

}
