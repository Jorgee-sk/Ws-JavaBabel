package entidad;

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
	
		if(this.getArma().getnArma()==a.getnArma()) {
			this.setBoostArma(true);
			return (this.getArma().usarArma()+this.getFuerza());
			
		}else {
			//En otro caso que no sea espada, cambiamos referencia a arcos y comprobamos de nuevo
			if(this.getArma().getnArma()==a.getnArma()) {
				this.setBoostArma(true);
				return (this.getArma().usarArma()+this.getFuerza());
			}
			
			this.setBoostArma(false);
			//Si no , daño base del arma
			return this.getArma().usarArma();
		}
	}
	
}
