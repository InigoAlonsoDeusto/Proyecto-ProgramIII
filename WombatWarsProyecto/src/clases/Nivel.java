package clases;

public class Nivel {

	public String nombreNivel;
	public String descripcion; 

	
	
	public Nivel(String nombreNivel, String descripcion) {
		super();
		this.nombreNivel = nombreNivel;
		this.descripcion = descripcion;
	}

	public String getNombreNivel() {
		return nombreNivel;
	}

	public void setNombreNivel(String nombreNivel) {
		this.nombreNivel = nombreNivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	
	@Override
	public String toString() {
		return "Nivel [nombreNivel=" + nombreNivel + ", descripcion=" + descripcion + "]";
	}
	
	
}
