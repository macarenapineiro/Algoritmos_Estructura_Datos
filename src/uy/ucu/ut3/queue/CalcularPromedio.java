package uy.ucu.ut3.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CalcularPromedio {

	public static int promedio(Queue<Integer> numeros) {
		int suma = 0;
		int contador = 0;
		Queue<Integer> aux = new LinkedList<Integer>();
		while(!numeros.isEmpty()) {
			int num = numeros.poll();
			aux.offer(num);
			suma += num;
			contador ++;
		}
		while(!aux.isEmpty()) {
			numeros.offer(aux.poll());
		}
		return suma/contador;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> numero = new LinkedList<Integer>();
		numero.offer(1);
		numero.offer(2);
		numero.offer(3);
		numero.offer(4);
		numero.offer(5);
		numero.offer(6);
		System.out.println(promedio(numero));
	}

}
