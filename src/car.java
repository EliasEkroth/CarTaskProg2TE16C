package cartaskpackage;

import javafx.scene.paint.Color;
import javafx.scene.Group;

public class car extends Group implements Movable {
	
	public static double trimFactor;      //JOEL SUGER
	public boolean turboOn;

	public double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	private double getEnginePower() {	//hämtar herspers från de specifika bilarna
		return enginePower;
	}

	 public double getCurrentSpeed() {	//hämtar den nuvarande hastigheten från bilarna.
		return currentSpeed;
	}

	public Color getColor() {	//hämtar bilarnas färg
		return color;
	}

	public void startEngine() {		//startar motorn
		currentSpeed = 0.1;		// ger bilen en fart
	}

	public void stopEngine() {		//stänger av motorn
		currentSpeed = 0;		//	tar bort bilens fart
	}

	private void incrementSpeed(double amount) {	//bestämmer farten
		if(currentSpeed>enginePower){				//så länge current speed ligger i intervallet 0-engingePower
			currentSpeed = getCurrentSpeed() + speedFactor() * amount;	//sätter nuvarande farten till föregående + accelerationen.
		}
		else{								//sätter max farten till enginepower
			currentSpeed = enginePower;
		}
	}

	private void decrementSpeed(double amount) {	//bestämmer hur fort du bromsar
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;		//sätter den nuvarande farten efter att man bromsat
	}

	public enum gasOrNot {
		0,1
	}
	
	public gas(gasOrNot) { 	//säger att du skall accelerera	
		if(gasOrNot == 1) {
			if(amount <= 1) {
			incrementSpeed(amount);	//hämtar accelerade farten
			}
		}
		if (gasOrNot == 0) {
			return;
		}
	}

	public void brake(double amount) {	//säger att du skall bromsa
		decrementSpeed(amount);			//hämtar den de-accelererade farten.
	}
	
	private double speedFactor() {		//bestämmer accelerationen
		double turbo = 1;				//gör att volvon som inte har turbo inte pårverkas. 
		if (turboOn)					//när turbon sätts på..
			turbo = 1.3;				//ökas effekten.
		return enginePower * 0.01 * turbo * trimFactor; //den resulterade accelerationen.
	}

	@Override
	public void move() {
        double radians = Math.toRadians(this.getRotate() - 90); //hämtar riktningen
        
        this.setTranslateX(this.getTranslateX() + Math.cos(radians) * getCurrentSpeed()); //säger hur mycket bilen skall förflyttas i x led
        this.setTranslateY(this.getTranslateY() + Math.sin(radians) * getCurrentSpeed()); //säger hur mycket bilen skall förflyttas i y led
        			
	}

	@Override
	public void turnLeft() {						//roterar bilen uppot.
		this.setRotate(this.getRotate() - 90);
		
	}

	@Override
	public void turnRight() {						//roterar bilen neråt.
		this.setRotate(this.getRotate() + 90);
		
	}
}
