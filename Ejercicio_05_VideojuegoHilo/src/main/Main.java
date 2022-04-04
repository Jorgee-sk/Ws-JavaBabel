package main;

import es.videojuego.modelo.entidad.Curandero;
import es.videojuego.modelo.entidad.Espada;
import es.videojuego.modelo.entidad.Hechizo;
import es.videojuego.modelo.entidad.Jefe;
import es.videojuego.modelo.entidad.Mago;
import es.videojuego.modelo.entidad.Rezo;
import es.videojuego.modelo.negocio.Batalla;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batalla batalla = new Batalla();
		
		Jefe jefe = new Jefe();
		jefe.setGolpeJefe(40);
		jefe.setNombre("Boss 1");
		jefe.setVida(800);
		jefe.setBatalla(batalla);
		
		Espada espadaJefe = new Espada();
		espadaJefe.setDanioMinimo(10);
		espadaJefe.setDanioMaximo(40);
		espadaJefe.setPorcentajeCritico(20);
		
		jefe.setArma(espadaJefe);
		espadaJefe.setPersonaje(jefe);
		
		
		
		Mago mago = new Mago();
		mago.setInteligencia(10);
		mago.setNombre("Gandalf");
		mago.setVida(400);
		mago.setBatalla(batalla); //Asociamos el personaje a una batalla
		
		Hechizo bolaDeFuego = new Hechizo();
		bolaDeFuego.setDanioMinimo(10);
		bolaDeFuego.setDanioMaximo(100);
		bolaDeFuego.setPorcentajeCritico(20);
		bolaDeFuego.setPoderHechizo(10);
		
		//ahora viene la bidercionalidad
		mago.setArma(bolaDeFuego);
		bolaDeFuego.setPersonaje(mago);
		
		Curandero cu = new Curandero();
		cu.setNombre("Saruman");
		cu.setSabiduria(10);
		cu.setVida(400);
		cu.setBatalla(batalla);
		
		
		Rezo rezo = new Rezo();
		rezo.setDanioMaximo(100);
		rezo.setDanioMinimo(10);
		rezo.setPorcentajeCritico(20);
		rezo.setPoderCuracion(10);
		
		//ahora viene la bidercionalidad
		cu.setArma(rezo);
		rezo.setPersonaje(cu);
		
		//Añadimos los personajes a la lista de la batalla
		batalla.setPersonaje(mago);
		batalla.setPersonaje(cu);
		batalla.setJefe(jefe);
		
		
		Thread t1 = new Thread(mago);
		Thread t2 = new Thread(cu);
		
		t1.start();
		t2.start();
	}

}
