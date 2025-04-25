package uy.ucu.ut3.queue;

import java.util.LinkedList;
import java.util.Queue;

public class EliminarMultiplosTres {
	
	public static Queue<Integer> eliminarNumeros(Queue<Integer> numeros){
		Queue<Integer> aux = new LinkedList<Integer>();
		while(!numeros.isEmpty()) {
			int numero = numeros.poll();
			if(numero % 3 != 0) {
				aux.offer(numero);
			}
		}
		return aux;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> numero = new LinkedList<Integer>();
		numero.offer(1);
		numero.offer(2);
		numero.offer(3);
		numero.offer(5);
		numero.offer(6);
		numero.offer(9);
		
		System.out.println(eliminarNumeros(numero));
	}

}
