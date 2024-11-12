package studentBaseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int year;
	private String studentId;
	private List<String> courses;
	private int tutionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	

	//constructor prompt userto enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.print("enetr student firstName: ");
		this.firstName = in.nextLine();
		
		System.out.print("enetr student lastName: ");
		this.lastName = in.nextLine();	
		
		System.out.print("1 - freshmen\n2 - sophmore\n3 - junior\n4 - senior\nEnter the  Student class level :");
		this.year = in.nextInt();
		
		setStudentId();
		enroll();
		payTution();
		System.out.println(showInfo());

		
//		System.out.println(this.firstName+ ""+this.lastName+ " "+this.year+"rd year id: "+studentId);
		
		
		}
	
	//generate a id
	private void setStudentId() {
		//grade level + id
		id++;
		this.studentId = year +""+id;
		
	}
	//enroll in courses
	public void enroll() {
		Scanner in = new Scanner(System.in);

		//get inside a loop user hits q for quit
		
		courses = new ArrayList<String>();
		
		do {
			System.out.print("enter a course to enroll or (q to quit): ");
			String course = in.nextLine();
		if(!course.equalsIgnoreCase("q")) {
			this.courses.add(course);
			tutionBalance = tutionBalance + costOfCourse;
		}
		else {
			System.out.println("break from course!");
			break;
		}
		}while(1 != 0); 
		 
//		System.out.println("ENROLLED IN : "+courses);
//		System.out.println("TUTION BALANCE :"+tutionBalance);
		
	}
	
	//view balance 
	public void viewBalance() {
		System.out.println("YOUR BALANCE...is $"+tutionBalance);
	}
	
	//pay tution
	public void payTution() {
		viewBalance();
		System.out.print("Enter ur payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank yu for payment of $"+payment);
		viewBalance();
	}
	
	//show status
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+
				"\nyear: "+year+
				"\nstudentId: "+studentId+
				"\nCourses Enrolled: "+courses 
				+"\nBalance : $"+tutionBalance;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", year=" + year + ", studentId="
				+ studentId + ", courses=" + courses + ", tutionBalance=" + tutionBalance + "]";
	}
	
	

}
