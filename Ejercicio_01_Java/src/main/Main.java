package main;

import entidad.Directivo;
import entidad.Empleado;
import entidad.Jefe;
import entidad.Trabajador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado arrayE[];
		Empleado e1 = new Trabajador();
		Empleado e2 = new Directivo();
		Empleado e3 = new Jefe();
		
		e1.setNombre("Juan");
		e1.setSueldoBase(900);
		
		e2.setNombre("Pedro");
		e2.setSueldoBase(1200);
		
		e3.setNombre("Alvaro");
		e3.setSueldoBase(1050);
		
		
		
	}

}