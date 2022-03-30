package main;

import java.util.List;
import java.util.Scanner;

import entidad.Coche;
import negocio.GestorCoche;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GestorCoche gestor = new GestorCoche();
		boolean terminado = false;
		
		
		do {
			menu();
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca los datos del coche:  Matricula | Marca | Modelo | Kilometros");
				String matricula = sc.next();
				String marca = sc.next();
				String modelo = sc.next();
				int km = sc.nextInt();
				Coche c = new Coche();
				
				c.setId(0);
				c.setMatricula(matricula);
				c.setMarca(marca);
				c.setModelo(modelo);
				c.setKilometros(km);
				
				
				int añadir  = gestor.alta(c);
				
				if(añadir == 0) {
					System.out.println("Coche añadido");
				}else if(añadir == 1) {
					System.out.println("Error de conexión con la BBDD");
				}else if(añadir == 2){
					System.out.println("La matricula es invalida");
				}else if(añadir == 3) {
					System.out.println("Los kilometros son invalidos");
				}else if(añadir == 4) {
					System.out.println("La matricula ya existe");
				}
				break;
			case 2:
				System.out.println("Introduzca la ID del coche que quiere eliminar");
				int id = sc.nextInt();
				
				Boolean eliminado = gestor.eliminar(id);
				if(eliminado == true) {
					System.out.println("Coche eliminado");
				}else {
					System.out.println("El coche no se pudo eliminar");
				}
				
				break;
			case 3:
				System.out.println("Introduzca los datos del coche a modificar: | Matricula | Marca | Modelo | Kilometros");
				id = sc.nextInt();
				matricula = sc.next();
				marca = sc.next();
				modelo = sc.next();
				km = sc.nextInt();
				c = new Coche();
				
				c.setId(id);
				c.setMatricula(matricula);
				c.setMarca(marca);
				c.setModelo(modelo);
				c.setKilometros(km);
				
				int mod = gestor.modificar(c);
				if(mod == 0) {
					System.out.println("Coche modificado");
				}else if(mod == 1) {
					System.out.println("Error de conexión con la BBDD");
				}else if(mod == 2){
					System.out.println("La matricula es invalida");
				}else if(mod == 3) {
					System.out.println("Los kilometros son invalidos");
				}
				break;
			case 4:
				System.out.println("Introduzca la ID del coche a buscar: ");
				id = sc.nextInt();
				
				c = gestor.obtener(id);
				System.out.println("Coche [ID: " + c.getId() + ", MATRICULA: " + c.getMatricula() + ", MARCA: " + c.getMarca() + ", MODELO: " + c.getModelo() + ", KILOMETROS: "+c.getKilometros()+"]");
				
				break;
			case 5:
				System.out.println("Introduzca la matricula del coche a buscar: ");
				matricula = sc.next();
				
				c = gestor.obtener(matricula);
				System.out.println("Coche [ID: " + c.getId() + ", MATRICULA: " + c.getMatricula() + ", MARCA: " + c.getMarca() + ", MODELO: " + c.getModelo() + ", KILOMETROS: "+c.getKilometros()+"]");
				
				break;
			case 6:
				System.out.println("Introduzca la marca del coche a buscar: ");
				marca = sc.next();
				
				c = gestor.obtenerMarca(marca);
				System.out.println("Coche [ID: " + c.getId() + ", MATRICULA: " + c.getMatricula() + ", MARCA: " + c.getMarca() + ", MODELO: " + c.getModelo() + ", KILOMETROS: "+c.getKilometros()+"]");
				
				break;
			case 7:
				System.out.println("Introduzca el modelo del coche a buscar: ");
				modelo = sc.next();
				
				c = gestor.obtenerModelo(modelo);
				System.out.println("Coche [ID: " + c.getId() + ", MATRICULA: " + c.getMatricula() + ", MARCA: " + c.getMarca() + ", MODELO: " + c.getModelo() + ", KILOMETROS: "+c.getKilometros()+"]");
				
				break;
			case 8:
				List<Coche> lista = gestor.listar();
				for(int i=0;i<lista.size();i++) {
					System.out.println(lista.get(i));
				}
				break;
			
			case 0:
				terminado = true;
				break;
			}
		}while(!terminado);
		
		System.out.println("Fin de programa");

	}
	
	private static void menu() {
		System.out.println("======== MENU ========");
		System.out.println("1- Alta de coche");
		System.out.println("2- Eliminar coche por id");
		System.out.println("3- Modificar coche por id");
		System.out.println("4- Buscar coche por id");
		System.out.println("5- Buscar coche por matricula");
		System.out.println("6- Buscar coche por marca");
		System.out.println("7- Buscar coche por modelo");
		System.out.println("8- Listar coches");
		System.out.println("0- Salir del programa");
	}

}
