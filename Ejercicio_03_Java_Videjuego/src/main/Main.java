package main;

import java.util.List;
import java.util.Scanner;

import entidad.Arcos;
import entidad.Arma;
import entidad.Curanderos;
import entidad.Espada;
import entidad.Guerrero;
import entidad.Hechizos;
import entidad.Mago;
import entidad.Personaje;
import entidad.Rezos;

public class Main {

	private static Scanner teclado = new Scanner(System.in);
	private static Arma a;
	
	public static void main(String[] args) {
		Personaje jugador = null;
		Personaje jugador2 = null;
		
		jugador = crearPersonaje(jugador);
		jugador2 = crearPersonaje(jugador2);
		
		combatir(jugador,jugador2);
		//TODO Combatir...
	}

	private static void combatir(Personaje jugador1 , Personaje jugador2) {
		boolean terminado = false;
		
		do {
			if(jugador1.getVida() <= 0 || jugador2.getVida() <= 0) {
				System.out.println("EL JUEGO HA TERMINADO");
				if(jugador1.getVida()>0)
					System.out.println("==== EL JUGADOR 1 ES EL GANADOR ====");
				else
					System.out.println("==== EL JUGADOR 2 ES EL GANADOR ====");
				terminado = true;
			}
			System.out.println("====== TURNOS JUGADOR ======");
			System.out.println("[1] "+jugador1.getNombre());
			System.out.println("[2] "+jugador2.getNombre());
			System.out.println("[3] SALIR");
			int opcion = teclado.nextInt();
			switch (opcion) {				
			case 1:
				System.out.println("==== TURNO JUGADOR 1 ====");
				
				System.out.println("==== VIDA DEL JUGADOR 1 ====");
				System.out.println("==== "+jugador1.getVida()+" ====");
				System.out.println("==== VIDA DEL JUGADOR 2 ====");
				System.out.println("==== "+jugador2.getVida()+" ====");
				
				int aux = jugador1.atacar();
				
				
				if(jugador1.isBoostArma())
					System.out.println(jugador1.getNombre()+" va a usar toda su potencia para atacar");
				else
					System.out.println(jugador1.getNombre()+" va a atacar");
			
				jugador2.setVida(jugador2.getVida()-aux);
				System.out.println("==== VIDA DEL JUGADOR 2 ====");
				System.out.println("==== "+jugador2.getVida()+" ====");
				
				break;
				
			case 2:
				System.out.println("==== TURNO JUGADOR 2 ====");
				
				System.out.println("==== VIDA DEL JUGADOR 1 ====");
				System.out.println("==== "+jugador1.getVida()+" ====");
				System.out.println("==== VIDA DEL JUGADOR 2 ====");
				System.out.println("==== "+jugador2.getVida()+" ====");
				
				aux = jugador2.atacar();
				
				if(jugador2.isBoostArma())
					System.out.println(jugador2.getNombre()+" va a usar toda su potencia para atacar");
				else
					System.out.println(jugador2.getNombre()+" va a atacar");
				
				jugador2.setVida(jugador1.getVida()-aux);
				
				System.out.println("==== VIDA DEL JUGADOR 1 ====");
				System.out.println("==== "+jugador1.getVida()+" ====");
					
				break;
			
			case 3:
				terminado = true;
				break;
			}
		}while(!terminado);
	}
	
	
	private static Personaje crearPersonaje(Personaje jugador) {
		
		
		System.out.println("====== CREAR JUGADOR ======");
		System.out.println("Clases disponibles:");
		System.out.println("[1] -> Mago");
		System.out.println("[2] -> Guerrero");
		System.out.println("[3] -> Curandero");
		
		System.out.print("Elige clase: ");
		int clase = Integer.parseInt(teclado.nextLine());
		if(clase < 1 || clase > 3) {
			System.out.println("Numero no valido");
		}
		
		System.out.print("Elige el nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Armas disponibles:");
		System.out.println("[1] -> Espada");
		System.out.println("[2] -> Arco");
		System.out.println("[3] -> Hechizo");
		System.out.println("[4] -> Rezo");
		int arma = Integer.parseInt(teclado.nextLine());
		if(arma==1) {
			a = new Espada();
			a.setDañoArma(220);
			a.setnArma("Espada");
			
		}
		else if(arma==2) {
			a = new Arcos();
			a.setDañoArma(115);
			a.setnArma("Arco");
		}else if(arma==3) {
			a = new Hechizos();
			a.setDañoArma(172);
			a.setnArma("Hechizo");
		}else if(arma==4) {
			a = new Rezos();
			a.setDañoArma(100);
			a.setnArma("Rezo");
		}
	
		if(arma < 1 || arma > 4) {
			System.out.println("Numero no valido");
		}	
		
		
		//Tenemos todos los atributos necesarios, creamos Personaje
		if (clase == 1) {
			jugador = new Mago(); //Solo hacemos set de nombre y arma ya que se crean con vida e inteligencia
			jugador.setNombre(nombre);
			jugador.setArma(a);
			
		}
		else if(clase == 2) {
			jugador = new Guerrero();
			jugador.setNombre(nombre);
			jugador.setArma(a);
		}	
		else if(clase == 3) {
			jugador = new Curanderos();
			jugador.setNombre(nombre);
			jugador.setArma(a);
		}
			
		
		System.out.println("===== JUGADOR =====");
		System.out.println("Nombre: "+jugador.getNombre());
		System.out.println("Vida: "+jugador.getVida());
		System.out.println("Arma: "+jugador.getArma().getnArma());
		System.out.println("Daño base: "+jugador.getArma().getDañoArma());
		System.out.println();
		
		return jugador;
	}

}
