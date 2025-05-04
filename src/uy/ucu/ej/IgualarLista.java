package uy.ucu.ej;

import java.util.ArrayList;

public class IgualarLista {

	public ArrayList<Integer> numerosIguales(ArrayList<Integer> numeros1, ArrayList<Integer> numeros2){
		ArrayList<Integer> aux = new ArrayList<Integer>();
		for (Integer int1 : numeros1) {
			for (Integer int2 : numeros2) {
				if(int1 == int2) {
					aux.add(int1);
				}
			}
			
		}
		return aux;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IgualarLista igualarLista = new IgualarLista();
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(1);
		lista2.add(5);
		lista2.add(3);
		lista2.add(7);
		ArrayList<Integer> resultado = igualarLista.numerosIguales(lista1, lista2);
		for (Integer integer : resultado) {
			System.out.println(integer);
		}
	}

}
