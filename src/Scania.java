package cartaskpackage;
import javafx.scene.paint.Color;

public class Scania extends car{

	private Scania() {
		color = Color.BLUE;
		enginePower = 730/*hp*/;
		modelName = "Scania R 730";
	}

	private getBedAngle() {
		return FlatBed.carBed;
	}
	
	public void gas(double amount) {
		if(FlatBed.getBedAngle == 0) {
		super.gas(amount);
		}
	}
	
}
