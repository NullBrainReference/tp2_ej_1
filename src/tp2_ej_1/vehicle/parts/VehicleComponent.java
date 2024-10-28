package tp2_ej_1.vehicle.parts;

import java.time.LocalDate;

public abstract class VehicleComponent {
	private LocalDate servicedDate;
	
	public void service() {
		setServicedDate(LocalDate.now());
	}
	
	private void setServicedDate(LocalDate date) {
		servicedDate = date;
	}
	public LocalDate getLastServiced() {
		return servicedDate;
	}
	
	public abstract boolean isFuctional();
	
	@Override
	public String toString() {
		return "last serviced: " + servicedDate.toString();
	}
}
