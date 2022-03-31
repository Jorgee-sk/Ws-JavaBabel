package entidad;

public abstract class Personaje {
	
	private int vida;
	private Arma arma;
	private String nombre;
	private boolean boostArma;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public abstract int atacar();
	
	public boolean isBoostArma() {
		return boostArma;
	}
	public void setBoostArma(boolean boostArma) {
		this.boostArma = boostArma;
	}
	
}
