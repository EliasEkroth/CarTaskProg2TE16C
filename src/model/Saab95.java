package model;
import javafx.scene.paint.Color;

public class Saab95 extends car {

	private Saab95() {				//s�tter den specifika datan f�r saaben

		color = Color.SILVER;
		enginePower = 68; // 1978 �rs modell enna
		turboOn = false;
		modelName = "Saab95";
	}


		public void setTurboOn() {	//s�tter p� turbon
		turboOn = true;
	}

		public void setTurboOff() {	//st�nger av turbon
		turboOn = false;
	}

	

}
