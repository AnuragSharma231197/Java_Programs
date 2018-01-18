import java.util.*;
public class StringOc{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int count=0;
	System.out.println("Enter the String");
	String str=scan.nextLine();
	System.out.println("Enter the Character");
	char c=scan.next().charAt(0);
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++){
		if(ch[i]==c){
			count =count+1;
			}	
		}
		System.out.println(count);
	}
}