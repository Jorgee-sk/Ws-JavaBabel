package entidad;

public abstract class Arma {
	
	private int da�oArma;
	private String nArma;

	public int getDa�oArma() {
		return da�oArma;
	}

	public void setDa�oArma(int da�oArma) {
		this.da�oArma = da�oArma;
	}
	
	public String getnArma() {
		return nArma;
	}

	public void setnArma(String nArma) {
		this.nArma = nArma;
	}
	
	public abstract int usarArma();

	
}
