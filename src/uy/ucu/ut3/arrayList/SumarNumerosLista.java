package uy.ucu.ut3.arrayList;

import java.util.ArrayList;

public class SumarNumerosLista {

	public static float sumaNumerosFlotantes(ArrayList<Float> numero) {
		float suma = 0;
		for (Float num : numero) {
			suma += num;
		}
		return suma;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> numeros = new ArrayList<Float>();
		numeros.add(11.0f);
		numeros.add(1.6f);
		numeros.add(4.0f);
		System.out.println(sumaNumerosFlotantes(numeros));
	}
}
