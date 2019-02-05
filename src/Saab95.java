package cartaskpackage;
import javafx.scene.paint.Color;

public class Saab95 extends car {

	private Saab95() {

		color = Color.BLACK;
		enginePower = 125;

		color = Color.SILVER;
		enginePower = 68; // 1978 års modell enna
		turboOn = false;
		modelName = "Saab95";
		stopEngine();
	}


		public void setTurboOn() {
		turboOn = true;
	}

		public void setTurboOff() {
		turboOn = false;
	}

	

}
