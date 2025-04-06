package uy.ucu.ut2;

public class EsPar {

	//Determina si todos los digitos son pares
	public String esPar(int n) {
		if (n<10 && n%2 == 0) {
			return "Es par";
		}
		int resto = n%10;
		//verifica digito por digito si es par con el resto de la division entre 2
		if(resto%2 == 1) {
			return "No todos los digitos son par";
		}
		return esPar(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EsPar numeroPar = new EsPar();
		System.out.println(numeroPar.esPar(888));
		System.out.println(numeroPar.esPar(758));
		System.out.println(numeroPar.esPar(8));
		System.out.println(numeroPar.esPar(7));

	}

}
