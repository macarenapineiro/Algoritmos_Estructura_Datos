package uy.ucu.ut3.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalabraPalindromo {

	public static Boolean esPalindromo(String palabra) {
		Stack<Character> pila = new Stack<Character>();
		Queue<Character> cola = new LinkedList<Character>();
		for(int i = 0; i < palabra.length(); i++) {
			Character c = palabra.charAt(i);
			cola.offer(c);
			pila.push(c);
		}
		while(!cola.isEmpty()) {
			if(cola.poll() == pila.pop()) {
				return true;
			}
		}
		return false; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(esPalindromo("reconocer"));
		System.err.println(esPalindromo("hola"));
	}

}
