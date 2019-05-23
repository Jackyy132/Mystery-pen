
public class Van extends Vehicle{
	int Capacity;
	
	public Van(int vehicleID, String brandName, String colour, int Capacity) {
		super(vehicleID, "Van", brandName, 4, 2, colour);
		this.Capacity = Capacity;	
	}
	public int Charge() {
		return 3;
	}
	@Override
	public String toString() {
		return "Vehicle ID: " + this.vehicleID + " Vehicle Type: " + vehicleType + " Brand Name: " + this.brandName + " Doors: " + this.numOfDoors + " Wheels: " + this.numOfWheels + " Colour: " + this.colour + ". This vehicle will be charged £" + Charge();
	}

}
