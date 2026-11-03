package programació_apunts_proves;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// tipo nombre = valor;
		int numero = 1;

		// tipo[] nombre = new int[tamaño];
		System.out.println("Dame un tamaño de array");
		int[] listaNumeros = new int[scan.nextInt()];
		String[] listaPalabras = new String[10];

		// String.length() / array.length
		int longitud = listaNumeros.length;

		System.out.println("logitud " + longitud);

		// String.charAt(i) / array[i]

		listaNumeros[0] = 7;
		listaNumeros[1] = 13;
		listaNumeros[2] = 15;
		listaNumeros[3] = 154;
		listaNumeros[4] = 999999;

		listaNumeros[4]++;
		listaNumeros[3] = listaNumeros[3] * 2 + listaNumeros[0];

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println(listaNumeros[i]);
		}
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Dame un numero");
			listaNumeros[i] = scan.nextInt();
		}
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println(listaNumeros[i]);
		}

	}

}
