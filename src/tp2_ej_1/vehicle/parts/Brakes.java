package tp2_ej_1.vehicle.parts;

public class Brakes extends VehicleComponent {

	private boolean isFunctional;
	
	public Brakes(boolean isFunctional) {
		this.isFunctional = isFunctional;
	}
	
	@Override
	public void service() {
		super.service();
		
		serviceBrakes();
	}
	
	private void serviceBrakes() {
		isFunctional = true;
	}
	
	@Override
	public boolean isFuctional() {
		// TODO Auto-generated method stub
		return isFunctional;
	}
	
}
