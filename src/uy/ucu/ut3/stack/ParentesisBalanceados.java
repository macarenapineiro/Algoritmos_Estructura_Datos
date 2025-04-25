package uy.ucu.ut3.stack;

import java.util.Stack;

public class ParentesisBalanceados {
	
	public static Boolean estaBalanceado(Stack<String> pila) {
		int abierto = 0;
		int cerrado = 0;
		while(!pila.isEmpty()) {
			String caracter = pila.pop();
			if(caracter == "(") {
				abierto += 1;
			}
			else if(caracter == ")") {
				cerrado += 1;
			}
		}
		
		if(abierto == cerrado) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pila = new Stack<String>();
		pila.push("(");
		pila.push("1");
		pila.push("+");
		pila.push("2");
		pila.push(")");
		
		System.out.println(estaBalanceado(pila));
	}
}
