package model;

import javafx.scene.paint.Color;
import javafx.scene.Group;

public class vehicle extends Group implements Movable {
	
	public static double trimFactor;      //JOEL SUGER
	public boolean turboOn;

	public double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	private enum gasOrNot { // Decides if the car will accelerate
		0,1;
	}
	private enum brakeOrNot { // Decides if the car will brake
		0,1;
	}

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
		if(amount < 0) {
			amount = amount*-1;
		}
		if(amount > 1) {
			if(currentSpeed < enginePower){				//s� l�nge current speed ligger i intervallet 0-engingePower
				currentSpeed = getCurrentSpeed() + speedFactor() * amount;	//s�tter nuvarande farten till f�reg�ende + accelerationen.
			}
		}
		else{								//s�tter max farten till enginepower
			currentSpeed = enginePower;
		}
	}

	private void decrementSpeed(double amount) {	//best�mmer hur fort du bromsar
		if(amount < 0) {
			amount = amount*-1;
		}
		if(amount > 1) {
			currentSpeed = getCurrentSpeed() - speedFactor() * amount;		//s�tter den nuvarande farten efter att man bromsat
				if(currentSpeed < 0) {
					currentSpeed = 0;
				}
		}
	}
	
	public gas(gasOrNot) { 	//s�ger att du skall accelerera	
		if(brakeOrNot == 1) {
			brakeOrNot = 0;
		}
		if(gasOrNot == 1) {
			incrementSpeed(amount);	//h�mtar accelerade farten
		}
		else if (gasOrNot == 0) {
			return;
		}
	}
	
	public brake(brakeOrNot) { 	//s�ger att du skall decelerera	
		if(gasOrNot == 1) {
			gasOrNot = 0;
		}
		if(brakeOrNot == 1) {
			decrementSpeed(amount);	//h�mtar decelerade farten
		}
		else if (brakeOrNot == 0) {
			return;
		}
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
