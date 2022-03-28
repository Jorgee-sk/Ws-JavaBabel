package entidad;

public class Trabajador extends Empleado{
	
	private int valoracion;

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	@Override
	public void calcularSueldo() {
		
		int aux = this.getSueldoBase();
			
		if(valoracion<=4 && valoracion >=0) {
			System.out.println("El sueldo del trabajador es: " +aux);
		}else if(valoracion ==5 || valoracion == 6) {
			aux+=50;
			System.out.println("El sueldo del trabajador es: " +aux);
		}else if(valoracion ==7 || valoracion == 8) {
			aux+=100;
			System.out.println("El sueldo del trabajador es: " +aux);
		}else if(valoracion ==9 || valoracion == 10) {
			aux+=200;
			System.out.println("El sueldo del trabajador es: " +aux);
		}
		
		
	}
}
