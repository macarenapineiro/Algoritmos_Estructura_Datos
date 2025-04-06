package uy.ucu.ut2;

public class Permutaciones {

	//Imprime las permutaciones de una cadena
	public void generarPermutaciones(String original, String parcial) {
        if (original.isEmpty()) {
            System.out.println(parcial);
            return;
        }

        for (int i = 0; i < original.length(); i++) {
        	//obtiene el primer caracter
            char actual = original.charAt(i);
            //guarda el resto de la cadena sin ese caracter
            String resto = original.substring(0, i) + original.substring(i + 1);
            //llama a la funcion con la cadena recortada y el caracter separado en una cadena parcial
            generarPermutaciones(resto, parcial + actual);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutaciones permutaciones = new Permutaciones();
		permutaciones.generarPermutaciones("abc", "");

	}

}
