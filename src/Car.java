
public class Car extends Vehicle{

	
	public Car(int vehicleID, String brandName, String colour) {
		super(vehicleID, "Car", brandName, 4, 4, colour);
	}
	
	
	public static void Fly() {
		System.out.println("Flying...");
	}
	
	
	public int Charge() {
		return 1;
	}
	
	@Override
	public String toString() {
		return "Vehicle ID: " + this.vehicleID + " Vehicle Type: " + vehicleType + " Brand Name: " + this.brandName + " Doors: " + this.numOfDoors + " Wheels: " + this.numOfWheels + " Colour: " + this.colour + ". This vehicle will be charged £" + Charge();
	}
	

}
