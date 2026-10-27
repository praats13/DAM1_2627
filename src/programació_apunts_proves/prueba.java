// comentario

/*
 * comentario
 */
package programació_apunts_proves;

import java.util.Scanner;

public class prueba {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		System.out.println("Kanye West");

		int patata = 69;
		System.out.println(patata);

		int num1 = 45;
		int num2 = 33;
		int resultado = num1 + num2;

		System.out.println(resultado);

		Scanner paco = new Scanner(System.in);

		String nombre = paco.nextLine();
		System.out.println("Hola " + nombre);

		System.out.println("Dame dos numeros");
		int numero1 = paco.nextInt();
		int numero2 = paco.nextInt();
		int total = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + total);

		paco.close();
	}
}

/*
 * VARIABLES
 * 
 * tipo nombre = valor; int num1 = 13; String palabra = "Frase de texto"; char
 * un_caracter = 'a'; <-- Un solo caracter y entre comillas simples (') double
 * numeroDecimal = 56.4; <-- Similar a float float numeroDecimalF = 56.5F; <--
 * Similar a double boolean ciertoFalso = true;
 * 
 */