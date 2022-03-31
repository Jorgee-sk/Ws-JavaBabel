package entidad;

public abstract class Arma {
	
	private int dañoArma;
	private String nArma;

	public int getDañoArma() {
		return dañoArma;
	}

	public void setDañoArma(int dañoArma) {
		this.dañoArma = dañoArma;
	}
	
	public String getnArma() {
		return nArma;
	}

	public void setnArma(String nArma) {
		this.nArma = nArma;
	}
	
	public abstract int usarArma();

	
}
