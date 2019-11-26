package es.Studium.Trimestre1.Practica1;
/*
 * Intercalar. Realizar un programa que lea dos cadenas y muestre la cadena resultante de intercalar una letra de una cadena con otra letra de la otra cadena. Ejemplo: Hola y Adiós, darían como resultado HAodliaós.
 */
import java.util.Scanner; //importamos la utilidad escaner
public class Intercalar 
{
	public static void main(String[] args) 
	{
		// Le aplicamos a teclado la utilidad escaner
		Scanner teclado = new Scanner(System.in);
		String cadena1,cadena2;
		//Leemos las cadenas a intercalar
		System.out.println("indique una cadena");
		cadena1=teclado.nextLine();
		System.out.println("indique otra cadena");
		cadena2=teclado.nextLine();
		teclado.close(); //Cerramos teclado
		System.out.println(intercalarCadenas(cadena1, cadena2)); //imprimimos por pantalla el resultado de la funcion.
	}

	private static String intercalarCadenas(String cadena1, String cadena2) {
		String cadena3="";
		if(cadena1.length()>=cadena2.length())//Si Longitud cadena1 es mayor o igual que cadena2
		{
			for(int i=0; i<cadena1.length(); i++) //Siendo mayor la longitud de cadena1 recorremos cadena 1 mientras la longitud sea mayor a la variable i
			{
				cadena3=cadena3+cadena1.charAt(i);//añade el caracter de la cadena1 con valor de pocicion i
				if (i<cadena2.length())//Comprobamos que la longitud de cadena 2 sea menor a i, ya que si es mayor el siguiente codigo daria errror.
				{
					cadena3=cadena3+cadena2.charAt(i);//añade el caracter de la cadena2 con valor de pocicion i
				}	
			}
		}
		else
		{
			for(int i=0; i<cadena2.length(); i++)//Siendo mayor la longitud de cadena2 recorremos cadena 1 mientras la longitud sea mayor a la variable i
			{
				if (i<cadena1.length())//Comprobamos que la longitud de cadena 2 sea menor a i, ya que no podemos segir recorriendo si es mayor
				{
					cadena3=cadena3+cadena1.charAt(i); //añade el caracter de la cadena1 con valor de pocicion i
				}
				cadena3=cadena3+cadena2.charAt(i);//añade el caracter de la cadena2 con valor de pocicion i
			}
			
		}
		return cadena3; //se devuelve cadena3
	}

}
