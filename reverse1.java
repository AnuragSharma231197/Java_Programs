import java.util.*;
public class Reverse1{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		String num=scan.nextLine();
		char[] try1=num.toCharArray();
		for(int i=(try1.length-1);i>=0;i--){
			System.out.print(try1[i]);
		}



		}
}