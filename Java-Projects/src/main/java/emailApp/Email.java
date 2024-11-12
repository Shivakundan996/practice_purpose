package emailApp;
import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = ".cgi.com";
	
	/**constructor to recieve the fname and lname*/
	public Email(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;  
//		System.out.println("EMAIL CREATED : "+this.firstName+"."+this.lastName);
		
		//call a method asking for department - return department
		this.department = setDepartment();
//		System.out.println("department: "+this.department);
		
		//call a method to generate radom password
		this.password =  randomPassword(defaultPasswordLength);
		System.out.println("your password is :"+this.password);
		
		//cobine elemnts to genrate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
//		System.out.println("your email is : "+email);

	}
	
	/*ask for department*/
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for sales\n2 for development\n3 for accounting\n0 for none\n Enter the department codes: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		if(deptChoice == 1) {
			return "sales";
		}
		else if(deptChoice == 2) {
			return "development";
		}
		else if(deptChoice == 3) {
			return "accounting";
		}
		
		return "";
	}
	
	
	/*genearte a random password*/
	private String randomPassword(int length) {
		String passwordSet = "kjhgqwertyuiopasdfghjklzxcvbnm123456!@#(*&";
		char[] password = new char[length];
		
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			}
		
		return new String(password) ;
		
	}
	
	/*set mailbox capacity*/
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;//here this.mailBoxCapacity dont have any ambiguity but this a best practice to use in model class.
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	/*set the alternate email*/
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	/*chnage the password*/
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getChangePassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME:"+firstName+" "+lastName+
				"\nCOMPANY EMAIL:"+ email+
				"\nMAILBOX CAPACITY: "+ mailBoxCapacity+ "mb";
	}
	
}
