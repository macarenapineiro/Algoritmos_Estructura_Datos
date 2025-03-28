package uy.ucu.tp2;

import java.util.Date;

public class Prestamo {
	private Libro libro;
	private Usuario usuario;
	private Date fechaPrestamo; 
	private Date fechaDevolucion; 
	
	public Prestamo(Usuario usuario, Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
		this.usuario = usuario;
		this.libro = libro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public String toString() {
	    return "Prestamo{" +
	           "Libro='" + libro.getTitulo() + '\'' +
	           ", Usuario='" + usuario.getNombre() + " " + usuario.getApellido() + '\'' +
	           ", FechaPrestamo=" + fechaPrestamo +
	           ", FechaDevolucion=" + fechaDevolucion +
	           '}';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
