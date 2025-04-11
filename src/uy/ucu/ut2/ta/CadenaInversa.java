package uy.ucu.ut2.ta;


public class CadenaInversa {
	//Imprime una cadena de forma inversa utilizando divide y venceras
	public String imprimirCadenaInversa(String palabra) {
		//Cuando el largo sea 1 devuelve la cadena
		if(palabra.length() == 1) {
			return palabra;
		}

		//Divide la cadena en dos partes
		return imprimirCadenaInversa(palabra.substring(palabra.length()/2)) + imprimirCadenaInversa(palabra.substring(0, palabra.length()/2));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CadenaInversa imprimir = new CadenaInversa();
		System.out.println(imprimir.imprimirCadenaInversa("hola"));
	}

}
