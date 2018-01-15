import java.util.*;
public class ArrayReverse{
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many numbers you want to enter");
		int number=scan.nextInt();
		int swap;
		int array[]=new int[number];
		for(int i=0;i<number;i++){
			array[i]=scan.nextInt();
		}
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[i]){
					swap=array[i];
					array[i]=array[j];
					array[j]=swap;
				}
				
			}
			System.out.println(array[i]);
		}
		System.out.println("Largest number is:"+array[array.length-1]);
	}
}