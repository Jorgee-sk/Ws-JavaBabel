package main;
import entidad.Prueba;

public class MainJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba prueba = new Prueba();
		prueba.pruebaEntidad = 34;
		
		otroPaquete.Prueba p2 = new otroPaquete.Prueba();
		p2.pruebaEntidad = 34;
		
		Videojuego v = new Videojuego();
		v.setNota(-5);
		System.out.println(v.getNota());
		
		Videojuego v2 = v;
	}

}
