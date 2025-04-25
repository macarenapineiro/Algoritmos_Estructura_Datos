package uy.ucu.ut3.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {

	public static void cajero() {
		Queue<String> cola = new LinkedList<String>();
		cola.offer("Ana");
		cola.offer("Luis");
		cola.offer("Juan");
		System.out.println("personas en la cola " + cola);
		
		while(!cola.isEmpty()) {
			String persona = cola.poll();
			System.out.println(persona + " fue atendido");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cajero();
	}
}
