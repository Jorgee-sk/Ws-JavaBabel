package main;

interface InterfazGenerica <T>{
	public T operaciones(T a, T b);
}

public class Main {
	

	public static void main(String[] args) {
		
		
		InterfazGenerica<Integer> suma = ( n1, n2 ) -> { return n1 + n2; };
		InterfazGenerica<Integer> resta = ( n1, n2 ) -> { return n1 - n2; };
		InterfazGenerica<Integer> multiplicacion = ( n1, n2 ) -> { return n1 * n2; };
		InterfazGenerica<Double> division = ( n1, n2 ) -> { return n1/n2; };
		InterfazGenerica<Integer> potencia = (n1,n2) -> {return (int) Math.pow(n1, n2);};
		
		
		
		System.out.println(" "+suma.operaciones(20, 40));
		System.out.println(" "+resta.operaciones(700, 225));
		System.out.println(" "+multiplicacion.operaciones(2, 7));
		System.out.println(" "+division.operaciones(5.0, 8.0));
		System.out.println(" "+potencia.operaciones(6, 8));
	}

}
