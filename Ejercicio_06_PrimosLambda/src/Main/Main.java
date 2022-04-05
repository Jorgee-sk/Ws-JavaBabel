package Main;

import java.util.Scanner;

interface calculoPrimo {
	public Runnable operacion(Integer a);
}

public class Main {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca valores: ");
		int pValor = teclado.nextInt();
		int sValor = teclado.nextInt();
		int tValor = teclado.nextInt();
		
		calculoPrimo p = numeroPrimo -> {
			 boolean prime = true; 
			    for(int i = 2; i < numeroPrimo; i++) {
			        if (numeroPrimo % i == 0) {
			            prime = false;
			        }
			    }
			    if(prime && numeroPrimo!=1)
			    	System.out.println("El numero "+numeroPrimo+" es primo");
			    else
			    	System.out.println("El numero "+numeroPrimo+" no es primo");
				
			    return null;
	
		};
		
		Thread calcularPrimo = new Thread(p.operacion(pValor));
		Thread calcularPrimo2 = new Thread(p.operacion(sValor));
		Thread calcularPrimo3 = new Thread(p.operacion(tValor));
		
		calcularPrimo.start();
		calcularPrimo2.start();
		calcularPrimo3.start();
		
	}

}
