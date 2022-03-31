package entidad;

public class Espada extends Arma{
	
	public Espada() {
		this.setnArma("Espada");
	}
	
	
	@Override
	public int usarArma() {
		// TODO Auto-generated method stub
		return this.getDañoArma();
	}


}
