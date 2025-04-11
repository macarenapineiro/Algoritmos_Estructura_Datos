package uy.ucu.ut2.ta;


public class SumaBinario {

	//Calcula la suma de los digitos de un numero binario utilizando divide y venceras
	public int sumBinaryDigits(String binario) {
		int numero = 0;
		if(binario.isEmpty()) {
			return 0;
		}
		//Cuando el largo sea 1, el caracter lo pasa a numero y lo suma al total
		if(binario.length() == 1) {
			return numero = numero + Character.getNumericValue(binario.charAt(0));
		}
		
		//Divide la cadena en dos partes
		return sumBinaryDigits(binario.substring(0, binario.length()/2)) + sumBinaryDigits(binario.substring(binario.length()/2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaBinario suma = new SumaBinario();
		System.out.println(suma.sumBinaryDigits("1101"));
	}

}
