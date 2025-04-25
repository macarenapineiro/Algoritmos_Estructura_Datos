package uy.ucu.ut3.stack;

import java.util.Stack;

public class CopiaPila {

	public static Stack<String> copia(Stack<String> pila){
		Stack<String> aux = new Stack<String>();
		Stack<String> nueva = new Stack<String>();
		while(!pila.isEmpty()) {
			aux.push(pila.pop());
		}
		while(!aux.isEmpty()) {
			String caracter = aux.pop();
			pila.push(caracter);
			nueva.push(caracter);
		}
		return nueva;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pila = new Stack<String>();
		pila.push("Hola");
		pila.push("como");
		pila.push("estas");
		Stack<String> resultado = copia(pila);
		while(!resultado.isEmpty()) {
			System.out.println(resultado.pop());
		}

		
	}

}
