package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void test() {
		Persona miPersona = new Persona("Ivan","Roma 2149", "Soltero", 2001, 1000);
		assertEquals("Ivan",miPersona.nombre);
	}
	@Test
	void test2()
	{
		Persona miPersona = new Persona("Ivan","Roma 2149", "Soltero", 2001, 1000);
		assertEquals("Roma 2149",miPersona.direccion);
	}
	@Test
	void test3() {
		Persona miPersona = new Persona("Ivan","Roma 2149", "Soltero", 2001, 1000);
		assertEquals("Soltero", miPersona.estadoCivil);
	}
	@Test
	void test4() {
		Persona miPersona = new Persona("Ivan","Roma 2149", "Soltero", 2001, 1000);
		assertEquals(2001, miPersona.fechaNacimiento);
	}
	@Test
	void test5()
	{
		Persona miPersona = new Persona("Ivan","Roma 2149", "Soltero", 2001, 1000);
		assertEquals(1000,miPersona.sueldoBasico);

	}
	@Test
	void test6()
	{
		Persona miPersona = new Persona("Ivan","Roma 2149", "Soltero", 2001, 1000);
		assertEquals(23,miPersona.edad());
	}

}
