import java.util.*;
public class Last{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Elements");
		int number=scan.nextInt();
		int array[]=new int[number];
		for(int i=0;i<number;i++){
			array[i]=scan.nextInt();
		}
		if(array[array.length-1]==6 || array[0]==6){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}