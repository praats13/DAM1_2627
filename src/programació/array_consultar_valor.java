package programació;

import java.util.Scanner;

public class array_consultar_valor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaN = { 1, 2, 3, 4, 5 };

		System.out.println("Dame una posición");
		int pos = scan.nextInt();

		while (pos < 0 || pos > listaN.length) {
			System.out.println("Posición incorrecta, introduce otra:");
			pos = scan.nextInt();
		}

		System.out.println("En la posicón " + pos + " hay: " + listaN[pos]);
	}

}
