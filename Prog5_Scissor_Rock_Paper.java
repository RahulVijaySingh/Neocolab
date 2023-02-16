
/*. (Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a 
rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, 
and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a 
message indicating whether the user or the computer wins, loses, or draws. Here are 
sample runs:*/

import java.io.*;
import java.util.Scanner;

public class Prog5_Scissor_Rock_Paper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comp=(int)Math.random()*3;
		System.out.print("Scissor(0) , rock(1), Paper(2) ");
		int user=scan.nextInt();
		
		
		
		System.out.print("The computer is ");
		switch (comp) {
		case 0 : System.out.print("Scissor ");break;
		case 1 : System.out.print("rock ");break;
		case 2 : System.out.print("paper ");break;
		}
		System.out.print(". You are ");
		switch (user) {
		case 0 : System.out.print("Scissor ");break;
		case 1 : System.out.print("rock ");break;
		case 2 : System.out.print("paper ");break;
		}
		
		
		if(user==comp) {
			System.out.println("Tie");
			
		}
		
		else {
			boolean win= (user==0 && comp==2)||(user==1 && comp==0)||(user==2 && comp==1) ;
			
			if(win)
			{
				System.out.println("You won");
			}
			else
				System.out.println("Computer won");
		}
		
		
		

	}

}
