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
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;	//sätter nuvarande farten till föregående + accelerationen.
	}

	private void decrementSpeed(double amount) {	//bestämmer hur fort du bromsar
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;		//sätter den nuvarande farten efter att man bromsat
	}

	public void gas(double amount) {	//säger att du skall accelerera	
		incrementSpeed(amount);			//hämtar accelerade farten
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
        			
        if(this.getTranslateY() <= -100){	//om bilen försvinner utanför skärmen kommer den upp på andra sidan.
            this.setTranslateY(1000);
        }

        else if(this.getTranslateY() >= 1000){	//	-||-
            this.setTranslateY(-100);
        }

        else if(this.getTranslateX() <= -100){	//	-||-
            this.setTranslateX(1920);
        }

        else if(this.getTranslateX() >= 1920){	//	-||-
            this.setTranslateX(-100);
        }


		
	}

	@Override
	public void turnLeft() {						//roterar bilen uppot.
		this.setRotate(this.getRotate() - 20);
		
	}

	@Override
	public void turnRight() {						//roterar bilen neråt.
		this.setRotate(this.getRotate() + 20);
		
	}
}
