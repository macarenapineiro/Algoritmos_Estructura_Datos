package uy.ucu.ut3.arrayList;

import java.util.ArrayList;

public class NumerosPares {

	public static void mostrarPares(ArrayList<Integer> lista) {
		for (Integer i : lista) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(6);
		lista.add(5);
		mostrarPares(lista);
	}

}
