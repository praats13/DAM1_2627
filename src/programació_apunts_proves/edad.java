/*
 * Programa que te pida Edad en años y Nombre y al final imprima "Te llamas X y tienes Z años
 */
package programació_apunts_proves;


import java.util.Scanner;

public class edad {
	public static void main(String[] args) {

		Scanner scan_edad = new Scanner(System.in);
		Scanner scan_nombre = new Scanner(System.in);

		System.out.println("Dime cuantos años tienes");
		int edad = scan_edad.nextInt();

		System.out.println("Dime como te llamas");
		String nombre = scan_nombre.nextLine();

		System.out.println("Tienes " + edad + " años y te llamas " + nombre);

		scan_edad.close();
		scan_nombre.close();

	}
}

/*
 * Hay que poner dos scanner ya que el enter cuenta como caracter (\n) y lo coge
 * automaticamente el segundo scan.
 */