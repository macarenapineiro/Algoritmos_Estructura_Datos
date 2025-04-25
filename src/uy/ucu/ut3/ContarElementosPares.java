package uy.ucu.ut3;

public class ContarElementosPares {

	public static int contarPares(Nodo nodo) {
		int contador = 0;
		Nodo aux = nodo;
		while(aux != null) {
			if(aux.getValor()%2 == 0) {
				contador ++;
			}
			aux = aux.getSiguiente();
		}
		return contador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo nodo1 = new Nodo();
		nodo1.setValor(2);
		Nodo nodo2 = new Nodo();
		nodo2.setValor(4);
		nodo1.setSiguiente(nodo2);
		contarPares(nodo1);
	}

}
