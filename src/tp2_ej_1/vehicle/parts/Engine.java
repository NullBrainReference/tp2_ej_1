package tp2_ej_1.vehicle.parts;

public abstract class Engine extends VehicleComponent {
	protected float horsepower;
	protected float kmRan;
	protected float kmLimit;
	
	@Override
	public void service() {
		super.service();
		
		serviceEngine();
	}
	
	@Override
	public boolean isFuctional() {
		// TODO Auto-generated method stub
		return kmLimit > kmRan;
	}

	private void serviceEngine() {
		//"here goes engine service, just in case of an example lets drop kmRan value"
		kmRan = 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Engine hp: " + horsepower + "; " + super.toString();
	}
}
