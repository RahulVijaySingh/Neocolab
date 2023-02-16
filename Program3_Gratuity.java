
import java.io.*;
import java.util.Scanner;
public class Program3_Gratuity {

	public static void main(String[] args) {
		float subtotal,gratuity;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sutotal and a gratuity rate: ");
		subtotal= scan.nextInt();
		gratuity= scan.nextInt();
		float grat_percnt=(gratuity/10);
		float total= (grat_percnt+subtotal);
		System.out.println("The gratuity is $"+grat_percnt+" and total is $"+total);
	}

}

