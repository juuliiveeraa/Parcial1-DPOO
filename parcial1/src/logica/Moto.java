package logica;

public class Moto extends Vehiculo {

	public Moto(double cilindraje, double peso, double tanque) {
		super(cilindraje, peso, tanque);
	}

	@Override
	public double autonomia() {
		return (8* Math.pow(10, 4)) / (this.cilindraje + 2 * this.peso) * this.tanque;
	}

}
