package uy.ucu.tp3;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ContadorPalabras contador = new ContadorPalabras();
		System.out.println("cantidad de palabras: " + contador.contarPalabras("hola mundo"));
		System.out.println(contador.cantidadLetras(" hoy es un dia soleado " ));
		System.out.println(contador.contarPalabrasLargas("voy a comer 4 galletas", 2));
		System.out.println("cantidad de palabras: " + contador.cantidadPalabras(contador.obtenerLineas("archivo.txt")));
	}
}
