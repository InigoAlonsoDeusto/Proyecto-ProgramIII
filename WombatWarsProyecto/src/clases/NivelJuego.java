package clases;


public class NivelJuego extends Nivel {
	


	public NivelJuego(String nombreNivel, String descripcion) {
		super(nombreNivel, descripcion);
		
	}
	
	
	public int numeroAgujeros;
	public int tiempo;
	
	
	
	public int getNumeroAgujeros() {
		return numeroAgujeros;
	}
	public void setNumeroAgujeros(int numeroAgujeros) {
		this.numeroAgujeros = numeroAgujeros;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
	
	public NivelJuego(String nombreNivel, String descripcion, int numeroAgujeros, int tiempo) {
		super(nombreNivel, descripcion);
		this.numeroAgujeros = numeroAgujeros;
		this.tiempo = tiempo;
	}
	
	
	

}
