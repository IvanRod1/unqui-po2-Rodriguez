package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Persona {
	
	
	public int cantidadHijos;
	public int antiguedad;
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
			int sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.antiguedad= antiguedad;
		this.cantidadHijos= cantidadHijos;
		// TODO Auto-generated constructor stub
	}
	
	public int sueldoBruto()
	{
		int asignacionXHijos = this.cantidadHijos * 150;
		int sueldoSinRetenciones =this.sueldoBasico + this.bonoMatrimonio() + (this.antiguedad * 50) + asignacionXHijos;
		int retencionJubilacion = (int) (sueldoSinRetenciones - (sueldoSinRetenciones * 0.15));
		int retencionObraSocial = (int) (sueldoSinRetenciones - (sueldoSinRetenciones * 0.2));
		int retencionPorHijo = sueldoSinRetenciones - (this.cantidadHijos * 20);
		
		return sueldoSinRetenciones - retencionJubilacion - retencionObraSocial - retencionPorHijo;
	}
	
	private boolean esCasado() {
		return this.estadoCivil == "Casado";
	}
	
	private int bonoMatrimonio()
	{
		if(this.esCasado())
		{
			return 50;
		}
		else
		{
			return 0;
		}
	}

}
