package StudentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstname;
	private String lastname;
	private int gradeYear;
	private String studentID;
	private String courses;
	private  int tuitionBalance;
	private static int costOfCourse=600;
	private static int id=100;
	
	
	//constructor prompts to enter name and year
	public Student() {
		Scanner In = new Scanner(System.in); 
		System.out.println("Enter student first name:");
		this.firstname = In.next();
		
		System.out.println("Enter student last name:");
		this.lastname = In.next();
		
		System.out.println("1-Freshman \n2- Sophomore\n3- Junion\n4- Senior\nEnter student class level:");
		this.gradeYear = In.nextInt();
		
		setStudentID();

		System.out.println(firstname+" "+lastname+gradeYear+ studentID);
	
			}
	//generate an ID
	
	private void setStudentID() {
		//grade level + student id
		id++; 
		this.studentID= gradeYear +""+ id; 
	}
	//Enroll in courses
	
	public void enroll() {
		//get inside loop, enter 0 done
		do {
		System.out.println("Enter course to enroll (Q to quit):");
		Scanner in = new Scanner(System.in);
		String course= in.nextLine();
		if (!course.equals ("Q")) {
			courses = courses +"\n"+ course;
			tuitionBalance = tuitionBalance + costOfCourse; 
		}
		else { 
			break;}
		} while (1 !=0);
		
		System.out.println("ENROLL IN:"+ courses);
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is$"+ tuitionBalance);
	}
	
	//Pay tuition 
	public void payTuition() {
	viewBalance();
	System.out.println("Enter your payment:$");
	Scanner in = new Scanner(System.in);
	int payment = in.nextInt();
	tuitionBalance = tuitionBalance - payment;
	System.out.println("Thank you for your payment of $"+ payment);
	viewBalance();
		
	}
	// Show status
	public String toString() {
		return "Name:" + firstname + "" + lastname+
				"\nGrade Level:"+gradeYear+
				"\nStudent ID:"+ studentID+
				"\nCourses Enrolled:" + courses + 
				"\nBalance: $" + tuitionBalance;
	}
}
