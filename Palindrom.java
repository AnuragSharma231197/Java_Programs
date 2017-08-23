import java.util.*;
public class Palindrom{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	String Name=scan.nextLine();
	StringBuilder str=new StringBuilder();
	str.append(Name);
	if(Name.equals(str.reverse().toString()))
	
	{
		System.out.println("Palindrom String");
	}
	else{
		System.out.println("Not Palindrom");
	}
	
	

	}
}