package entidad;

import java.util.Random;

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
		boolean aux = critico();
		this.setgCritico(aux);
		
		//Cuando usamos el arma de rezo vamos a hacer daño extra 
		if(this.getArma().getnArma()==a.getnArma()) {
			this.setBoostArma(true);
			if(this.isgCritico())
				return (int) (1.5*(this.getArma().usarArma()+this.getSabiduria()));
			else
				return (this.getArma().usarArma()+this.getSabiduria());
			
		}else {
			//Si no , daño base del arma
			this.setBoostArma(false);
			if(this.isgCritico())
				return (int) (1.5*(this.getArma().usarArma()));
			else
				return (this.getArma().usarArma());
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
