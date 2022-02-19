package com.ejerciciosbasicos;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Ejercicio 5

		Scanner recibirnumero = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número: ");
		numero = recibirnumero.nextInt();

		if (numero >= 0) {
			System.out.println("El numero es positivo: " + numero);
		} else {
			System.out.println("El numero es negativo: " + numero);
		}

		if (numero % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar ");
		}

	}

}
