
import javafx.scene.paint.Color;

public class car implements Movable{
	
	public static double trimFactor;      //JOEL SUGER
	public boolean turboOn;

	public double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	private double getEnginePower() {
		return enginePower;
	}

	 public double getCurrentSpeed() {
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
        double radians = Math.toRadians(this.getRotate() - 90);
        
        this.setTranslateX(this.getTranslateX() + Math.cos(radians) * getCurrentSpeed());
        this.setTranslateY(this.getTranslateY() + Math.sin(radians) * getCurrentSpeed());
        			
        if(this.getTranslateY() <= -100){
            this.setTranslateY(1000);
        }

        else if(this.getTranslateY() >= 1000){
            this.setTranslateY(-100);
        }

        else if(this.getTranslateX() <= -100){
            this.setTranslateX(1920);
        }

        else if(this.getTranslateX() >= 1920){
            this.setTranslateX(-100);
        }


		
	}

	@Override
	public void turnLeft() {
		this.setRotate(this.getRotate() - 20);
		
	}

	@Override
	public void turnRight() {
		this.setRotate(this.getRotate() + 20);
		
	}
}
