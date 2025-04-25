package uy.ucu.ut3;

public class ClonarNodo {

	public static Nodo clonarNodo(Nodo nodo) {
	    Nodo retorno = new Nodo();
	    retorno.setValor(nodo.getValor());
	    Nodo aux = nodo.getSiguiente();
	    Nodo nodoClonado = retorno;

	    while (aux != null) {
	        Nodo nuevo = new Nodo();
	        nuevo.setValor(aux.getValor());	        
	        nodoClonado.setSiguiente(nuevo);
	        nodoClonado = nuevo;
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
		System.out.println(clonarNodo(nodo1).getValor());
		System.out.println(clonarNodo(nodo1).getSiguiente().getValor());

	}

}
