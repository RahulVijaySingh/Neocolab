package control_and_looping_statement;
import java.util.Scanner;
public class astrologer {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int date=scan.nextInt();
		int month =scan.nextInt();
		switch(month){
		
		case 1 : if((date>=22 && date <= 31) || ( date>= 1 && date<= 19)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Capricon");break;
		
		}
		case 2 : if((date>=20 && date <= 31) || ( date>= 1 && date<= 18)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Aquarius"); 
			break;
		}
		case 3 : if((date>=19 && date <= 29) || ( date>= 1 && date<= 20)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Pisces");break;
		}
			
		case 4 : if((date>=21 && date <= 31) || ( date>= 1 && date<= 19)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Aries");break;
		}
		case 5 : if((date>=20 && date <= 30) || ( date>= 1 && date<= 20)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Taurus");break;
		}
		case 6 : if((date>=21 && date <= 31) || ( date>= 1 && date<= 20)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Gemini");break;
		}
		case 7 : if((date>=21 && date <= 30) || ( date>= 1 && date<= 22)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Cancer");break;
		}
		case 8 : if((date>=23 && date <= 31) || ( date>= 1 && date<= 22)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Leo");break;
		}
		case 9 : if((date>=23 && date <= 31) || ( date>= 1 && date<= 22)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Virgo");break;
		}
		case 10 : if((date>=23 && date <= 30) || ( date>= 1 && date<= 22)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Libra");break;
		
		}
		case 11 : if((date>=23 && date <= 31) || ( date>= 1 && date<= 21)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Scorpio");break;
		}
		case 12 : if((date>=22 && date <= 31) || ( date>= 1 && date<= 21)) {
			System.out.println("Astrological sign for "+date+"-"+month+ "is Sagittarius");break;
		}

		default : System.out.println("Invalid Date/Month");
		}
		

	}

}
