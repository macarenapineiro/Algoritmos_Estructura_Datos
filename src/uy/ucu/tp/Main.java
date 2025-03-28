package uy.ucu.tp;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario("Macarena", "Piñeiro");
		Libro libro1 = new Libro ("HeartStopper", "Alice Oseman", 2016 );
		Libro libro2 = new Libro("Un cuento perfecto", "Elísabet Benavent", 2020);
		Libro libro3 = new Libro("Antes de diciembre", "Joana Marcus", 2021);
		Libro libro4 = new Libro("Los siete maridos de evelyn hugo", "Taylor Jenkins Reid", 2020);
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.agregarLibroDisponible(libro1);
		biblioteca.agregarLibroDisponible(libro2);
		biblioteca.agregarLibroDisponible(libro3);
		biblioteca.agregarLibroDisponible(libro4);
		System.out.println(biblioteca);
		biblioteca.prestarLibro(usuario, "HeartStopper");
		biblioteca.prestarLibro(usuario, "un cuento perfecto");
		biblioteca.prestarLibro(usuario, "antes de diciembre");
		biblioteca.prestarLibro(usuario, "los siete maridos de Evelyn Hugo");
		System.out.println(biblioteca);
		System.out.println(usuario);
		System.out.println(libro1.isDisponible());
		biblioteca.devolverLibro(usuario, "HeartStopper");
		System.out.println(biblioteca);
		System.out.println(usuario);
		System.out.println(libro1.isDisponible());
		
		


	}
}
