
public abstract class Vehicle {
	int vehicleID;
	String vehicleType;
	String brandName;
	int numOfDoors;
	int numOfWheels;
 	String colour;
	
	public Vehicle(int vehicleID, String vehicleType, String brandName, int numOfDoors, int numOfWheels, String colour) {
		this.vehicleID = vehicleID;
		this.vehicleType = vehicleType;
		this.brandName = brandName;
		this.numOfDoors = numOfDoors;
		this.numOfWheels = numOfWheels;
		this.colour = colour;		
	}
	
	
	public abstract int Charge();
		
	
	
	


}
