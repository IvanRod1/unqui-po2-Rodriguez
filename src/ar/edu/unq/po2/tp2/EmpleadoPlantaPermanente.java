package ar.edu.unq.po2.tp2;

public class EmpleadoPlantaPermanente extends Persona {
	
	
	public int cantidadHijos;
	public int antiguedad;
	public EmpleadoPlantaPermanente(String nombre, String direccion, String estadoCivil, int fechaNacimiento,
			int sueldoBasico, int cantidadHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.antiguedad= antiguedad;
		this.cantidadHijos= cantidadHijos;
		// TODO Auto-generated constructor stub
	}

}
