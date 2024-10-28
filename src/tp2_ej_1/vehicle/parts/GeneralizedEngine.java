package tp2_ej_1.vehicle.parts;

public class GeneralizedEngine extends Engine{
	public GeneralizedEngine(float power, float kmLimit) {
		this.horsepower = power;
		this.kmLimit = kmLimit;
		this.kmRan = 0;
	}
	public GeneralizedEngine(float power, float kmLimit, float kmRan) {
		this.horsepower = power;
		this.kmLimit = kmLimit;
		this.kmRan = kmRan;
	}
}
