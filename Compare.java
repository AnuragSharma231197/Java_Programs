import java.util.*;
public class Compare{
	public static void main(String []args){
		System.out.println("Enter the two numbers with minimum 3 digits");
		int number1=Integer.parseInt(System.console().readLine());
		int number2=Integer.parseInt(System.console().readLine());
		int []array1=new int[number1];
		int []array2=new int[number2];
		for(int i=0;i<array1.length;i++){
			array1[i]=Integer.parseInt(System.console().readLine());
		}
		for(int j=0;j<array2.length;j++){
			array2[j]=Integer.parseInt(System.console().readLine());
		}
		if(array1[0]==array2[0] && array1[1]==array2[1] && array1[2]==array2[2]){
			System.out.println("They are same");
		}
		else{
			System.out.println("Not same");
		}
	}
}