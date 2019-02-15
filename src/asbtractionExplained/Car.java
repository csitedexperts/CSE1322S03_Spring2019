package asbtractionExplained;

public class Car extends Vehicle implements IVehicle,JVehicle  
// C# :
{

	//@Override
	public void run() {
		System.out.println("The Car::run() called");
			
	}

	//@Override
	public  void hasEngine() {
		System.out.println("The Car::hasEngine() called");
			
	}
	
	// Optional
	@Override
	 public  void test() {
     	System.out.println("The Car::test() called");
		}

	@Override
	public void IVehicle(int doors, int speed, String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void JVehicle(int doors, int speed, String color) {
		// TODO Auto-generated method stub
		
	}

}
