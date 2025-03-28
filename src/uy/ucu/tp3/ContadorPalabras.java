package uy.ucu.tp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que permite contar la cantidad de palabras, vocales y consonantes en una frase,
 * además de determinar cuántas palabras tienen más letras que un valor mínimo especificado.
 * También proporciona métodos para leer líneas desde un archivo.
 * 
 * @author Macarena
 * @version 1.0
 */
public class ContadorPalabras {

//JavaDoc del metodo, documentacion
	/**
	 * Cuenta la cantidad de palabras en la frase proporcionada, así como la cantidad de vocales y consonantes.
     * Además, determina cuántas palabras tienen más letras que el número mínimo especificado.
     * 
	 * @param frase La frase a contar
	 * @param numero El numero minimo de letras de una palabra larga que se quiera
	 */
	public void contarPalabras(String frase, int numero) {
		int palabras = 0;
		int espacios = 0;
		int vocales = 0;
		int consonantes = 0;
		int palabrasLargas = 0;
		int contadorLetras = 0;
		
		if(frase.charAt(0) == ' ') {
			frase = frase.substring(1);
		}
		if(frase.charAt(frase.length()-1 ) == ' ') {
			frase.substring(0, frase.length()-1);
		}
		frase.toLowerCase();
		for(int i = 0; i < frase.length(); i++) {
			if(Character.isLetter(frase.charAt(i))) {
				if(esVocal(frase.charAt(i))) {
					vocales ++;
				} else {
					consonantes ++;

				}
				contadorLetras ++;
			}
			
			if(frase.charAt(i) == ' ') {
				espacios ++;
				if(contadorLetras > numero) {
					palabrasLargas ++;
				}
				contadorLetras = 0;
			}
			
		}
		if(contadorLetras > numero) {
			palabrasLargas ++;
		}
		palabras = espacios + 1;
		System.out.println("Cantidad de palabras: " + palabras);
		System.out.println("Cantidad de vocales: " + vocales);
		System.out.println("Cantidad de consonantes: " + consonantes);
		System.out.println("Cantidad de palabras mas largas que " + numero+ " letras: " + palabrasLargas);


	}
	/**
	 * Este metodo verifica si el caracter es vocal o no
	 * 
	 * @param a Caracter a verificar
	 * @return Devuelve {@code true} si es vocal y {@code false} si es el caso contrario
	 */
	private boolean esVocal(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			return true;
		}
		return false;
	}
	/**
	 * Lee el archivo y devuelve el contenido en un arreglo llamado lineas
	 * 
	 * @param archivo La ruta del archivo a leer
	 * @return Arreglo de cadenas en el que el contenido son las lineas del archivo
	 */
	public String[] obtenerLineas(String archivo) {
		List<String> lineas = new ArrayList<String>();)

		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String linea = br.readLine();
			while(linea != null) {
				lineas.add(linea);
				linea = br.readLine();
			}
		} 
		catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineas.toArray(new String[0]);
    }
	/**
	 * Cuenta la cantidad de palabras que contiene el conjunto de lineas
	 * 
	 * @param lineasArchivo un arreglo de cadenas que representa una linea de texto
	 * @return el numero total de palabras 
	 */
	public int cantidadPalabras(String[] lineasArchivo) {
		int contador = 0;
		for (String palabra : lineasArchivo) {
			contador += contarPalabras(palabra);
		}
		return contador;
	}
}



