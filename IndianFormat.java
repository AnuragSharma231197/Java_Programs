import java.util.*;
public class IndianFormat{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int number=scan.nextInt();
	int rem=0;
	int num=0;
	int array[]=new int[6];
	for(int i=0;i<number;i++){
		rem=number/1000;
		num=number%1000;
		}
		
		System.out.println(rem+"Thousand"+num);
	}
}