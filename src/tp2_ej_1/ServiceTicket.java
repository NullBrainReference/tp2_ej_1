package tp2_ej_1;

import java.time.LocalDate;
import java.util.List;

import tp2_ej_1.vehicle.parts.VehicleComponent;

public class ServiceTicket {
	private List<VehicleComponent> servedComponents;
	private LocalDate date;
	private Employee servedBy;
	
	public ServiceTicket(List<VehicleComponent> parts) {
		servedComponents = parts;
		date = LocalDate.now();
	}
	
	public void assignWorker(Employee worker) {
		servedBy = worker;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return servedComponents.size() + " components served on " + date.toString() + " by: " + servedBy.toString();
	}
}
