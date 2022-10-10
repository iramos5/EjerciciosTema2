 package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pedir dos números enteros y decir si son iguales o no.
		
		//variables
		Scanner scan = new Scanner (System.in); //iniciar escaner
		int num1, num2; // los dos números enteros
		
		//introducir datos
		System.out.println("Introduce el primer número: "); // meter primer numero
		num1 = scan.nextInt(); //guardar primer numero
		System.out.println("Introduce el segundo número: "); // meter segundo numero
		num2 = scan.nextInt(); //guardar segundo numero
		
		//comprar
		if (num1 == num2) {
			System.out.println("Son iguales");
		}
		else
	}

}
