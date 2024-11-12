package interviewQuestions;

public class GdcOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// brute force approach
		int a=12,b=8;
		int gcd =0;
		for(int i=1; i<=a && i<=b; i++) {
			if(a%i == 0 && b%i ==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		//2nd type
		System.out.println(optimisedEuclid(a, b));
	}
	
	static int optimisedEuclid(int a,int b){
		while(a!=0 &&b!=0) {
			if(a>b) {
				a=a%b;
			}else {
				b= b%b;
			}
		}
		return a;
		
	}

}
