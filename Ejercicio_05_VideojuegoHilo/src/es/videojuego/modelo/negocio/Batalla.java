package es.videojuego.modelo.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.videojuego.modelo.entidad.Arma;
import es.videojuego.modelo.entidad.Personaje;
import es.videojuego.util.NumeroAleatorio;

public class Batalla {
	private List<Personaje> p1 = new ArrayList<Personaje>();
	private Personaje jefe;
	private Personaje ganador = null;
	/**
	 * Empieza una lucha entre dos personajes y devuelve el personaje
	 * vencedor
	 * @return
	 */
	public synchronized void combatir(Personaje p) {
		
		Personaje jefe = this.jefe;
		Personaje jugador = p;
		
		if(ganador==null || ganador==jefe) { //Solo se hace cuando el ganador ha sido el jefe o no hay ganador
			int aux = p1.indexOf(p);
			
			
			System.out.println("Hola soy "+p1.get(aux).getNombre()+" y voy a entrar a la mazmorra");
			System.out.println("LA BATALLA CONTRA EL JEFE "+jefe.getNombre().toUpperCase()+ " VA A COMENZAR");
			boolean combateAcabado = false;
			
			do {
				int danio = jugador.atacar(jefe);
				logBatalla(jugador, jefe, danio);
				if(jefe.estaMuerto()) {
					ganador = jugador;
					System.out.println(jugador.getNombre().toUpperCase()+" HA DERROTADO AL JEFE FINAL!!!");
					combateAcabado = true;
				}else {
					danio = jefe.atacar(jugador);
					logBatalla(jefe, jugador, danio);
					if(jugador.estaMuerto()) {
						ganador = jefe;
						combateAcabado = true;
					}
				}
				
			}while(!combateAcabado);
		}
		
	
		
	}
	
	
	
	public void logBatalla(Personaje p1, Personaje p2, int danio) {
		System.out.println(" El personaje " 
				+ p1.getNombre() + " ha hecho " 
				+ danio + " al personaje " + p2.getNombre());
		
		System.out.println("Vida de "+p1.getNombre()+" :"+p1.getVida());
		System.out.println("Vida de "+p2.getNombre()+" :"+p2.getVida());
	}

	public List<Personaje> getP1() {
		return p1;
	}

	public void setP1(List<Personaje> p1) {
		this.p1 = p1;
	}

	public void setPersonaje(Personaje p1) {
		this.p1.add(p1);
	}

	public Personaje getJefe() {
		return jefe;
	}

	public void setJefe(Personaje jefe) {
		this.jefe = jefe;
	}
	
	
}
