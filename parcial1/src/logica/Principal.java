package logica;
//Sé que debía ser en una carpeta/paquete distinto llamado package, pero al hacer eso me pedía importar logic.//

public class Principal {

	public Principal() {
		Vehiculo v;
		
		v = new Auto(500, 200, 70);
		
		System.out.println(v.autonomia());
		
		v = new Moto(250, 100, 35);
		
		System.out.println(v.autonomia());
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
}
