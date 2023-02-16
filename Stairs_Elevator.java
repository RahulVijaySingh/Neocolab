package control_and_looping_statement;
import java.util.Scanner;
import java.lang.Math;


public class Stairs_Elevator {

	public static void main(String[] args) {
		
		// since sin(theta)=perpendicular/hypotenous
		//sin(45)=N/distance of stairs 
		//==> 1/sqrt(2) = N / distance of stairs
		//==> distance of stairs= N*sqrt(2)
		int n;
		
		
		double v1;      //speed through stairs
		double d1;
		double t1;
		
		double v2;      //speed through elevator
		double d2;
		double t2;

		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		v1=scan.nextDouble();
		v2=scan.nextDouble();
		
		d1=2*Math.sqrt(2)*n;     // since elevator travels from ground to nth floor  and again moves to ground floor
		t1=d1/v1;
		
		
		//for elevator
		d2=2*n;
		t2=d2/v2;
		if(t1>t2) {
			System.out.println("Stairs");
			
		}
		else {
			System.out.println("Elevator");
		}
		
		
		
		
	}

}
