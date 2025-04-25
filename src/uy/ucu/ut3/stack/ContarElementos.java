package uy.ucu.ut3.stack;

import java.util.Stack;

public class ContarElementos {
	
	public static int contador(Stack<String> pila) {
		int contador = 0;
		Stack<String> aux = new Stack<String>();
		while(!pila.isEmpty())
		{
			aux.push(pila.pop());
			contador ++;
		}
		while(!aux.isEmpty()) {
			pila.push(aux.pop());
		}
		
		return contador;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pila = new Stack<String>();
		pila.push("Hola");
		pila.push("como");
		pila.push("estas");
		pila.push("bien");
		System.out.println(contador(pila));
	}
}
