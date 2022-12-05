package utilidadesJuegoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilidadesJuego.GeneradorDeWombats;
import utilidadesUsuario.Usuario;

class GeneradorDeWombatsTest {

	private GeneradorDeWombats g;
	
	//objeto que se va a usar antes de ejecutar cada test
	//asi nos ahorramos tener que escribirlo para cada test que queramos ejecutar
	@BeforeEach
	public void setUp() {
		g = new GeneradorDeWombats(null, 0);
	}
	
	@Test
	public void testGetNumeroRandom() {
		assertEquals(null, g.getNumeroRandom());
	}
	
	@Test
	public void testGetWombat() {
		assertEquals(0, g.getWombat());
	}

}
