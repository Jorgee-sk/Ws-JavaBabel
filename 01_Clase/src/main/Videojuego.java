package main;

public class Videojuego {
	private String titulo;
	private int nota;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		if(nota < 0) {
			this.nota = 0;
		}else {
			this.nota = nota;
		}
		
	}
	
}
