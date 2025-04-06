package uy.ucu.ut2;

public class Factorial {

	//calcula el factorial de un numero
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(5));
	}

}
