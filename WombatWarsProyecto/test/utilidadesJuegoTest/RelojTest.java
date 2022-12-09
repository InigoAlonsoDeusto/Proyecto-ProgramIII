package utilidadesJuegoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilidadesJuego.Reloj;

class RelojTest {

	private Reloj r;
	
	//objeto que se va a usar antes de ejecutar cada test
	//asi nos ahorramos tener que escribirlo para cada test que queramos ejecutar
	@BeforeEach
	public void setUp() {
		r = new Reloj(3, null);
	}
	
	@Test
	public void testGetInterval() {
		assertEquals(3, r.getInterval());
	}
	
	@Test
	public void testGetTimer() {
		assertEquals(null, r.getTimer());
	}

}
