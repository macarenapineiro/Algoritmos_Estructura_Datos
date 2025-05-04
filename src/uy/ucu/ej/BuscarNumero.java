package uy.ucu.ej;

import java.util.ArrayList;

public class BuscarNumero {

	public int numeroMayor(ArrayList<Integer> numeros) {
		int numero = 0;
		for (Integer num : numeros) {
			if(num > numero) {
				numero = num;
			}
		}
		return numero;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuscarNumero buscarNumero = new BuscarNumero();
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(5);
		numeros.add(10);
		numeros.add(3);
		numeros.add(11);
		System.out.println(buscarNumero.numeroMayor(numeros));
	}

}
