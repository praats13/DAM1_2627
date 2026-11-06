package programació;

import java.util.Scanner;

public class EA_invertir_array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero:");
			numeros[i] = scan.nextInt();
		}

		for (int i = 0; i < 5 / 2; i++) {
			int auxiliar = numeros[i];
			numeros[i] = numeros[4 - i];
			numeros[4 - i] = auxiliar;
		}

		System.out.println("Array invertido:");

		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}

		scan.close();
	}
}
