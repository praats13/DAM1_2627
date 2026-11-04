package programació;

import java.util.Scanner;

public class EA_sumas_elementos_arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaNumeros = new int[5];
		int resultado = 0;

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce un número entero:");
			listaNumeros[i] = scan.nextInt();
			resultado = resultado + listaNumeros[i];
		}
		System.out.println("La suma de los números introducidos es: " + resultado);

		scan.close();
	}

}
