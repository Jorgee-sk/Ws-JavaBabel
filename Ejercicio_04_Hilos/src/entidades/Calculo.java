package entidades;

public class Calculo extends Thread{
	
	int valorCalculo;
	
	public Calculo(int v) {
		
		this.valorCalculo = v;
	
	}
	
	@Override
	public void run() {
		calcularPrimos();
	}
	
	public void calcularPrimos() {
		 boolean prime = true; 
		    for(int i = 2; i < this.valorCalculo; i++) {
		        if (this.valorCalculo % i == 0) {
		            prime = false;
		        }
		    }
		    if(prime && valorCalculo!=1)
		    	System.out.println("El numero "+valorCalculo+" es primo");
		    else
		    	System.out.println("El numero "+valorCalculo+" no es primo");
	}
}
