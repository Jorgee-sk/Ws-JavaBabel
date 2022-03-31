package entidad;

public class Arcos extends Arma{
	
	public Arcos() {
		this.setnArma("Arco");
	}
	@Override
	public int usarArma() {
		// TODO Auto-generated method stub
		return this.getDañoArma();
	}


}
