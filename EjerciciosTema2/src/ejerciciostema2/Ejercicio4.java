package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Pedir dos números y mostrarlos ordenados de menor a mayor.
		
		// variables
		Scanner scan = new Scanner (System.in); // iniciar escaner
		int num1, num2; // numeros
		
		// pedir datos
		System.out.println("Introduce el primer número; "); // meter primer numero
		num1 = scan.nextInt(); // guardar primer numero
		System.out.println("Introduce el segundo número: "); // meter segundo número
		num2 = scan.nextInt(); // guardar segundo numero
		
		// ordenar numeros de menor a mayor
		if (num1 < num2) { // si el primer numero es menor que el segundo
			System.out.println(num1 + ", " + num2); // se imprime en orden
		}
		else { // si el segundo es menor que el primero
			System.out.println(num2 + ", " + num1); // se imprime en orden
		}
		
		// cerrar escaner
		scan.close();
	}

}
