package utilidadesUsuario;


public class Usuario {
	
	private String username;
	private String contrasenya;

	public Usuario(String username, String contrasenya) {
		super();
		this.username = username;
		this.contrasenya = contrasenya;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	@Override
	public String toString() {
		return username;
	}
}

