package uy.ucu.ut2;

public class ParImpar {

	//Determina si es par o impar utilizando solo resta
	public String parImpar(int n) {
		//si n da 0 luego de restarle 2 es par
		if(n==0) {
			return "Par";
		}
		//si n da 1 luego de restarle 2 es impar
		if(n == 1) {
			return "Impar";
		}
		int num = n -2;
		return parImpar(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParImpar esPar = new ParImpar();
		System.out.println(esPar.parImpar(8));
		System.out.println(esPar.parImpar(3));

	}

}
