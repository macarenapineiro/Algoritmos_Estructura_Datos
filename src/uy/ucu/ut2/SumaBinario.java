package uy.ucu.ut2;

public class SumaBinario {

	//calcula la suma de los digitos de un numero binario
	public int sumBinaryDigits(String binario) {
		if(binario.isEmpty()) {
			return 0;
		}
		//obtiene el primer caracter y lo convierte en un numero para luego llamar a la función si ese digito
		return Character.getNumericValue(binario.charAt(0)) + sumBinaryDigits(binario.substring(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaBinario suma = new SumaBinario();
		System.out.println(suma.sumBinaryDigits(""));
	}

}
