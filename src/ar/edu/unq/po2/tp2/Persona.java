package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
public class Persona {
	public String nombre;
	public String direccion;
	public String estadoCivil;
	public LocalDate fechaNacimiento;
	public int sueldoBasico;
	
	
	public Persona(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, int sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNacimiento= fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
	}


	public int edad()
	{
		LocalDate fechaActual = LocalDate.now(); 
		return fechaActual.getYear() - this.fechaNacimiento.getYear();
	}

}


