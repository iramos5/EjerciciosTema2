package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Pedir tres números y mostrarlos ordenados de mayor a menor.
		
		// variables
		Scanner scan = new Scanner (System.in); // iniciar escaner
		int num1, num2, num3; // numeros

		// pedir datos
		System.out.println("Introduce el primer número; "); // meter primer numero
		num1 = scan.nextInt(); // guardar primer numero
		System.out.println("Introduce el segundo número: "); // meter segundo número
		num2 = scan.nextInt(); // guardar segundo numero
		System.out.println("Introduce el tercer número: "); // meter tercer número
		num3 = scan.nextInt(); // guardar tercer numero
		
		// ordenar numeros de mayor a menor
		if (num1 > num2 && num2 > num3 ) { // orden1
			System.out.println(num1 + ", " + num2 + ", " + num3); // se imprime en orden
		}
		
		else if (num1 > num3 && num3 > num2 ) { // orden2
			System.out.println(num1 + ", " + num3 + ", " + num2); // se imprime en orden
		}
		
		else if (num2 > num1 && num1 > num3 ) { // orden3
			System.out.println(num2 + ", " + num1 + ", " + num3); // se imprime en orden
		}
		
		else if (num2 > num3 && num3 > num1 ) { // orden4
			System.out.println(num2 + ", " + num3 + ", " + num1); // se imprime en orden
		}
		
		else if (num3 > num1 && num1 > num2 ) { // orden5
			System.out.println(num3 + ", " + num1 + ", " + num2); // se imprime en orden
		}

		else { // orden6
			System.out.println(num3 + ", " + num2 + ", " + num1); // se imprime en orden
		}
		
		// cerrar escaner
		scan.close();
	
	}

}
