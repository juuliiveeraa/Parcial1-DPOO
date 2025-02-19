package logica;

public class Auto extends Vehiculo{

	public Auto(double cilindraje, double peso, double tanque) {
		super(cilindraje, peso, tanque);
	}

	@Override
	public double autonomia() {
		return ((15* Math.pow(10, 4)) / (this.cilindraje + this.peso)) * this.tanque;
	}

}
