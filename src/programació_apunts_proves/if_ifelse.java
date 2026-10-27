package programació_apunts_proves;
import java.util.Scanner;

public class if_ifelse {
	public static void main(String[] args) {
		/*
		 * Scanner numeros = new Scanner(System.in);
		 * 
		 * System.out.println("Introduce tu edad:"); int edad = numeros.nextInt();
		 * 
		 * if (edad >= 18) { System.out.println("Eres mayor de edad"); } else {
		 * System.out.println("Eres menor de edad"); }
		 * 
		 * numeros.close();
		 */

		Scanner palabras = new Scanner(System.in);
		String contrac = "asdf";

		System.out.println("introduce la contraseña");
		String contra = palabras.nextLine();

		if (contra.equals(contrac)) { // .equals(variable) sirve para comprovar que el valor de dos variables
										// (Strings) sean el mismo
			System.out.println("Contraseña correcta");
		} else {
			System.out.println("Contraseña incorrecta");
		}

		palabras.close();

	}
}

/*
 * CONDICIONALES
 * 
 * < Menor que > Mayor que == Igual que != No igual que ! Negación
 * 
 * 
 */
