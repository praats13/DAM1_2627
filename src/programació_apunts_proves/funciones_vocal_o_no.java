package programació_apunts_proves;

import java.util.Scanner;

public class funciones_vocal_o_no {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Dame tu nombre: ");
		String nombre = scan.nextLine();
		char inicial = nombre.toUpperCase().charAt(0);
		boolean vocal = false;

		comprobacion(inicial, vocal);

	}

	public static void comprobacion(char inicial, boolean vocal) {
		char[] vocales = { 'A', 'E', 'I', 'O', 'U' };

		for (int i = 0; i < vocales.length; i++) {
			if (inicial == vocales[i]) {
				vocal = true;
			}
		}
		if (vocal == true) {
			System.out.println("La primera letra de la palabra es vocal");
		} else {
			System.out.println("La primera letra de la palabra no es vocal");
		}
	}

}
