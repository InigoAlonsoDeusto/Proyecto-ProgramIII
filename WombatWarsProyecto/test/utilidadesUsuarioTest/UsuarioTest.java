package utilidadesUsuarioTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilidadesUsuario.Usuario;

class UsuarioTest {

	private Usuario u;
	
	//objeto que se va a usar antes de ejecutar cada test
	//asi nos ahorramos tener que escribirlo para cada test que queramos ejecutar
	@BeforeEach
	public void setUp() {
		u = new Usuario("123", "123");
	}
	
	@Test
	public void testGetUsername() {
		assertEquals("123", u.getUsername());
	}
	
	@Test
	public void testGetContrasenya() {
		assertEquals("123", u.getContrasenya());
	}
	
	@Test
	public void testGetToString() {
		assertEquals("123", u.getUsername());
	}

}