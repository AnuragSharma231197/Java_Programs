import java.util.*;
public class Fizz{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int start=scan.nextInt();
	int end=scan.nextInt();
	int size=end-start;
	int array[]=new int[size];
	for(int i=0;i<size;i++){
		array[i]=start;
		start=start+1;
		
		}
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}
}