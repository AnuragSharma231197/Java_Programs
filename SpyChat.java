import java.util.*;
import static java.lang.System.out;

public class SpyChat{

	public static void main(String[]args){
	
			out.println("Let's Get Started!!");
			
			Scanner scan=new Scanner(System.in); // Initializing Scannner
			
			out.println("Please enter your name spy");
			
			String Name=scan.nextLine();		// Scanning Name of Spy
			
			out.println("Please enter your salutation");
			
			String Salutation=scan.nextLine();			// Scanning Salutation of Spy
			
			
			if(Name.length()>0)
					{				// Condition to check name of Spy
			
			out.println("Hello"+" "+Name);
			
			out.println("Sorry");
			
			out.println("Hello"+" "+Salutation+Name);
					
					}
			else
				
				{
					
					out.println("Enter your name Please");
				
				}
			
			out.println("Enter your age spy");
			
			int age=scan.nextInt();				// Scanning Age of Spy
			
			if(age>18 && age<45)				// Comparing Spy based on age provided by him/her
				{
				
				out.println("You are fit to take assignments");
				
				}

			else if(age>=45 && age<60)
				
				{
			
				out.println("You have to take fitness test. Please report to HQ immediately");
				
				}
			
			else if(age>60)
				{
			
				out.println("Thank you for your sevrices Sir!! 100K $ are Credited to your account");

				}
			
			else if(age<18)
				{
			
				out.println("You are not Eligible for Assignments");
				
				}
				
				
			
			if(age>18 && age<60)
			{
			
			out.println("Enter Your rating?");
			
			float Rating=scan.nextFloat();		// Scanning Rating of Spy and giving them assignments
			
			if(Rating>=3.0 && Rating<4.0)
				{
			
				out.println("You are Eligible for Assignments");

				}
			else if(Rating>=4.0 && Rating <4.5)
				{
				
				out.println("You are Eligible for Higher Assignments");
				
				}
			
			else if(Rating>=4.5 && Rating <=5.0)
				{
				
				out.println("Welcome Mr."+Name);
				
				}
				else
				{
				
				out.println("Enter Valid Rating");
				
				}
				
				out.println("You Want to go online or not?");
				
				
				boolean Online=scan.nextBoolean();				// Scanning Status of Spy
				
				
			if(Online==true)
				{
				
				out.println("You are Online"+" "+Salutation+Name);

				}
			else if(Online==false)
				{
			
				out.println("Your Status is Offline"+" "+Salutation+Name);

				}
			else
				{
					
					out.println("Please Respond"+" "+Salutation+Name);
					
				}
			}
				
					
			}
			
		}

