package programació;

import java.util.Scanner;

public class EA_encontrar_num_máximo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaNumeros = new int[5];

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce un número entero:");
			listaNumeros[i] = scan.nextInt();
		}

	}

}
