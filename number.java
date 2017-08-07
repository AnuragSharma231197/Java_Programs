import java.io.*;
import java.util.*;

public class number{
	public int number1;
	public int number2;
	
	public void sum(int num1, int num2){
		number1=num1;
		number2=num2;
		System.out.println(num1+num2);
	}
	public void sub(int num1, int num2){
		number1=num1;
		number2=num2;
		System.out.println(num1-num2);
	}
	
	public static void main(String []args){
		number num=new number();
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		if(x==1){
			num.sum(20,10);
		}
		else{
			num.sub(20,10);
		}
		
	}
}