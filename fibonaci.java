import java.util.*;
public class Fibonaci{
	public static void main(String[]args){
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		int a=0;
		int b=1;
		int c,d;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<number;++i){
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
	}
}