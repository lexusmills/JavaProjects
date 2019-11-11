package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// how many new students to add
		System.out.println("number of new students to enroll:");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create a number of students	
		for (int n = 0; n < numOfStudents; n++ ) {
			students[n] = new Student();
			students[n].enroll(); 
			students[n].payTuition(); 
			System.out.println(students[n].toString());
		}
		
	}
		

}
