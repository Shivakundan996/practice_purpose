package interviewQuestions;

public class A {

	void m1() throws ArrayIndexOutOfBoundsException{
		System.out.println("In m1 A");
	}
	}
	
	class B extends A{
		
		void m2() throws IndexOutOfBoundsException{
			System.out.println("In m2 B");
		}
	}
	
	class Test{
		public static void main(String[] args) {
			A a = new B();
			a.m1();
		}
	}

