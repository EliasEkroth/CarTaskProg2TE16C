import javafx.scene.paint.Color;

public class Saab95 extends car {

	private Saab95() {
		color = Color.BLACK;
		enginePower = 125;
		turboOn = false;
		modelName = "Saab95";
		stopEngine();
	}


		public void setTurboOn() {			//man sätter ju inte på en turbå, du menar nitrus?!
		turboOn = true;
	}

		public void setTurboOff() {
		turboOn = false;
	}

	

}