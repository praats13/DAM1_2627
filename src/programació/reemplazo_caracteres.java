package programació;

import java.util.Scanner;

public class reemplazo_caracteres {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce una frase");
		String frase = scan.nextLine();

		System.out.println("Qué carácter quieres reemplazar?");
		String carac1 = scan.nextLine();

		System.out.println("Por cuál?");
		String carac2 = scan.nextLine();

		System.out.println(frase.replace(carac1, carac2));
		scan.close();
	}

}
