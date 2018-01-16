import java.util.*;
public class Sorting{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int array[]=new int[size];
	int temp=0;
	for(int i=0;i<size;i++){
		array[i]=scan.nextInt();
		}
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}