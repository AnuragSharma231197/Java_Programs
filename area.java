import java.util.*;
import java.io.*;
public class area{
public static void main(String[]args){
	System.out.println("Enter the Length and Breadth of Rectangle in cm");
	Console c=System.console();
	int Length=Integer.parseInt(c.readLine());
	int Breadth=Integer.parseInt(c.readLine());
	int area=Length*Breadth;
	int perimeter=2*(Length+Breadth);
	System.out.println(area);
	System.out.println(perimeter);

	}
}