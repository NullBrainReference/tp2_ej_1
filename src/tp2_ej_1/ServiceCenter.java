package tp2_ej_1;

import java.util.ArrayList;
import java.util.List;

import tp2_ej_1.vehicle.Vehicle;

public class ServiceCenter {
	private List<Vehicle> vehicles;
	private List<Employee> workers;
	private List<ServiceTicket> tickets;
	
	public ServiceCenter() {
		vehicles = new ArrayList<Vehicle>();
		workers = new ArrayList<Employee>();
		tickets = new ArrayList<ServiceTicket>();
		
		workers.add(new Employee("Cotton Eye Joe"));
	}
	
	public void takeInService(Vehicle vehicle) {
		vehicles.add(vehicle);
		service(vehicle, workers.get(0));
	}
	
	public void service(Vehicle vehicle, Employee worker) {
		var ticket = vehicle.serviceAll();
		ticket.assignWorker(worker);
		System.out.println(ticket.toString());
		
	}
}
