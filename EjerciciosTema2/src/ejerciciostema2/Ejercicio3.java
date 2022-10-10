package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Implementar un programa que pida por teclado un número decimal e 
		 * indique si es un número casi-cero, que son aquellos, positivos o negativos, 
		 * que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. 
		 * Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
		 */
		
		// variables
		Scanner scan = new Scanner (System.in); // iniciar escáner
		float num; // numero
		int casi0; // casi 0
		
		// introducir datos
		System.out.println("Introduce un número decimal: "); // meter numero
		num = scan.nextFloat(); // guardar numero
		
		// ¿es número casi-cero?
		if (num == 0) { // exclusión
			System.out.println("No es un número casi-cero"); // respuesta
		}
		else if (num > -1 && num < 1) { // rango para ser casi-cero
			System.out.println("Es un número casi-cero"); // respuesta
		}
		else { // si se sale del rango
			System.out.println("No es un número casi-cero"); // respuesta
		}
	
		// cierre escáner
		scan.close();
		

	}

}
