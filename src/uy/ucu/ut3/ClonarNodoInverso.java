package uy.ucu.ut3;

public class ClonarNodoInverso {
	
	public static Nodo invertir(Nodo nodo) {
	    Nodo retorno = null;
	    Nodo aux = nodo;

	    while (aux != null) {
	        Nodo nuevo = new Nodo();
	        nuevo.setValor(aux.getValor());
	        nuevo.setSiguiente(retorno);
	        retorno = nuevo;
	        aux = aux.getSiguiente();
	    }

	    return retorno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo nodo1 = new Nodo();
		nodo1.setValor(2);
		Nodo nodo2 = new Nodo();
		nodo2.setValor(4);
		nodo1.setSiguiente(nodo2);
		System.out.println(invertir(nodo1).getValor());
		System.out.println(invertir(nodo1).getSiguiente().getValor());

	}
}
