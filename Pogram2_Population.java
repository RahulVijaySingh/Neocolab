class Pogram2_Population {

	public static void main(String[] args) {
		int p_population = 312032486;
		int time=365*24*60*60;
		//every child birth in 7 second
		
		//one person die in 13 second
		// one immigrant in 45 second
		float popu = p_population;
		for(int i=0;i<5;i++) {
			
			float pop =(time/7)+(time/13)+(time/45);
			popu += pop;
			System.out.println("Population in "+(i+1)+" is "+popu);
			
		}
		
		

	}

}
