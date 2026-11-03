package programació;

import java.util.Scanner;

public class palabra_al_reves {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = scan.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {
			char caracter = frase.charAt(i);
			System.out.println(caracter);
		}
		scan.close();
	}

}
