package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoPlantaPermanenteTest {

	@Test
	void test() {
		EmpleadoPlantaPermanente miEmpleado = new EmpleadoPlantaPermanente("Raul", "Calle 123", "Casado", 45, 10000,2,5);
		assertEquals("Raul",miEmpleado.nombre);
	}

}
