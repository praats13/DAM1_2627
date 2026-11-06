package programació;

import java.util.Scanner;

public class EA_ordenar_array_descendente {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] numeros = new int[5];

		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1 - i; j++) {
				if (numeros[j] < numeros[j + 1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}

		System.out.println("Array ordenado de mayor a menor:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
