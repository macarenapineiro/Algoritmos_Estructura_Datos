package uy.ucu.tp1;

public class Iterativo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterativo iterativo = new Iterativo();
		iterativo.imprimirIterativos();

	}
	
	public void imprimirIterativos() {
	//	for (int i = 0; i < 10; i++) {
		//	System.out.println("El numero es: "+i);
		//}
		int i = 0;
		while(i<11) {
			System.out.println("El numero es: " + i);
			i++;
		}
	}
}
