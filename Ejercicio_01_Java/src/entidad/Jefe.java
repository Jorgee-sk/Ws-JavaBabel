package entidad;

public class Jefe extends Empleado{

	private int incentivos;

	public int getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(int incentivos) {
		this.incentivos = incentivos;
	}
	
	@Override
	public void calcularSueldo() {
		int sueldoTotal = this.getSueldoBase()+this.incentivos;
		System.out.println("El sueldo del Jefe es: "+sueldoTotal);
	}
	
}
