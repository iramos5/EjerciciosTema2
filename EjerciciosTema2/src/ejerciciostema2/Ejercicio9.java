package ejerciciostema2;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/* Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, 
		 * pidiendo a cada jugador que escriba PIEDRA, PAPEL o TIJERA. 
		 * El juego debe mostrar por pantalla quién ha ganado el juego tras jugar una partida. 
		 * Hay que contemplar el caso de que empaten.
		 */
		
		// variables
		Scanner scan = new Scanner (System.in); //inciar escáner
		int jugador1, jugador2; // jugadores
		final int PIEDRA = 1, PAPEL = 2, TIJERAS = 3; // jugadas
		
		// introducir datos
		System.out.println("Jugador 1: Escribe PIEDRA (1), PAPEL (2) o TIJERAS (3): "); // meter jugador 1
		jugador1 = scan.nextInt(); // guardar jugador 1
		System.out.println("Jugador 2: Escribe PIEDRA (1), PAPEL (2) o TIJERAS (3): "); // meter jugador 2
		jugador2 = scan.nextInt(); // guardar jugador 2
		
		// juego
		if (jugador1 == jugador2) { // si el jugador 1 es igual al jugador 2, hay un empate
			System.out.println("Empate");
		}
		else if (jugador1 == 1 && jugador2 ==3 || jugador1 == 2 && jugador2 == 1 || jugador1 == 3 && jugador2 ==2) { 
			System.out.println("Gana el jugador 1"); // opciones en las que ganaría el jugador 1
		}
		else if (jugador1 < 1 || jugador1 > 3 || jugador2 <1 || jugador2 >3) { // datos introducidos que no serían válidos
			System.out.println("Los datos introducidos no son válidos");
		}
		else {
			System.out.println("Gana jugador 2"); // todo lo demás ganaría el jugador 2
		}
		
		// cierre escáner
		scan.close();
		
		
		
		
		
		
		
		

	}

}
