package entidad;

public class Persona {
	
	/*
	 * La encapsulacion en java se define en 4 niveles 
	 * de visibilidad:
	 * 
	 * 1- private, solo podemos acceder desde la propia clase.
	 * 
	 * 2- default, acceso a metodos y atributos de la clase desde la propia clase
	 * y desde otros ficheros del mismo paquete.
	 * 
	 * 3- protected, acceso a metodos y atributos de la clase desde la propia clase,
	 * desde otros ficheros del mismo paquete y desde las clases que hereden de esta.
	 * 
	 * 4- public, sin restricciones de acceso
	 * 
	 * */
	String nombre;
	private int edad;
	protected double peso;
	public String dni;
	
	public void presentarse() {
		System.out.println("Hola soy "+ this.nombre);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
