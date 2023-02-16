/*(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the sum 
of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the 
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93*/

import java.util.Scanner;
import java.io.*;
public class Prog4_sumOfdigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number between 0 to 1000 ");
		int num;
		int sum=0;
		num= scan.nextInt();
		while(num!=0) {
			sum=(num%10)+sum;
			num=num/10;
			
			
		}
		System.out.println("Sum of the digits is "+sum);
		

	}

}
