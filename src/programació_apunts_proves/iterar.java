package programació_apunts_proves;

import java.util.Scanner;

public class iterar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una o más palabras");
		String palabra = scan.nextLine();

		for (int i = 0; i < palabra.length(); i++) {

			palabra = palabra.toUpperCase();
			char letra = palabra.charAt(i);

			System.out.println(letra);
		}
		scan.close();
	}

}
