package model;

import javafx.scene.paint.Color;
import javafx.scene.Group;

public class Ferry extends vehicle {
	
	carloader loader;
	
	public void loadCar(car c) {
		if(FlatBed.isOpen()) {
			cars.add(c);
		}
	}
	
	public void unloadCar(car c) {
		if(FlatBed.isOpen() != this) {
			cars.remove(cars.size()-1);
		}
	}
	
}