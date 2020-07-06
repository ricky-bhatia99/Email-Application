package EmailApplication;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPassLength = 10;
	private String department;
	private int mailboxCapacity = 1000;
	private String email;
	private String altEmail;
	private String company = "projtestcomp.com";
	
	//Constructor for first/last name
	public Email(String fName, String lName)
	{
		this.firstName = fName;
		this.lastName = lName;
		System.out.println("EMPLOYEE: " + this.firstName + " " + this.lastName);
		
		//department
		this.department = setDept();
		//System.out.println("Department: " + this.department);
		
		//password
		this.password = passGen(defaultPassLength);
		//System.out.println("Your auto-generated password is: " + this.password);
		
		//Generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
		//System.out.println("Your email address is: " + email);
	}
	
	//Ask for department
	private String setDept()
	{
		System.out.print("DEPARTMENT CODES-\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter code: ");
		Scanner scan = new Scanner(System.in);
		int deptChoice = scan.nextInt();
		if (deptChoice == 1)
		{
			return("sales");
		}
		else if (deptChoice == 2)
		{
			return("dev");
		}
		else if (deptChoice == 3) 
		{
			return("acct");
		}
		else 
		{
			return("user");
		}
	}
	
	//Generate password randomly
	private String passGen(int pLength)
	{
		String passSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!@#$&56789";
		char[] password = new char[pLength];
		for (int i = 0; i < pLength; i++)
		{
			int rand = (int) (Math.random() * passSet.length()); //Math.random() is 0-1. Multiply it by length of String to go from 0-String size.
			password[i] = passSet.charAt(rand);
		}
		return new String(password);		
	}
	
	//Set mailbox capacity
	public void setMaiboxCap(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	//get mailbox cap
	public int getMailboxCap()
	{
		return this.mailboxCapacity;
	}
	
	//Set alt email
	public void setAltEmail(String altEmail)
	{
		this.altEmail = altEmail;
	}
	//get alt email
	public String getAltEmail()
	{
		return this.altEmail;
	}
	
	//Change password (set method)
	public void changePass(String changedPassword)
	{
		this.password = changedPassword;
	}
	//get changed password
	public String getChangePass()
	{
		return this.password;
	}
	
	//return information
	public String getInfo()
	{
		return ("Display Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email +
				"\nAuto-Generated Password: " + password +
				"\nMailbox Capacity: " + mailboxCapacity + " MB");
	}
	
}
