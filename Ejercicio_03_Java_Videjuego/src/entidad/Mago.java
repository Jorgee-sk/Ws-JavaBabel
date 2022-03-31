package entidad;

public class Mago extends Personaje{

	private int inteligencia;
	private Arma a = new Hechizos();
	
	
	public Mago() {
		this.setInteligencia(120);
		this.setVida(1000);
	}
	
	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	@Override
	public int atacar() {
		
		//Cuando usamos el arma de rezo vamos a hacer daño extra 
		if(this.getArma().getnArma()==a.getnArma()) {
			this.setBoostArma(true);
			return (this.getArma().usarArma()+this.getInteligencia());
			
		}else {
			//Si no , daño base del arma
			this.setBoostArma(false);
			return this.getArma().usarArma();
		}
	}

	
}
