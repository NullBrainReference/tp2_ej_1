package tp2_ej_1.vehicle;

import java.util.ArrayList;
import java.util.List;

import tp2_ej_1.vehicle.parts.Brakes;
import tp2_ej_1.vehicle.parts.GeneralizedEngine;
import tp2_ej_1.vehicle.parts.VehicleComponent;
import tp2_ej_1.vehicle.parts.Weel;

public class GeneralizedMotocicle extends Vehicle {
	public GeneralizedMotocicle(Weel weel1, Weel weel2, GeneralizedEngine engine, Brakes brakes) {
		this.components = new ArrayList<VehicleComponent>();
		this.components.add(brakes);
		this.components.add(engine);
		this.components.add(weel1);
		this.components.add(weel2);
	}
}
