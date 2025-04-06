package uy.ucu.ut2;

public class SumaNumerosConsecutivos {

	//Calcula la suma de los primeros numeros naturales hasta n
	public int sumaNumero(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sumaNumero(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaNumerosConsecutivos suma = new SumaNumerosConsecutivos();
		System.out.println(suma.sumaNumero(5));
		System.out.println(suma.sumaNumero(3));
		System.out.println(suma.sumaNumero(6));

	}

}
