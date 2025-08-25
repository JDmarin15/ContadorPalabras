package com;
import java.util.Scanner;
public class contadorPalabras {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
	
		System.out.println("Ingrese cadena de texto");
		String cadena=teclado.nextLine();
		System.out.println("Ingrese un caracter");
		char caracater=teclado.nextLine().charAt(0);
		int counter = 0;
        for (int i = 0; i < cadena.length(); i++) {
	          if(cadena.charAt(i) == caracater)
	          {
	              counter++;
	          }
	     }
		System.out.println("\nLa cantida de veces que aparece el caracter "+caracater+" en la frase es :"+counter);
	

	 }
}
