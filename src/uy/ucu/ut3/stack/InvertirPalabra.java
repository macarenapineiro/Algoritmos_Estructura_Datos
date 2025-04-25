package uy.ucu.ut3.stack;

import java.util.Stack;

public class InvertirPalabra {

	public static String invertir(Stack<String> pila) {
		String palabra = "";
		while(!pila.isEmpty()) {
			String letra = pila.pop();
			palabra = palabra + letra;
		}
		return palabra;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> palabra = new Stack<String>();
		palabra.push("H");
		palabra.push("O");
		palabra.push("L");
		palabra.push("A");
		System.out.println(invertir(palabra));
	}

}
