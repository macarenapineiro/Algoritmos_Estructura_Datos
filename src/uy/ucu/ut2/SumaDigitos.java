package uy.ucu.ut2;

public class SumaDigitos {

	//Calcula la suma de los digitos de un numero
	public int sumaDigito(int n) {
		if(n==0) {
			return 0;
		}
		//obtiene un digito y le suma el siguiente
		return n%10 + sumaDigito(n/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaDigitos suma = new SumaDigitos();
		System.out.println(suma.sumaDigito(6875));
	}

}
