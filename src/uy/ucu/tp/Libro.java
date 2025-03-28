package uy.ucu.tp;

public class Libro {

	private String titulo;
	private String autor;
	private int añoPublicacion;
	private boolean disponible;
	
	public Libro(String titulo, String autor, int año) {
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = año;
		this.disponible = true;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponibilidad) {
		this.disponible = disponibilidad;
	}
	
	public void prestar() {
		this.disponible = false;
	}
	
	public void devolver() {
		this.disponible = true;
	}
	
	 @Override
	    public String toString() {
	        return "Libro{Título='" + titulo + "', Autor='" + autor + "', Año=" + añoPublicacion + ", Disponible=" + disponible + "}";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
