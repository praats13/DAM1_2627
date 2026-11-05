package programació;

import java.util.Scanner;

public class EA_contar_numeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaNumeros = new int[10];

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce un número entero:");
			listaNumeros[i] = scan.nextInt();
		}
	}

}
