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

	private double getEnginePower() {	//h�mtar herspers fr�n de specifika bilarna
		return enginePower;
	}

	 public double getCurrentSpeed() {	//h�mtar den nuvarande hastigheten fr�n bilarna.
		return currentSpeed;
	}

	public Color getColor() {	//h�mtar bilarnas f�rg
		return color;
	}

	public void startEngine() {		//startar motorn
		currentSpeed = 0.1;		// ger bilen en fart
	}

	public void stopEngine() {		//st�nger av motorn
		currentSpeed = 0;		//	tar bort bilens fart
	}

	private void incrementSpeed(double amount) {	//best�mmer farten
		if(currentSpeed>enginePower){				//s� l�nge current speed ligger i intervallet 0-engingePower
			currentSpeed = getCurrentSpeed() + speedFactor() * amount;	//s�tter nuvarande farten till f�reg�ende + accelerationen.
		}
		else{								//s�tter max farten till enginepower
			currentSpeed = enginePower;
		}
	}

	private void decrementSpeed(double amount) {	//best�mmer hur fort du bromsar
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;		//s�tter den nuvarande farten efter att man bromsat
	}

	public enum gasOrNot {
		0,1
	}
	
	public gas(gasOrNot) { 	//s�ger att du skall accelerera	
		if(gasOrNot == 1) {
			if(amount <= 1) {
			incrementSpeed(amount);	//h�mtar accelerade farten
			}
		}
		if (gasOrNot == 0) {
			return;
		}
	}

	public void brake(double amount) {	//s�ger att du skall bromsa
		decrementSpeed(amount);			//h�mtar den de-accelererade farten.
	}
	
	private double speedFactor() {		//best�mmer accelerationen
		double turbo = 1;				//g�r att volvon som inte har turbo inte p�rverkas. 
		if (turboOn)					//n�r turbon s�tts p�..
			turbo = 1.3;				//�kas effekten.
		return enginePower * 0.01 * turbo * trimFactor; //den resulterade accelerationen.
	}

	@Override
	public void move() {
        double radians = Math.toRadians(this.getRotate() - 90); //h�mtar riktningen
        
        this.setTranslateX(this.getTranslateX() + Math.cos(radians) * getCurrentSpeed()); //s�ger hur mycket bilen skall f�rflyttas i x led
        this.setTranslateY(this.getTranslateY() + Math.sin(radians) * getCurrentSpeed()); //s�ger hur mycket bilen skall f�rflyttas i y led
        			
	}

	@Override
	public void turnLeft() {						//roterar bilen uppot.
		this.setRotate(this.getRotate() - 90);
		
	}

	@Override
	public void turnRight() {						//roterar bilen ner�t.
		this.setRotate(this.getRotate() + 90);
		
	}
}
