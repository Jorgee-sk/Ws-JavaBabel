package entidad;

import java.util.*;

public class Directivo extends Empleado{
	
	private List<Empleado> a = new ArrayList<>();;
	
	public int getnEmpleados() {
		return this.a.size();
	}


	public void setnEmpleados(Empleado nEmpleados) {
		this.a.add(nEmpleados);
	}
	
	@Override
	public void calcularSueldo() {
		
		int sueldoTotal = this.getSueldoBase()+(this.a.size()*100);
		System.out.println("El sueldo del directivo es: "+sueldoTotal);
	}


	
}
