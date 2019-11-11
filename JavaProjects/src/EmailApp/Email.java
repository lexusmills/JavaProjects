package EmailApp;

import java.util.Scanner;
public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity =500;
	private int defaultPasswordLength =10;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//constructor to receive the first name and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("EMAIL Created:"+ this.firstname+""+ this.lastname); 
		
		//Call method asking for department- return the department 
		this.department = setDepartment();
		System.out.println("Department:"+this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:"+this.password);
		
		//combine elements to generate email
		email = firstname.toLowerCase()+"" + lastname.toLowerCase()+"@"+ department+"." + companySuffix;
		System.out.println("Your email is:"+email);
		}
		
		
		//Ask for department
		private String setDepartment() {
			System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
			Scanner in = new Scanner(System.in);
			int deptChoice= in.nextInt();
			if (deptChoice == 1) {return "sales";}
			else if (deptChoice == 2) {return "dev";}
			else if (deptChoice == 3) {return "acct";}
			else {return "";}
		}
		//Generate random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$%";
			char[] password = new char[length];
			for (int i=0; i<length; i++ ) {
				int rand = (int) (Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(rand);
			}
			return new String(password);
		}
		// Set the mailbox capacity
		public void setMailboxCapacity (int capacity) {
	} 
		//Set Alternate email 
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		//Change password
		public void ChangePassword(String password) {
			this.password = password;
		}
		
		public int getMailboxCapacity() { return mailboxCapacity;}
		public String getAlternateEmail() { return alternateEmail;}
		public String getPassord() {return password;}
		
		public String showInfo() {
			return "DISPLAY NAME:" + firstname+""+lastname+
					"COMPANY NAME"+ email+
					"MAILBOX CAPACITY:"+ mailboxCapacity+"mb";
		}
	


	}
	
	
	//Call method asking for department- return the department 
	
	//Call a method that returns a random password
	
	//combine elements to generate email
	
	//Ask for department
	
	//Generate random password
	
	// Set the mailbox capacity
	
	//Set Alternate email
	
	//Change password

