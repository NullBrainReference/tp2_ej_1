package tp2_ej_1.vehicle;

import java.util.ArrayList;

import tp2_ej_1.vehicle.parts.Brakes;
import tp2_ej_1.vehicle.parts.G4FAEngine;
import tp2_ej_1.vehicle.parts.VehicleComponent;
import tp2_ej_1.vehicle.parts.Weel;

public class HyundaiSolaris extends Vehicle {
	public HyundaiSolaris() {
		components = new ArrayList<VehicleComponent>();
		
		components.add(new G4FAEngine());
		components.add(new Weel(true));
		components.add(new Weel(true));
		components.add(new Weel(true));
		components.add(new Weel(true));
		components.add(new Brakes(true));
	}
}
