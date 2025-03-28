package ucu.uy.tp3;

public class ContadorPalabras {
	
	//JavaDoc del metodo, documentacion
	
	public int contarPalabras(String frase) {
		int palabras = 0;
		int espacios = 0;
		
		if(frase.charAt(0) == ' ') {
			frase = frase.substring(1);
		}
		if(frase.charAt(frase.length()-1) == ' ') {
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
	public String cantidadLetras(String frase) {
		int vocales = 0;
		int consonantes = 0;
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isLetter(frase.charAt(i))) {
				if(frase.charAt(i) == 'a')
				{
					vocales += 1;
				}
				else if(frase.charAt(i) == 'e'){
					vocales += 1;
				}
				else if(frase.charAt(i) == 'i'){
					vocales += 1;
				}
				else if(frase.charAt(i) == 'o'){
					vocales += 1;
				}
				else if(frase.charAt(i) == 'u'){
					vocales += 1;
				}
				else {
				consonantes += 1;	
				}
			}
				
		}
		return "Cantidad vocales: " + vocales + ", cantidad de consonantes: " + consonantes;
	}
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
	
}
