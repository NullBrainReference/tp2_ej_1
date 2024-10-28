package tp2_ej_1;

import java.util.ArrayList;

import tp2_ej_1.vehicle.GeneralizedMotocicle;
import tp2_ej_1.vehicle.HyundaiSolaris;
import tp2_ej_1.vehicle.parts.Brakes;
import tp2_ej_1.vehicle.parts.GeneralizedEngine;
import tp2_ej_1.vehicle.parts.Weel;

public class Program {
	
	public static ServiceCenter center = new ServiceCenter();
	
	public static void main(String[] args) {
		var myBike = new GeneralizedMotocicle(
				new Weel(true), new Weel(false),
				new GeneralizedEngine(45, 25_000, 10_000),
				new Brakes(true));
		
		center.takeInService(myBike);
		
		var myCar = new HyundaiSolaris();
		
		center.takeInService(myCar);

	}

}
