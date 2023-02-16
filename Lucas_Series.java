package control_and_looping_statement;

import java.util.Scanner;
public class Lucas_Series {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int a=0;
		int b=0;
		int c=1;
		int nxt=(a+b+c);
		System.out.print(a+" "+b+" "+c);
		for(int i=4;i<=n;i++) {
			System.out.print(" "+nxt);
			a=b;
			b=c;
			c=nxt;
			nxt=a+b+c;
			
		}

	}

}
