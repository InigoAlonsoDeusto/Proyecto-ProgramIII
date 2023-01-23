package clases;

public class NivelTienda extends Nivel {

	public NivelTienda(String nombreNivel, String descripcion) {
		super(nombreNivel, descripcion);
		
	}
	
	public int precio;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public NivelTienda(String nombreNivel, String descripcion, int precio) {
		super(nombreNivel, descripcion);
		this.precio = precio;
	}
	
	
	
	

}
