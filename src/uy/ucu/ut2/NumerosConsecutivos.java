package uy.ucu.ut2;

public class NumerosConsecutivos {
	
	//Imprime los numeros naturales de 1 a n de forma ascendente
	public void printNumbers(int n) {
		if(n == 0) {
			return;
		}
		printNumbers(n - 1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosConsecutivos numeros = new NumerosConsecutivos();
		numeros.printNumbers(5);
		numeros.printNumbers(9);
		numeros.printNumbers(1);
		numeros.printNumbers(0);

	}

}
