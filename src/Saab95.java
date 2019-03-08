package cartaskpackage;
import javafx.scene.paint.Color;

public class Saab95 extends car {

	private Saab95() {				//sätter den specifika datan för saaben

		color = Color.SILVER;
		enginePower = 68; // 1978 års modell enna
		turboOn = false;
		modelName = "Saab95";
	}


		public void setTurboOn() {	//sätter på turbon
		turboOn = true;
	}

		public void setTurboOff() {	//stänger av turbon
		turboOn = false;
	}

	

}
