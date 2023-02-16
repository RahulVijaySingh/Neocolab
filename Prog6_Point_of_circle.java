//To decide whether the point is in circle or not
import java.util.Scanner;
import java.lang.Math;
public class Prog6_Point_of_circle {

	public static void main(String[] args) {
		final int radius=10;
		Scanner scan= new Scanner (System.in);
		float x,y;
		System.out.print("Enter the two cordinates point of circle ");
		x=scan.nextFloat();
		y=scan.nextFloat();
		double length= Math.sqrt((x*x)+(y*y));     // since center of circle is zero
		if (length<=radius ) {
			System.out.print("Point ("+x+","+y+") is inside circle");
		}
		else {
			System.out.print("Point ("+x+","+y+") is outside the circle");	
		}
		}
}


