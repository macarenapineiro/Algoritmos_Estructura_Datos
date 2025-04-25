package uy.ucu.ut3.queue;

import java.util.LinkedList;
import java.util.Queue;

public class SistemaTurnos {
	
	Queue<String> colaEspera = new LinkedList<String>();
	public void agregarPaciente(String paciente) {
		colaEspera.offer(paciente);
		System.out.println("Se agrego al paciente " + paciente);
	}
	
	public void atenderPaciente() {
		if(colaEspera.isEmpty()) {
			System.out.println("No hay más pacientes en espera");
		}
		else {
			System.out.println(colaEspera.poll() + " fue atendido");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaTurnos sistema = new SistemaTurnos();
		sistema.agregarPaciente("Juan");
		sistema.agregarPaciente("Lucas");
		sistema.agregarPaciente("Maria");
		sistema.agregarPaciente("Emilia");
		System.out.println(sistema.colaEspera);
		sistema.atenderPaciente();
		sistema.atenderPaciente();
		sistema.atenderPaciente();
		sistema.atenderPaciente();
		sistema.atenderPaciente();
	}
}
