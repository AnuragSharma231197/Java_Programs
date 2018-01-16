import java.util.*;
public class FirstUpper{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	String Name=scan.nextLine();
	char ch[]=new char[Name.length()];
	String array[]=Name.split(" ");
	for(int i=0;i<Name.length();i++){
		ch[i]=Name.charAt(i);
		}
	int first=(int)ch[0];
	char convert=(char)(first-32);
	ch[0]=convert;
	int length=array[0].length();
	int second=(int)ch[length+1];
	char secondconvert=(char)(second-32);
	ch[length+1]=secondconvert;
	for(int i=0;i<ch.length;i++){
		System.out.print(ch[i]);
		}
		
	}
}