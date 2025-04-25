package uy.ucu.ut3.arrayList;

import java.util.ArrayList;

public class ContienePalabra {

	public static Boolean tienePalabra(ArrayList<String> lista, String palabra) {
		for (String string : lista) {
			if(string == palabra) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Hola");
		lista.add("Bien");
		lista.add("Como");
		System.out.println(tienePalabra(lista, "hol"));
	}

}
