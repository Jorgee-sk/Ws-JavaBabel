package es.videojuego.modelo.entidad;

public abstract class Arma {
	private int danioMinimo;
	private int danioMaximo;
	/**
	 * el procentaje critico de un arma va de 0 a 100
	 */
	private int porcentajeCritico;
	private Personaje personaje;
	
	/**
	 * Metodo que usa el arma para hacer da�o
	 * @return el da�o que causa el arma
	 */
	public abstract int usar();

	public int getDanioMinimo() {
		return danioMinimo;
	}

	public void setDanioMinimo(int danioMinimo) {
		this.danioMinimo = danioMinimo;
	}

	public int getDanioMaximo() {
		return danioMaximo;
	}

	public void setDanioMaximo(int danioMaximo) {
		this.danioMaximo = danioMaximo;
	}

	public int getPorcentajeCritico() {
		return porcentajeCritico;
	}

	public void setPorcentajeCritico(int porcentajeCritico) {
		this.porcentajeCritico = porcentajeCritico;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public String toString() {
		return "Arma [danioMinimo=" + danioMinimo + ", danioMaximo=" + danioMaximo + ", porcentajeCritico="
				+ porcentajeCritico + "]";
	}	
	
	
	
}
