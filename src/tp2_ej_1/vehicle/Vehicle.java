package tp2_ej_1.vehicle;

import java.util.ArrayList;
import java.util.List;

import tp2_ej_1.ServiceTicket;
import tp2_ej_1.vehicle.parts.VehicleComponent;

public abstract class Vehicle {
	protected List<VehicleComponent> components;
	
	public ServiceTicket serviceAll() {
		List<VehicleComponent> servicedParts = new ArrayList<VehicleComponent>();
		
		for (VehicleComponent vehicleComponent : components) {
			if (vehicleComponent.isFuctional())
				continue;
			
			servicedParts.add(vehicleComponent);
		}
		
		return new ServiceTicket(servicedParts);
	}
	
	public boolean isOk() {
		for (VehicleComponent vehicleComponent : components) {
			if (vehicleComponent.isFuctional() == false)
				return false;
		}
		
		return true;
	}
}
