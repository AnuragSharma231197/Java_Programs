import java.util.*;
import java.lang.*;
public class age{
public static void main(String []args){
	System.out.println("Enter your age please");
	Scanner scan=new Scanner(System.in);
	int year=scan.nextInt();
	Calendar cal= Calendar.getInstance();
	int years=cal.get(Calendar.YEAR);
	int sub=100-year;
	int after100= sub+years;
	System.out.println(after100);
	
	
}


	}