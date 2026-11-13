package programació;

import java.util.Scanner;

public class mover_posiciones_array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] listaN = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Dame un numero:");

		int mover = scan.nextInt();
		int temporal = 0;
		int temporal2 = 0;

		for (int i = 0; i < mover; i++) {
			for (int j = 0; j < listaN.length; j++) {
				temporal2 = listaN[j];
				listaN[j] = temporal;
				temporal = temporal2;
			}
			listaN[0] = temporal;
		}
		for (int i = 0; i < listaN.length; i++) {
			System.out.println("En la posición " + i + " esta " + listaN[i]);
		}
	}

}
