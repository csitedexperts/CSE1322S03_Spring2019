package inheritanceExplained;

public class Vehicle ///extends Object // Inc C# object
{
	static int vehicleCount=0;
	private int doors;
	protected int speed;
	public String color;


	public void run() {
		System.out.println("The Vehicle::run() called..");
		
	}

	public Vehicle() {
	//	System.out.println("A Vehicle object is created...");
		vehicleCount++;
		System.out.println("Vehicle(s) created: " + vehicleCount);	
	}
	

	public int getDoors() { // Getter =>Get  ret
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
