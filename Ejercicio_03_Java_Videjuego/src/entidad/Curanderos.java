package entidad;

public class Curanderos extends Personaje{
	
	private int sabiduria;
	private Arma a = new Rezos();
	
	public Curanderos() {
		this.setSabiduria(140);
		this.setVida(900);
	}
	
	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}
	
	@Override
	public int atacar() {
		
		//Cuando usamos el arma de rezo vamos a hacer daño extra 
		if(this.getArma().getnArma()==a.getnArma()) {
			this.setBoostArma(true);
			return (this.getArma().usarArma()+this.getSabiduria());
			
		}else {
			//Si no , daño base del arma
			this.setBoostArma(false);
			return this.getArma().usarArma();
		}
		
	}
}
