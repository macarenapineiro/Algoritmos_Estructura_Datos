package uy.ucu.tp2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Biblioteca {
	private List<Libro> librosDisponibles;
	private List<Prestamo> prestamos;
	
	public Biblioteca() {
		this.librosDisponibles = new ArrayList<Libro>();
		this.prestamos = new ArrayList<Prestamo>();
	}
	
	public List<Libro> getLibrosDisponibles() {
		return librosDisponibles;
	}

	public void setLibrosDisponibles(List<Libro> librosDisponibles) {
		this.librosDisponibles = librosDisponibles;
	}
	
	public void agregarLibroDisponible(Libro libro) {
		this.librosDisponibles.add(libro);
	}
	
	public void removerLibroDisponible(Libro libro) {
		this.librosDisponibles.remove(libro);
	}
	
	public void prestarLibro(Usuario usuario, String titulo) {
        if (usuario.puedeSolicitar()) {
        	Libro libroPrestar = null;
        	for (Libro libro : librosDisponibles) {
                if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) {
                    libro.prestar();
                    usuario.solicitarLibro(libro);
                    prestamos.add(new Prestamo(usuario, libro, new Date(), null)); 
                    libroPrestar = libro;

                }
        	}
        	if(libroPrestar != null) {
        		librosDisponibles.remove(libroPrestar);
        		System.out.println("El libro " + libroPrestar.getTitulo() + " fue prestado");
        	}
        	else {
        		System.out.println("El libro "+ titulo + " no se encuentra disponible.");
        	
        	}
        }
        else {
            System.out.println("El usuario ya tiene 3 libros prestados.");
        }
    }
	
	public void devolverLibro(Usuario usuario, String titulo) {
		Libro libroDevuelto = null;
		Prestamo prestamoDevuelto = null;
		for (Libro libro : usuario.getLibrosPrestados()) {
			if(libro.getTitulo().equalsIgnoreCase(titulo)) {
				for (Prestamo prestamo : prestamos) {
					if (prestamo.getLibro().getTitulo().equalsIgnoreCase(titulo) && prestamo.getUsuario().equals(usuario)) { 
						prestamoDevuelto = prestamo;
					}
				}
				libro.devolver();
				libroDevuelto = libro;
			}
		}
		if(libroDevuelto != null) {
			prestamoDevuelto.setFechaDevolucion(new Date());
			usuario.devolverLibro(libroDevuelto);
			librosDisponibles.add(libroDevuelto);
			System.out.println("El libro " + libroDevuelto.getTitulo() + " fue devuelto");
			prestamos.remove(prestamoDevuelto);

		}
		else {
			System.out.println("El usuario no tiene el libro "+ titulo  +" prestado.");
		}
	}
	 
	@Override
	public String toString() {
	    return "Biblioteca{" +
	           "LibrosDisponibles=" + librosDisponibles +
	           "Prestamos" + prestamos +
	           '}';
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
