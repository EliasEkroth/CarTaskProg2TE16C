package cartaskpackage;
import javafx.scene.paint.Color;

public class Ferrari458 extends car{


	private Ferrari458() {		//sätter den specifika datan för ferrari
		color = Color.RED;
		enginePower = 1340 /*herspers*/;
		modelName = "Ferrari458";
		stopEngine();
	}

}
