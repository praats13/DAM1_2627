package programació;

import java.util.Scanner;
import java.util.Random;

public class Actividad2 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int upperbound = 26;
		int int_random = rand.nextInt(upperbound);

		int nivel = 0;
		int respuesta = 0;
		int intentos_restantes = 0;

		System.out.println("Introduce la dificultad del juego (1-3)");
		nivel = scan.nextInt();

		// System.out.println(int_random);

		if (nivel == 1) {
			intentos_restantes = 4;

			System.out.println("Nivel fácil seleccionado");
			System.out.println("Introduce un número (0-25)");
			respuesta = scan.nextInt();

			while (intentos_restantes > 0) {
				System.out.println("Intentos restantes: " + intentos_restantes);
				if (respuesta > int_random) {
					System.out.println("el número es mas pequeño que " + respuesta);
					respuesta = scan.nextInt();
					intentos_restantes--;
				} else if (respuesta < int_random) {
					System.out.println("el número es mas grande que " + respuesta);
					respuesta = scan.nextInt();
					intentos_restantes--;
				} else if (respuesta == int_random) {
					System.out.println("Felicidades, has ganado!");
					intentos_restantes = -1;
				}

			}

			if (intentos_restantes == 0) {
				System.out.println("Te has quedado sin intentos, has perdido");
			}
		}

		if (nivel == 2) {
			intentos_restantes = 3;

			System.out.println("Nivel fácil seleccionado");
			System.out.println("Introduce un número (0-25)");
			respuesta = scan.nextInt();

			while (intentos_restantes > 0) {
				System.out.println("Intentos restantes: " + intentos_restantes);
				if (respuesta > int_random) {
					System.out.println("el número es mas pequeño que " + respuesta);
					respuesta = scan.nextInt();
					intentos_restantes--;
				} else if (respuesta < int_random) {
					System.out.println("el número es mas grande que " + respuesta);
					respuesta = scan.nextInt();
					intentos_restantes--;
				} else if (respuesta == int_random) {
					System.out.println("Felicidades, has ganado!");
					intentos_restantes = -1;
				}

			}

			if (intentos_restantes == 0) {
				System.out.println("Te has quedado sin intentos, has perdido");
			}
		}

		if (nivel == 3) {
			intentos_restantes = 2;

			System.out.println("Nivel fácil seleccionado");
			System.out.println("Introduce un número (0-25)");
			respuesta = scan.nextInt();

			while (intentos_restantes > 0) {
				System.out.println("Intentos restantes: " + intentos_restantes);
				if (respuesta > int_random) {
					System.out.println("el número es mas pequeño que " + respuesta);
					respuesta = scan.nextInt();
					intentos_restantes--;
				} else if (respuesta < int_random) {
					System.out.println("el número es mas grande que " + respuesta);
					respuesta = scan.nextInt();
					intentos_restantes--;
				} else if (respuesta == int_random) {
					System.out.println("Felicidades, has ganado!");
					intentos_restantes = -1;
				}

			}

			if (intentos_restantes == 0) {
				System.out.println("Te has quedado sin intentos, has perdido");
			}
		}
		scan.close();
	}

}