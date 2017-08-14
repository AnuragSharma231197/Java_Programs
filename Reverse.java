import java.util.*;

public class Reverse{
	public static void main(String []args){
		System.out.println("Enter your name: ");
		Scanner scan=new Scanner(System.in);
		String Name=scan.nextLine();
		StringBuilder str=new StringBuilder();
		System.out.println(" ");
		str.append(Name);
		System.out.println(str.reverse());
		
	}
		
		}