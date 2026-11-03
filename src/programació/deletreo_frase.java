package programació;

import java.util.Scanner;

public class deletreo_frase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = scan.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			System.out.println(caracter);
		}
		scan.close();
	}

}
