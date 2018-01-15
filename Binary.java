import java.util.*;
public class Binary{
	 public static void main(String args[])
        {
            Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			int count=0;
			String str=Integer.toString(num);
			int rem=0;
			int array[]=new int[str.length()];
			for(int i=0;i<str.length();i++){
				rem=num%10;
				array[i]=rem;
				num=num/10;
			}
			for(int i=0;i<array.length;i++){
				if(array[i]>1){
					count=count+1;
				}
			}
			if(count>0){
				System.out.println("Not Binary");
			}
			else{
				System.out.println("Binary");
			}
	}
}