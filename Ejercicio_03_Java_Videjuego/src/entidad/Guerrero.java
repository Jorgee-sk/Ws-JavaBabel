package entidad;

import java.util.Random;

public class Guerrero extends Personaje{
	
	private int fuerza;
	private Arma a = new Espada();
	
	
	public Guerrero() {
		this.setFuerza(100);
		this.setVida(1500);
	}
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	@Override
	public int atacar() {
		
		boolean aux = critico();
		this.setgCritico(aux);
		
		if(this.getArma().getnArma()==a.getnArma()) {
			this.setBoostArma(true);
			return (this.getArma().usarArma()+this.getFuerza());
			
		}else {
			//En otro caso que no sea espada, cambiamos referencia a arcos y comprobamos de nuevo
			if(this.getArma().getnArma()==a.getnArma()) {
				this.setBoostArma(true);
				if(this.isgCritico())
					return (int) (1.5*(this.getArma().usarArma()+this.getFuerza()));
				else	
					return (this.getArma().usarArma()+this.getFuerza());
					
			}
			
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
