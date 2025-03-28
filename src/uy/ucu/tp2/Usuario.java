package uy.ucu.tp2;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
	private String nombre;
	private String apellido;
	private int id;
	private List<Libro> librosPrestados;
	
	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.librosPrestados = new ArrayList<Libro>();
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Libro> getLibrosPrestados() {
		return librosPrestados;
	}

	public void setLibrosPrestados(List<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
	
	public void solicitarLibro(Libro libro) {
		librosPrestados.add(libro);
	}
	
	public void devolverLibro(Libro libro) {
		librosPrestados.remove(libro);
	}
	
	public boolean puedeSolicitar() {
		if(librosPrestados.size()< 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
    public String toString() {
        return "Usuario{" +
               "Nombre='" + nombre + '\'' +
               ", Apellido='" + apellido + '\'' +
               ", LibrosPrestados=" + librosPrestados +
               '}';
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
