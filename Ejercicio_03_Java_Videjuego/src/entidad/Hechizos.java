package entidad;

public class Hechizos extends Arma{
	
	public Hechizos() {
		this.setnArma("Hechizo");
	}
	
	@Override
	public int usarArma() {
		// TODO Auto-generated method stub
		return this.getDañoArma();
	}

}
