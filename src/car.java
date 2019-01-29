
import javafx.scene.paint.Color;

public class car implements Movable{
	
	public static double trimFactor;
	public boolean turboOn;

	public double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	private double getEnginePower() {
		return enginePower;
	}

	 private double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}
	
	private double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo * trimFactor;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}
}

=======
import javafx.scene.paint.Color;

public class car implements Movable{
	
	public static double trimFactor;      //joel suger
	public boolean turboOn;

	public double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	private double getEnginePower() {
		return enginePower;
	}

	 private double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}
	
	private double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo * trimFactor;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}
}
