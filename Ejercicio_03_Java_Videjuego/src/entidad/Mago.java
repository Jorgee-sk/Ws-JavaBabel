package entidad;

import java.util.Random;

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
		
		boolean aux = critico();
		this.setgCritico(aux);
		//Cuando usamos el arma de rezo vamos a hacer daño extra 
		if(this.getArma().getnArma()==a.getnArma()) {
			this.setBoostArma(true);
			if(this.isgCritico())
				return (int) (1.5*(this.getArma().usarArma()+this.getInteligencia()));
			else 
				return (this.getArma().usarArma()+this.getInteligencia());
			
		}else {
			//Si no , daño base del arma
			this.setBoostArma(false);
			if(this.isgCritico())
				return (int) (1.5*this.getArma().usarArma());
			else
				return this.getArma().usarArma();
		}
	}
	
	@Override
	public boolean critico() {
		
		Random r = new Random();
		int valorRand = r.nextInt(11)+1;
		if(valorRand == 1)
			return true;
		else
			return false;
	}

	
}
