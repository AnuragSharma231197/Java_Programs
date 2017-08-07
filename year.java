import java.util.*;
 public class year{
	 public static void main(String[]args){
		 System.out.println("Enter the time in minutes");
		 Scanner scan=new Scanner(System.in);
		 int minutes=scan.nextInt();
		 int years= minutes/365;
		 int days= (minutes%365)/24;
		 System.out.println(years+" Years "+days+" Days "+hours+" hours ");
		 
	  }
}