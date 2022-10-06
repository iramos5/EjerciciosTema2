package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
		
		//variables
		Scanner scan = new Scanner (System.in); //iniciar escáner
		int num; //número a introducir
		
		//pedir datos
		System.out.println("Introduce un número: "); //pedir el número al usuario
		num = scan.nextInt(); // guardar el número introducido en la variable
		
		//comprobar si es par y mostrar resultado
		if (num%2==0) { //Si el resto del número entre dos da cero
			System.out.println("El número " + num + " es par"); // es par y se muestra por pantalla
		}
		else { //sino
			System.out.println("El número " + num + " es impar"); //es impar y se muestra por pantalla
		}
		
		// cierre escáner
		scan.close();
	
	}

}
