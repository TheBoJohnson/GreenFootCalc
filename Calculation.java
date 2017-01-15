
public class Calculation {
	//constant variables for multipliers
	public final static int POINT_MULTIPLIER = 10; 
	
	public final static double CAR_SMALL = 10.0; 
	public final static double CAR_MEDIUM = 15.0;
	public final static double CAR_LARGE = 20.0;
	public final static double CAR_ELECTRIC = 5.0;
	public final static double MOTORCYCLE = 5.0; 
	public final static double WALK_BIKE = 0.0; 
	
	//calculates point total for distance traveled and travel method
	public static int getDistance(double distTraveled, double travelMethodConstant, int numPassengers){
		return  (int) (POINT_MULTIPLIER * (300 - (travelMethodConstant / numPassengers)) * distTraveled); 
	}
	
	//compare method compares point totals of other options
	public static String compareOtherOptions(double distTraveled, double travelOptionChosen, int numPassengers){
		String result = ""; 
		if(travelOptionChosen == CAR_SMALL){
			result = "If you had traveled in a medium car your point total would have been "
					+ getDistance(distTraveled, CAR_MEDIUM, numPassengers) + "\nIf you had traveled in a large car, "
					+ "your point total would have been " + getDistance(distTraveled, CAR_LARGE, numPassengers) + 
					"\nIf you had traveled by an electric car your total would have been " + getDistance(distTraveled, CAR_ELECTRIC, numPassengers)
					+ "\nIf you had traveled by motorcycle your total would have been " + getDistance(distTraveled, MOTORCYCLE, numPassengers) + 
					"\nIf you had walked or biked your point total would have been " + getDistance(distTraveled, WALK_BIKE, numPassengers) + ".";
		}
		else if(travelOptionChosen == CAR_MEDIUM){
			result = "If you had traveled in a small car your point total would have been "
					+ getDistance(distTraveled, CAR_SMALL, numPassengers) + "\nIf you had traveled in a large car, "
					+ "your point total would have been " + getDistance(distTraveled, CAR_LARGE, numPassengers) + 
					"\nIf you had traveled by an electric car your total would have been " + getDistance(distTraveled, CAR_ELECTRIC, numPassengers)
					+ "\nIf you had traveled by motorcycle your total would have been " + getDistance(distTraveled, MOTORCYCLE, numPassengers) + 
					"\nIf you had walked or biked your point total would have been " + getDistance(distTraveled, WALK_BIKE, numPassengers) + ".";	
		}
		else if(travelOptionChosen == CAR_LARGE){
			result = "If you had traveled in a medium car your point total would have been "
					+ getDistance(distTraveled, CAR_MEDIUM, numPassengers) + "\nIf you had traveled in a small car, "
					+ "your point total would have been " + getDistance(distTraveled, CAR_SMALL, numPassengers) + 
					"\nIf you had traveled by an electric car your total would have been " + getDistance(distTraveled, CAR_ELECTRIC, numPassengers)
					+ "\nIf you had traveled by motorcycle your total would have been " + getDistance(distTraveled, MOTORCYCLE, numPassengers) + 
					"\nIf you had walked or biked your point total would have been " + getDistance(distTraveled, WALK_BIKE, numPassengers) + ".";
		}
		else if(travelOptionChosen == CAR_ELECTRIC){
			result = "If you had traveled in a medium car your point total would have been "
					+ getDistance(distTraveled, CAR_MEDIUM, numPassengers) + "\nIf you had traveled in a large car, "
					+ "your point total would have been " + getDistance(distTraveled, CAR_LARGE, numPassengers) + 
					"\nIf you had traveled by a small car your total would have been " + getDistance(distTraveled, CAR_SMALL, numPassengers)
					+ "\nIf you had traveled by motorcycle your total would have been " + getDistance(distTraveled, MOTORCYCLE, numPassengers) + 
					"\nIf you had walked or biked your point total would have been " + getDistance(distTraveled, WALK_BIKE, numPassengers) + ".";
			
		}
		else if(travelOptionChosen == MOTORCYCLE){
			result = "If you had traveled in a medium car your point total would have been "
					+ getDistance(distTraveled, CAR_MEDIUM, numPassengers) + "\nIf you had traveled in a large car, "
					+ "your point total would have been " + getDistance(distTraveled, CAR_LARGE, numPassengers) + 
					"\nIf you had traveled by an electric car your total would have been " + getDistance(distTraveled, CAR_ELECTRIC, numPassengers)
					+ "\nIf you had traveled by a small car your total would have been " + getDistance(distTraveled, CAR_SMALL, numPassengers) + 
					"\nIf you had walked or biked your point total would have been " + getDistance(distTraveled, WALK_BIKE, numPassengers) + ".";
			
		}
		else{
			result = "If you had traveled in a medium car your point total would have been "
					+ getDistance(distTraveled, CAR_MEDIUM, numPassengers) + "\nIf you had traveled in a large car, "
					+ "your point total would have been " + getDistance(distTraveled, CAR_LARGE, numPassengers) + 
					"\nIf you had traveled by an electric car your total would have been " + getDistance(distTraveled, CAR_ELECTRIC, numPassengers)
					+ "\nIf you had traveled by motorcycle your total would have been " + getDistance(distTraveled, MOTORCYCLE, numPassengers) + 
					"\nIf you had traveled by a small car your point total would have been " + getDistance(distTraveled, CAR_SMALL, numPassengers) + ".";
		}
		return result; 
	}
	
	public static void main(String[] args){
		Account me = new Account("Bo", 2, 100, Calculation.CAR_ELECTRIC); 
		System.out.println(me.calcPoints());
		System.out.println(me.reportOtherOptions());
	}

}
