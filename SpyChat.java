import java.util.*;
import static java.lang.System.out;
public class SpyChat{
public static void main(String[]args){
	out.println("Let's Get Started!!");
	Scanner scan=new Scanner(System.in); // Initializing Scannner
	out.println("Please enter your name spy");
	String Name=scan.nextLine();		// Scanning Name of Spy
	if(Name.length()>0){				// Condition to check name of Spy
	out.println("Hello"+" "+Name);
	out.println("Please enter your salutation");
	String Salutation=scan.nextLine(); 	// Scanning Salutation of Spy
	out.println("Hello"+" "+Salutation+Name);
		}
		else{
			out.println("Enter your name Please");
		}
	out.println("Enter your age spy");
	int age=scan.nextInt();
	if(age>18 && age<45){
		out.println("You are fit to take assignments");
			}
	else if(age>45 && age<60){
		out.println("You have to take fitness test. Please report to HQ immediately");
			}
	else if(age>60){
		out.println("Thank you for your sevrices Sir!! 100K $ are Credited to your account");
			}
	else if(age<18){
		out.println("You are not Eligible for Assignments");
			}
			
			
	}
	
}

