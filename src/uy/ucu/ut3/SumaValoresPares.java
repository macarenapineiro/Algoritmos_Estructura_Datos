package uy.ucu.ut3;

public class SumaValoresPares {

	public static int sumarPosicionesPares(Nodo nodo) {
		int contador = 0;
		int suma = 0;
		Nodo aux = nodo;
		while (aux != null) {
			if(contador % 2 == 0) {
				suma += aux.getValor();
			}
			contador ++;
			aux = aux.getSiguiente();
		}
		return suma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo nodo1 = new Nodo();
		nodo1.setValor(2);
		Nodo nodo2 = new Nodo();
		nodo2.setValor(4);
		nodo1.setSiguiente(nodo2);
		Nodo nodo3 = new Nodo();
		nodo3.setValor(3);
		nodo2.setSiguiente(nodo3);
		System.out.println(sumarPosicionesPares(nodo1));
	}

}
