package paquetesumas;

import java.util.Scanner;

public class Sumar {

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el valor 1:");
		int valor1 = ingreso.nextInt();
		System.out.println("Ingrese el valor 2:");
		int valor2 = ingreso.nextInt();
		// tambien se puede hacer int total = valor + valor 2 e imprimir total
		// e imprimir total para mostrar
		System.out.println("Total Suma = " + (valor1 + valor2));
		ingreso.close();
	}
}
