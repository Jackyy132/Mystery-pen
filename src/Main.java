import java.util.Scanner;
public class Main {
	public static void main(String[] Jacky) {
		Scanner input = new Scanner(System.in);
		
		String UserChoice = "";
		int VehicleID;
		String Brand;
		String Colour;
		int EngineSize;
		int Capacity;
		
		System.out.println("Please enter a choice:");
		UserChoice = input.next();
		
		
		switch(UserChoice) {
		case "c":
			System.out.println("What is the Vehicle ID?");
			VehicleID = input.nextInt();
			System.out.println("What is the Brand?");
			Brand = input.next();
			System.out.println("What is the colour?");
			Colour = input.next();
			Car c = new Car(VehicleID, Brand, Colour);
			Garage.Store(c);
			c.toString();
			
			

		case "m":
			System.out.println("What is the Vehicle ID?");
			VehicleID = input.nextInt();
			System.out.println("What is the Brand?");
			Brand = input.next();
			System.out.println("What is the colour?");
			Colour = input.next();
			System.out.println("What is the engine size?");
			EngineSize = input.nextInt();
			Motorcycle m = new Motorcycle(VehicleID, Brand, Colour, EngineSize);
			Garage.Store(m);
			
		case "v":
			System.out.println("What is the Vehicle ID?");
			VehicleID = input.nextInt();
			System.out.println("What is the Brand?");
			Brand = input.next();
			System.out.println("What is the colour?");
			Colour = input.next();
			System.out.println("What is the capacity?");
			Capacity = input.nextInt();
			Van v = new Van(VehicleID, Brand, Colour, Capacity);
			Garage.Store(v);
			
			
			
			
			
		}


	}
}
