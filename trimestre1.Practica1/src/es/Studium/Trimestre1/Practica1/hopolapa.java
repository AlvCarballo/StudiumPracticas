package es.Studium.Trimestre1.Practica1;
/*
 * Hopolapa - Realizar un programa que lea una cadena e inserte detrás de cada
vocal que encuentre, una p y la vocal encontrada. Por ejemplo, si tenemos Hola
se transformará en Hopolapa.
 */
import java.util.Scanner;
public class hopolapa {
	public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);
				String palabra;
				System.out.println("indique la palabra a cambiar");
				palabra=teclado.nextLine();
				teclado.close();
				
				/* Forma de acerlo, pero no es la adecuada.
				palabra=palabra.replace("a", "apa");
				palabra=palabra.replace("e", "epe");
				palabra=palabra.replace("i", "ipi");
				palabra=palabra.replace("o", "opo");
				palabra=palabra.replace("u", "upu");
				palabra=palabra.replace("A", "ApA");
				palabra=palabra.replace("E", "EpE");
				palabra=palabra.replace("I", "IpI");
				palabra=palabra.replace("O", "OpO");
				palabra=palabra.replace("U", "UpU");
				 */
				
				
				
				
				
				System.out.println(palabra);
	}
}
