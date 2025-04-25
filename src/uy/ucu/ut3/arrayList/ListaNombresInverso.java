package uy.ucu.ut3.arrayList;

import java.util.ArrayList;

public class ListaNombresInverso {

	public static ArrayList<String> nombreInverso (ArrayList<String> nombre){
		ArrayList<String> nuevo = new ArrayList<String>();
		for(int i = nombre.size() -1; i >= 0; i-- ) {
			nuevo.add(nombre.get(i));
		}
		return nuevo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Juana");
		nombres.add("Pablo");
		nombres.add("Martin");
		ArrayList<String> resultado = nombreInverso(nombres);
		for (String string : resultado) {
			System.out.println(string);
		}
	}

}
