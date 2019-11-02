package paquetesumas;

import java.util.Scanner;

public class Sumarconstru {
   private int valor1;
   private int valor2;
   
   public Sumarconstru() {
	   Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese el valor 1:");
		valor1 = ingreso.nextInt();
		System.out.println("Ingrese el valor 2:");
		valor2 = ingreso.nextInt();
		System.out.println("Total Suma = " + (valor1 + valor2));
		ingreso.close();
	   
   }
 
	
	
	public static void main(String[] args) {

		Sumarconstru ej1 = new Sumarconstru();
	}
}
