package ucu.uy.tp3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContadorPalabras contador = new ContadorPalabras();
//		System.out.println(contador.contarPalabras(" hola como estas "));
//		System.out.println(contador.contarPalabras("hola"));
//		System.out.println(contador.contarPalabras(" hola"));
//		System.out.println(contador.contarPalabras("hola "));
//		System.out.println(contador.contarPalabras("hola como "));
//		System.out.println(contador.contarPalabras("hola"));
//		System.out.println(contador.cantidadLetras("hola"));
//		System.out.println(contador.cantidadLetras(" hola"));
//		System.out.println(contador.cantidadLetras("hola "));
//		System.out.println(contador.cantidadLetras("hola1"));
//		System.out.println(contador.cantidadLetras("1"));
//		System.out.println(contador.cantidadLetras("hola como"));
		System.out.println(contador.contarPalabrasLargas("hola mundo como estas", 4));
		System.out.println(contador.contarPalabrasLargas("macarena t hola si todo botella", 3));
		


	}

}
