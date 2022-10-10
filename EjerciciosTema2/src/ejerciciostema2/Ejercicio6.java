package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. 
		 * Si no existen, habrá que indicarlo. Hay que tener en cuenta que las soluciones de una ecuación de segundo grado
		 * ax2 + bx + c = 0 
		 * se calculan de la siguiente forma: (fórmula del documento)
		 */
		
		//variables
		Scanner scan = new Scanner (System.in); // iniciar escáner
		int a, b, c, xNegativo, xPositivo; // variables
		
		//pedir datos
		System.out.println("Introduce el valor de a: "); // pedir a
		a = scan.nextInt(); // guardar a
		System.out.println("Introduce el valor de b: "); // pedir b
		b = scan.nextInt(); // guardar b
		System.out.println("Introduce el valor de c: "); // pedir c
		c = scan.nextInt(); // guardar c

		//aplicar fórmula
		xNegativo = (int) (-b - (Math.sqrt (Math.pow (b, 2) - (4 * a * c)))) / (2 * a); // resultado negativo
		xPositivo = (int) (-b - (Math.sqrt (Math.pow (b, 2) - (4 * a * c)))) / (2 * a); // resultado positivo

	}

}
