package uy.ucu.ut2;

public class CadenaInversa {

	//Imprime una cadena de forma inversa
	public void imprimirCadenaInversa(String palabra) {
		if(palabra.length() == 1) {
			System.out.println(palabra);
			return;
		}
		//Imprime el ultimo caracter
		System.out.println(palabra.charAt(palabra.length()-1));
		//Llama al metodo sin el ultimo caracter
		imprimirCadenaInversa(palabra.substring(0, palabra.length()-1));  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadenaInversa imprimir = new CadenaInversa();
		imprimir.imprimirCadenaInversa("Hola");
	}

}
