// distance constant
public class Account {
	private String username; 
	private int numPassengers; 
	private double distance; 
	private double modeOfTransportation;
	
	public Account(){
		username = "default"; 
	}
	
	public Account(String u, int nP, double d, double mOT){
		username = u; 
		numPassengers = nP; 
		distance = d; 
		modeOfTransportation = mOT; 
	}
	
	public Account(Account p){
		username = p.username; 
		numPassengers = p.numPassengers; 
		distance = p.distance; 
		modeOfTransportation = p.modeOfTransportation;
	}
	
	public String getUsername(){
		return username; 
	}
	
	public int getNumPassengers(){
		return numPassengers;
	}
	
	public double getDistance(){
		return distance; 
	}
	public double getModeOfTransit(){
		return modeOfTransportation; 
	}
	
	public int calcPoints(){
		return Calculation.getDistance(distance, modeOfTransportation, numPassengers); 
	}
	
	public String reportOtherOptions(){
		return Calculation.compareOtherOptions(distance, modeOfTransportation, numPassengers);
	}
	
	
}
