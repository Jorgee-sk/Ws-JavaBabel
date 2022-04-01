package main;

import java.util.Scanner;

import entidades.Calculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca valores: ");
		int pValor = teclado.nextInt();
		int sValor = teclado.nextInt();
		int tValor = teclado.nextInt();
		
		Calculo calcularPrimo = new Calculo(pValor);
		Calculo calcularPrimo2 = new Calculo(sValor);
		Calculo calcularPrimo3= new Calculo(tValor);
		
		calcularPrimo.start();
		calcularPrimo2.start();
		calcularPrimo3.start();
		
	}

}
