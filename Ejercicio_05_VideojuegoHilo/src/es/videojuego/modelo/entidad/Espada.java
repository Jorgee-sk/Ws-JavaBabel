package es.videojuego.modelo.entidad;

import es.videojuego.util.NumeroAleatorio;

public class Espada extends Arma{

	@Override
	public int usar() {
		int danioBase = NumeroAleatorio.generarNumero(getDanioMinimo(), getDanioMaximo());
		if(this.getPersonaje() instanceof Guerrero) {
			Guerrero guerrero = (Guerrero)this.getPersonaje();
			danioBase += guerrero.getFuerza();
		}
		
		if(this.getPersonaje() instanceof Jefe) {
			Jefe jefe = (Jefe)this.getPersonaje();
			danioBase += jefe.getGolpeJefe();
		}
		
		
		int numeroAleatorioCritico = NumeroAleatorio.generarNumero(1, 100);
		if(numeroAleatorioCritico <= getPorcentajeCritico()) {
			System.out.println(getPersonaje().getNombre() + " golpe critico!");
			danioBase *= 2;
		}
		return danioBase;
	}

}
