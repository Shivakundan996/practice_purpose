package com.java.lambda;

@FunctionalInterface
interface Drawable {
	public void draw();
}

public class LambdaExperssion1 {
	
	public static void main(String[] args) {
		int width=10;
		
		Drawable d1=()->{
			
			System.out.print("Hi "+ width);
		};
		d1.draw();
		
	}

}
