package programació;

import java.util.Scanner;

public class contador_vocales {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = scan.nextLine();
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);

			if (caracter == 'a') {
				contador++;
			} else if (caracter == 'e') {
				contador++;
			} else if (caracter == 'i') {
				contador++;
			} else if (caracter == 'o') {
				contador++;
			} else if (caracter == 'u') {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " vocales en la frase");

		scan.close();
	}

}
