package uy.ucu.tp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que permite contar la cantidad de palabras, vocales y consonantes en una frase,
 * además de determinar cuántas palabras tienen más letras que un valor mínimo especificado.
 * También proporciona métodos para leer líneas desde un archivo y contar la cantidad de palabras que contiene.
 * 
 * @author Macarena
 * @version 1.0
 */
public class ContadorPalabras {

//JavaDoc del metodo, documentacion
	/**
	 * Cuenta la cantidad de palabras en la frase proporcionada
     * 
	 * @param frase La frase a contar
	 */
	public int contarPalabras(String frase) {
 		int palabras = 0;
 		int espacios = 0;
 		if(frase == null || frase.isBlank()) {
 			return 0;
 		}
 		if(frase.charAt(0) == ' ') {
 			frase = frase.substring(1); 	
 		}
 		if(frase.length()>0 && frase.charAt(frase.length()-1) == ' ') {
 			frase = frase.substring(0, frase.length()-1);
 		}
 		for (int i = 0; i < frase.length(); i++) {
 			if(frase.charAt(i) == ' ') {
 				espacios += 1;
 			}
 		}
 		palabras = espacios + 1;
 		
 		
 		
 		return palabras;
 	}
	/**
	 * Cuenta la cantidad de vocales y consonantes de una frase dada
	 * 
	 * @param frase La frase en la que se cuentan las letras
	 * @return Un string con la información sobre el resultado obtenido de vocales y consonantes
	 */
 	public String cantidadLetras(String frase) {
 		int vocales = 0;
 		int consonantes = 0;
 		for (int i = 0; i < frase.length(); i++) {
 			if(Character.isLetter(frase.charAt(i))) {
 				if(esVocal(frase.charAt(i)))
 				{
 					vocales += 1;
 				}
 				else {
 				consonantes += 1;	
 				}
 			}
 				
 		}
 		return "Cantidad vocales: " + vocales + ", cantidad de consonantes: " + consonantes;
 	}
 	/**
 	 * Determina cuántas palabras tienen más letras que el número mínimo especificado.
 	 * 
 	 * @param frase La frase a comparar
 	 * @param numero El numero considerado como minimo
 	 * @return un String proporcionando la información del resultado
 	 */
 	public String contarPalabrasLargas(String frase, int numero) {
         int contador = 0;
         int largo = 0;
         
         for (int i = 0; i <= frase.length(); i++) {
         	if(i < frase.length() && frase.charAt(i) != ' ') {
         		largo += 1;
         	}
         	else if(largo > 0) {
         		if(largo > numero) {
         			contador += 1;
         		}
         		largo = 0;
         	}
 			
 		}
         return "cantidad de palabras con largo mayor a " + numero + " es: " + contador;
 
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
	public String[] obtenerLineas(String archivo) throws IOException {
		List<String> lineas = new ArrayList<String>();
		String fileName = archivo;
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			String linea;
			while((linea = br.readLine()) != null) {
				lineas.add(linea);
			}
		} finally {
		    br.close();
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
		for (String frase : lineasArchivo) {
			contador = contador + contarPalabras(frase);
		}
		return contador;
	}
}



