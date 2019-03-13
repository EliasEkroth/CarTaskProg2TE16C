package cartaskpackage;
import javafx.scene.paint.Color;

public class Flatbed {
	
	private int carBed = 0;
	private boolean isOpen;
	
	public void open() {
		isOpen = true;
	}
	
	public void close() {
		isOpen = false;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
	private void raiseBed() {
		carBed++;
		if(carBed > 70) {
			carBed = 70;
		}
	}

	private void lowerBed() {
		carbed--;
		if(carBed < 0) {
			carBed = 0;
		}
	}
	
}