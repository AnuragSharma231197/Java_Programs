import java.util.*;
public class Pn{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter the Number");
		float number=scan.nextFloat();
		
		if(number<0){
			System.out.println("No is Negative");
		}
		else if(number>0 && number<1){
			System.out.println("No is Small Positive");
		}
		else if(number>1 && number<10000){
			System.out.println("Number is Positive");
			}
		else if(number>10000){
			System.out.println("Number is Large Positive");
		}
		else{
			System.out.println("Error");
		}
		
		
		
	}
}