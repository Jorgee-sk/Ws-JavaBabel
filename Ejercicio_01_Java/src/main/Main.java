package main;

import entidad.Directivo;
import entidad.Empleado;
import entidad.Jefe;
import entidad.Trabajador;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		
		//Creamos directivo
		Empleado e1 = new Directivo();
		//Pasamos parametros 
		e1.setNombre("Pedro");
		e1.setSueldoBase(1200);
		//Casteamos a directivo para poder a?adir posteriormente los empleados que tiene a su cargo
		Directivo d = (Directivo) e1;
		//A?adimos a la lista
		listaEmpleados.add(e1);
		
			//Reutilizamos referencia para trabajador
		e1 = new Trabajador();
		e1.setNombre("Juan");
		e1.setSueldoBase(900);
		//Casteamos empleado a trabajador para acceder a atributos
		Trabajador t = (Trabajador) e1;
		t.setValoracion(7);
		d.setnEmpleados(e1);
		listaEmpleados.add(e1);
		
		e1 = new Trabajador();
		e1.setNombre("Pepe");
		e1.setSueldoBase(900);
		t = (Trabajador) e1;
		t.setValoracion(2);
		d.setnEmpleados(e1);
		listaEmpleados.add(e1);
		
		e1 = new Trabajador();
		e1.setNombre("Christian");
		e1.setSueldoBase(900);
		t = (Trabajador) e1;
		t.setValoracion(9);
		d.setnEmpleados(e1);
		listaEmpleados.add(e1);
		
		//Reutilizamos referencia para jefe
		e1 = new Jefe();
		e1.setNombre("Alvaro");
		e1.setSueldoBase(1050);
		//Casteamos empleado a jefe para acceder al atributo incentivos
		Jefe j = (Jefe) e1;
		j.setIncentivos(500);
		listaEmpleados.add(e1);
		
		for(int i=0; i<listaEmpleados.size(); i++) {
			//Accedemos a los elementos de la lista y a cada m?todo calcular sueldo propio
			listaEmpleados.get(i).calcularSueldo();
		}
		
			
		
		
	}

}
