package uy.ucu.tp1;

public class Alumno {
	private String nombre;
	private String apellido;
	private Integer cedula;
	private String telefono;
	private Carrera carrera;
	
	public Alumno() {
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getCedula() {
		return cedula;
	}



	public void setCedula(int cedula) {
		this.cedula = cedula;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Carrera getCarrera() {
		return carrera;
	}



	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
}
