package programació_apunts_proves;

import java.util.Scanner;

public class arrays_ejemplo {

	public static void main(String[] args) {

		Scanner scanN = new Scanner(System.in);
		Scanner scanL = new Scanner(System.in);

		int tamaño = 0;
		int posicion = 0;

		System.out.println("Cuantos nombres quieres?");
		tamaño = scanN.nextInt();

		String[] listaNombres = new String[tamaño];

		for (int i = 0; i < listaNombres.length; i++) {
			System.out.println("Dame un nombre:");
			listaNombres[i] = scanL.nextLine();
		}
		System.out.println("Dame una posición:");
		posicion = scanN.nextInt();

		while (posicion >= listaNombres.length || posicion < 0) {
			System.out.println("Posición inválida, dame otra:");
			posicion = scanN.nextInt();
		}
		System.out.println("El nombre en la posición " + posicion + " es: " + listaNombres[posicion]);
		scanN.close();
		scanL.close();
	}

}
