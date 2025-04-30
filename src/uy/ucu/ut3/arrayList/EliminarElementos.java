package uy.ucu.ut3.arrayList;

import java.util.ArrayList;

public class EliminarElementos {

	public static ArrayList<Integer> eliminarMayor50(ArrayList<Integer> numeros){
		ArrayList<Integer> nueva = new ArrayList <> (numeros);
		for (int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i) > 50) {
				nueva.remove(numeros.get(i));
			}
		}
		return nueva;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList <Integer>();
		lista.add(10);
		lista.add(51);
		lista.add(50);
		lista.add(105);
		ArrayList<Integer> num = eliminarMayor50(lista);
		for (Integer integer : num) {
			System.out.println(integer);
		}
	}

}
