package ejerciciostema2;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		/* Escribir un programa que pida al usuario tres números enteros, 
		 * y que muestre por pantalla si la suma de dos de esos números da como resultado el otro número.
		 */

		//variables
		Scanner scan = new Scanner (System.in); //iniciar escáner
		int num1, num2, num3; //números a introducir
		
		//pedir datos
		System.out.println("Introduce el primer número: "); //pedir primer número
		num1 = scan.nextInt(); // guardar primer número
		System.out.println("Introduce el segundo número: "); //pedir segundo número
		num2 = scan.nextInt(); // guardar segundo número
		System.out.println("Introduce el tercer número: "); //pedir tercer número
		num3 = scan.nextInt(); // guardar tercer número
		
		//operaciones
		if (num1 + num2 == num3) { // si número 1 y 2 suman el numero 3
			System.out.println(num1 + " + " + num2 + " = " + num3); // solución 1
		}
		else if (num1 + num3 == num2) { // si número 1 y 3 suman el numero 2
			System.out.println(num1 + " + " + num3 + " = " + num2); // solución 2
		}
		else if (num2 + num3 == num1) { // si número 2 y 3 suman el numero 1
			System.out.println(num2 + " + " + num3 + " = " + num1); // solución 3
		}
		else {
			System.out.println("Ninguno de los números sumados da el otro número"); // ninguna suma da el tercer número
		}
		
		// cierre escáner
		scan.close();
		
		
	}

}
