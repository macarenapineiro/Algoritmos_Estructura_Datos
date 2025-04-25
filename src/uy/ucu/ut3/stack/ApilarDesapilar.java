package uy.ucu.ut3.stack;

import java.util.Stack;

public class ApilarDesapilar {

	public void apilar() {
		Stack<Integer> pila = new Stack<Integer>();
		pila.push(10);
		pila.push(3);
		pila.push(4);
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
