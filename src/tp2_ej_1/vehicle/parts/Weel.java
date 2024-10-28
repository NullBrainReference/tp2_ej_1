package tp2_ej_1.vehicle.parts;

public class Weel extends VehicleComponent {
	
	private boolean isFuctional;
	
	public Weel(boolean isFuctional) {
		this.isFuctional = isFuctional;
	}
	
	@Override
	public void service() {
		super.service();
		
		serviceWeel();
	}
	
	private void serviceWeel() {
		isFuctional = true;
	}
	
	@Override
	public boolean isFuctional() {
		
		return isFuctional;
	}

}
