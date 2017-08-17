import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import static java.lang.System.out;
public class RockPaper{
	public static void main(String []args){
		out.println("Let's play Rock, Paper, Scissor");
		Scanner scan=new Scanner(System.in);
		out.println("Please enter your choice");
		out.println("1=Rock, 2=Paper, 3=Scissor");
		int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
		int UserNumber=scan.nextInt();
		if(randomNum==UserNumber){
			out.println("Draw");
		}
		else if(randomNum==1 && UserNumber==2){
			out.println("You Wins");
		}
		else if(randomNum==1 && UserNumber==3){
			out.println("Computer Wins");
		}
		else if(randomNum==2 && UserNumber==1){
			out.println("Computer Wins");
		}
		else if(randomNum==2 && UserNumber==3){
			out.println("You Wins");
		}
		else if(randomNum==3 && UserNumber==1){
			out.println("You Wins");
		}
		else if(randomNum==3 && UserNumber==2){
			out.println("Computer Wins");
		}
		else{
			out.println("Error");
		}
	}
}