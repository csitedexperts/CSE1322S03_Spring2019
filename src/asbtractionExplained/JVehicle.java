package asbtractionExplained;

public interface JVehicle {

	static int vehicleCount = 0;

	public  void run();

	public abstract void hasEngine();

	public  void test() ;
	public void JVehicle(int doors, int speed, String color);
	
}
