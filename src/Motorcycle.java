
public class Motorcycle extends Vehicle{
	int engineSize;
	
	public Motorcycle(int vehicleID, String brandName, String colour, int engineSize) {
		super(vehicleID, "Motorcycle", brandName, 0, 2, colour);
		this.engineSize = engineSize;
	}
	public int Charge() {
		return 2;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID: " + this.vehicleID + " Vehicle Type: " + vehicleType + " Brand Name: " + this.brandName + " Doors: " + this.numOfDoors + " Wheels: " + this.numOfWheels + " Colour: " + this.colour + ". This vehicle will be charged £" + Charge();
	}
	

}
