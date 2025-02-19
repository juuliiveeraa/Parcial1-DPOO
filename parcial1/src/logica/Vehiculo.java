package logica;

public abstract class Vehiculo {
	protected double cilindraje;
	protected double peso;
	protected double tanque;
	
	public double getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTanque() {
		return tanque;
	}
	public void setTanque(double tanque) {
		this.tanque = tanque;
	}
	
	public Vehiculo(double cilindraje, double peso, double tanque) {
		this.cilindraje = cilindraje;
		this.peso = peso;
		this.tanque = tanque;
	}
	
	public abstract double autonomia();
	
}
