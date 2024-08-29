package ar.edu.unq.po2.tp2;

public class Persona {
	public String nombre;
	public String direccion;
	public String estadoCivil;
	public int fechaNacimiento;
	public int sueldoBasico;
	
	
	public Persona(String nombre, String direccion, String estadoCivil, int fechaNacimiento, int sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}


	public int edad()
	{
		return 2024 - this.fechaNacimiento;
	}

}


