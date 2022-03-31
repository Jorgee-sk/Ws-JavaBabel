package entidad;

public class Rezos extends Arma{
	
	public Rezos() {
		this.setnArma("Rezo");
	}
	@Override
	public int usarArma() {
		// TODO Auto-generated method stub
		return this.getDañoArma();
	}

}
