package es.Studium.Trimestre1.Practica1;
/*
 * Traductor - Realizar un programa que lea una frase en español y la traduzca al
inglés o viceversa. Usaremos un diccionario reducido compuesto por las palabras
yo, tu, el, ella, soy, eres, es, alto, bajo, español y sus equivalentes en inglés.
 */
import java.util.Scanner;
public class Traductor 
{

	public static void main(String[] args) 
	{
		// Le aplicamos a teclado la utilidad escáner
		Scanner teclado = new Scanner(System.in);
		String palabra;
		
		System.out.println("Atención, escriba todo en minúsculas");
		System.out.println("Indique una palabra a traducir:");
		palabra=teclado.nextLine();//Leemos la cadena a traducir
		traducir(palabra); //método para traducir
		teclado.close(); //Cerramos teclado
	}
	private static void traducir(String palabra) {
		switch (palabra)
		{
		case "yo":
			System.out.println("La traducción a inglés es:");
			System.out.println("i");
			break;//detiene el switch
		case "tu":
			System.out.println("La traducción al inglés es:");
			System.out.println("you");
			break;//detiene el switch
		case "el":
			System.out.println("La traducción al inglés es:");
			System.out.println("he");
			break;//detiene el switch
		case "ella":
			System.out.println("La traducción al inglés es:");
			System.out.println("she");
			break;//detiene el switch
		case "soy":
			System.out.println("La traducción al inglés es:");
			System.out.println("I am");
			break;//detiene el switch
		case "eres":
			System.out.println("La traducción al inglés es:");
			System.out.println("you are");
			break;//detiene el switch
		case "es":
			System.out.println("La traducción al inglés es:");
			System.out.println("is");
			break;//detiene el switch
		case "alto":
			System.out.println("La traducción a inglés es:");
			System.out.println("tall");
			break;//detiene el switch
		case "bajo":
			System.out.println("La traducción a inglés es:");
			System.out.println("low");
			break;//detiene el switch
		case "español":
			System.out.println("La traducción a inglés es:");
			System.out.println("spanish");
			break;//detiene el switch
		case "i":
			System.out.println("La traducción a español es:");
			System.out.println("yo");
			break;//detiene el switch
		case "you":
			System.out.println("La traducción a español es:");
			System.out.println("tu");
			break;//detiene el switch
		case "he":
			System.out.println("La traducción a español es:");
			System.out.println("el");
			break;//detiene el switch
		case "she":
			System.out.println("La traducción a español es:");
			System.out.println("ella");
			break;//detiene el switch
		case "i am":
			System.out.println("La traducción a español es:");
			System.out.println("soy");
			break;//detiene el switch
		case "you are":
			System.out.println("La traducción a español es:");
			System.out.println("eres");
			break;//detiene el switch
		case "is":
			System.out.println("La traducción a español es:");
			System.out.println("es");
			break;//detiene el switch
		case "tall":
			System.out.println("La traducción a español es:");
			System.out.println("alto");
			break;//detiene el switch
		case "low":
			System.out.println("La traducción a español es:");
			System.out.println("bajo");
			break;//detiene el switch
		case "spanish":
			System.out.println("La traducción a español es:");
			System.out.println("español");
			break; //detiene el switch
		default://Por defecto mostrara el siguiente mensaje de error
			System.out.println("Introduzca una palabra que se encuentre en el diccionario, y todo en minúsculas");
		}
	}
}
