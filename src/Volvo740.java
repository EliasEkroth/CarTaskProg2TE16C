package cartaskpackage;
import javafx.scene.paint.Color;

public class Volvo740 extends car{


	private Volvo740() {		//s�tter den specifika datan f�r volvo740
		color = Color.RED;
		enginePower = 100/*hp*/;
		modelName = "Volvo740";
		stopEngine();
		trimFactor = 1.25;
	}

}
