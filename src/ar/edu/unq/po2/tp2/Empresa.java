package ar.edu.unq.po2.tp2;

import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	private List <Persona> empleados;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public List<Persona> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Persona> empleados) {
		this.empleados = empleados;
	}
	
	public Empresa(String nombre, String cuit, List<Persona> empleados) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
	} 
	
	
	
}
