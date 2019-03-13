package cartaskpackage;
import javafx.scene.paint.Color;

public class carloader extends car {
	
	int capacity = cap;
	ArrayList<car> cars = new ArrayList<car>();
	private boolean isOpen;
	
	public carloader(int cap) {
		new cap = this.capacity;
	}

	public void updateAllPositions(vehicle v) {
		for (car car : cars) {
			car.setXPos(v.getXPos());
			car.setYPos(v.getYPos());
		}
	}
	
	public void loadCar(car c) {
		if(FlatBed.isOpen() && cars.size()<5) {
			cars.add(c);
		}
	}
	
	public void unloadLastCar(car c) {
		if(FlatBed.isOpen() && cars.size()>0 && capacity != this) {
			cars.remove(cars.size()-1);
		}
	}
	
	public void unloadFirstCar(car c) {
		if(FlatBed.isOpen() && cars.size()>0 && capacity != this) {
			cars.remove(cars.size(0));
		}
	}
	
	private void open() {
		isOpen = true;
	}
	
	private void close() {
		isOpen = false;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
}