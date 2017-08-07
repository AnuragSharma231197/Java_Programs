import java.util.*;

public class Temperature{

public static void Feh_Cel(int a){
	int celsius= (5*(a-32))/9;
	System.out.println(celsius);
	}

public static void main(String []args){
	System.out.println("Enter the Temperature in Fahrenhite");
	Scanner scan=new Scanner(System.in);
	int fahrenhite=scan.nextInt();
	Temperature T=new Temperature();
	T.Feh_Cel(fahrenhite);
	
	
		}

}