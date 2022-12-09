public package utilidadesJuegoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import utilidadesJuego.Puntuacion;

class PuntuacionTest {

	private Puntuacion p;
	
	//objeto que se va a usar antes de ejecutar cada test
	//asi nos ahorramos tener que escribirlo para cada test que queramos ejecutar
	@BeforeEach
	public void setUp() {
		p = new Puntuacion(5);
	}
	
	@Test
	public void testGetValor() {
		assertEquals(5, p.getValor());
	}

}

