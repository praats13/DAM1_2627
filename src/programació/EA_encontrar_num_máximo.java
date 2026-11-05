package programació;

import java.util.Scanner;

public class EA_encontrar_num_máximo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaNumeros = new int[7];
		int maximo = 0;

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce un número entero:");
			listaNumeros[i] = scan.nextInt();

		}

		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > maximo) {
				maximo = listaNumeros[i];
			}
		}
		System.out.println("El número más grande es " + maximo);

		scan.close();
	}

}
