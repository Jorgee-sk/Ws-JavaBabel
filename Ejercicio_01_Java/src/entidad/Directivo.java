package entidad;

public class Directivo extends Empleado{
	
	private int nEmpleados;
	
	public int getnEmpleados() {
		return nEmpleados;
	}


	public void setnEmpleados(int nEmpleados) {
		this.nEmpleados = nEmpleados;
	}
	
	@Override
	public void calcularSueldo() {
		
		int sueldoTotal = this.getSueldoBase()+(this.nEmpleados*100);
		System.out.println("El sueldo del directivo es: "+sueldoTotal);
	}


	
}
