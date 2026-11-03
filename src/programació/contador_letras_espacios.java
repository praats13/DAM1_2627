package programació;

import java.util.Scanner;

public class contador_letras_espacios {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = scan.nextLine();
		int letras = 0;
		int espacios = 0;

		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);

			if (caracter != ' ') {
				letras++;
			}
			if (caracter == ' ') {
				espacios++;
			}
		}
		System.out.println("La frase tiene " + letras + " letras y " + espacios + " espacios");

		scan.close();
	}

}
