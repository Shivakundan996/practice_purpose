package studentBaseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentBaseApp {

	public static void main(String[] args) {
		//ask how many new users we want to add
		System.out.println("enter number of students: ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		
		
		
		
		List<Student> studentList = new ArrayList<Student>();

		for(int i=0;i<numberOfStudents;i++) {
			studentList.add(new Student());

		}
		System.out.println(studentList.toString());
	}
}
