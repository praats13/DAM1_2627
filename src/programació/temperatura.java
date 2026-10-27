package programació;

import java.util.Scanner;

public class temperatura {
	public static void main(String[] args) {

		Scanner temperatura = new Scanner(System.in);
		double temp = 0;

		System.out.println("Introduce la temperatura en grados centígrados");
		temp = temperatura.nextDouble();

		if (temp < 15) {
			System.out.println("El clima es nublado.");
		} else if (temp >= 15 && temp < 30) {
			System.out.println("El clima es soleado");
		} else if (temp >= 30) {
			System.out.println("El clima es tropical.");
		}

		temperatura.close();

	}
}