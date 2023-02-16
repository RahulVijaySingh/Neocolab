package control_and_looping_statement;
import java.util.Scanner;
import java.lang.Math;
public class KparekarNumber {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int pwd;		
		int count=0;      // digit count
		int sum=0;        //sum of the new number formed after squaring
		
		
		pwd=(int)Math.pow(n, 2);
		
		int temp=pwd;
		while(temp!=0)
		{
			temp=temp/10;
			count++;     // tells the number of digit in pwd
			
		}
		if(count %2!=0)
		{
			count=count/2;
			
			for(int i= 1;i<=count+1;i++)
			{
				sum=(pwd%10)+sum;
				pwd=pwd/10;
			}
			for(int i=0;i<=count;i++)
			{
				sum=(pwd%10)+sum;
			}
			
		}
		
		else {
			while(pwd!=0) {
				sum=sum+(pwd%10);
				pwd=pwd/10;
				
			}
		}
		if(sum == n) {
			System.out.println("Kaprekar Number");
			
		}
		else {
			System.out.println("Not a Kaprekar Number");
		}
	}

}
