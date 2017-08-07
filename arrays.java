import java.util.*;

public class arrays{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int []array=new int[x];
		for(int i=0;i<x;i++){
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum+=i;
		}
		System.out.println(sum);
		
	}
}