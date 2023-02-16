package control_and_looping_statement;

import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(i);
				
				if(i==j) {
					break;
				}
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++) {
				System.out.print(i);
				if(i==j) {
					break;
				}
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
		
		
	}
}
