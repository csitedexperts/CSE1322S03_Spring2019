package democlasses;

public class VehicleMain {

	public  void  Test() {
		System.out.println("Test()  called");
	
		 Vehicle.run();
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vehicle v1 = new Vehicle();
		 Vehicle v2 = new Vehicle();
//		 Vehicle v3 = new Vehicle();
//		 Vehicle v4 = new Vehicle();
		 v1.setDoors(4);
		 v2.setDoors(2);
		 v1.setColor("Red");
		 v2.setColor("White");
		 
		 System.out.println("v1 = " + v1);
		 System.out.println("v2 = " + v2);
		 
//		 
		 System.out.println("V1.doors = " + v1.getDoors());
		 System.out.println("V1.color = " + v1.getColor());

		 System.out.println("V2.doors = " + v2.getDoors());
		 System.out.println("V2.color = " + v2.getColor());

//		 Vehicle.run();
//		 
//		 VehicleMain.Test();
	
	}

	// Why and how to override the toString() method?
	
}
