package programació;

import java.util.Random;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		Random random = new Random();
		int upperbound = 5;
		int resultado_ia;

		Scanner scan = new Scanner(System.in);

		String respuestaj1 = "";
		String respuestaj2 = "";
		String seguir_jugando = "si";
		String modo_de_juego = "";

		// ELEGIR MODO DE JUEGO
		System.out.println("==================================\n");
		System.out.println("Bienvenido a PPTLS\n");
		System.out.println("Elige el modo de juego\n");
		System.out.println("MODO JUGADOR CONTRA JUGADOR (1)");
		System.out.println("MODO JUGADOR CONTRA IA (2)\n");
		System.out.println("==================================\n");

		modo_de_juego = scan.nextLine();

		while (!modo_de_juego.equals("1") && !modo_de_juego.equals("2")) {
			System.out.println("Introduce un modo de juego válido (1-2):");
			modo_de_juego = scan.nextLine();
		}

		while (seguir_jugando.equals("si")) {

			// MODO JUGADOR CONTRA JUGADOR
			if (modo_de_juego.equals("1")) {

				seguir_jugando = "si";

				while (seguir_jugando.equals("si")) {

					System.out.println("==================================\n");
					System.out.println("Jugador 1 - Introduce tu tirada\n");
					System.out.println("Piedra (0)");
					System.out.println("Papel (1)");
					System.out.println("Tijera (2)");
					System.out.println("Lagarto (3)");
					System.out.println("Spock (4)\n");
					System.out.println("==================================");

					respuestaj1 = scan.nextLine();

					while (!respuestaj1.equals("0") && !respuestaj1.equals("1") && !respuestaj1.equals("2")
							&& !respuestaj1.equals("3") && !respuestaj1.equals("4")) {

						System.out.println("Tirada no permitida. Introduce una tirada válida (0-4):");
						respuestaj1 = scan.nextLine();
					}

					System.out.println("==================================\n");
					System.out.println("Jugador 2 - Introduce tu tirada\n");
					System.out.println("Piedra (0)");
					System.out.println("Papel (1)");
					System.out.println("Tijera (2)");
					System.out.println("Lagarto (3)");
					System.out.println("Spock (4)\n");
					System.out.println("==================================");

					respuestaj2 = scan.nextLine();

					while (!respuestaj2.equals("0") && !respuestaj2.equals("1") && !respuestaj2.equals("2")
							&& !respuestaj2.equals("3") && !respuestaj2.equals("4")) {

						System.out.println("Tirada no permitida. Introduce una tirada válida (0-4):");
						respuestaj2 = scan.nextLine();
					}

					// COMPROBACIÓN RESULTADOS
					if ((respuestaj1.equals("0") && (respuestaj2.equals("3") || respuestaj2.equals("2")))
							|| (respuestaj1.equals("1") && (respuestaj2.equals("0") || respuestaj2.equals("4")))
							|| (respuestaj1.equals("2") && (respuestaj2.equals("1") || respuestaj2.equals("3")))
							|| (respuestaj1.equals("3") && (respuestaj2.equals("4") || respuestaj2.equals("1")))
							|| (respuestaj1.equals("4") && (respuestaj2.equals("0") || respuestaj2.equals("2")))) {

						System.out.println("==================================\n");
						System.out.println("Jugador 1 ha ganado\n");

					} else if (respuestaj1.equals(respuestaj2)) {

						System.out.println("==================================\n");
						System.out.println("Empate\n");

					} else {

						System.out.println("==================================\n");
						System.out.println("Jugador 2 ha ganado\n");
					}

					System.out.println("Quieres seguir jugando?\n");
					System.out.println("Si");
					System.out.println("No\n");
					System.out.println("==================================");

					seguir_jugando = scan.nextLine().toLowerCase();

					while (!seguir_jugando.equals("si") && !seguir_jugando.equals("no")) {

						System.out.println("Introduce una respuesta válida (si/no):");
						seguir_jugando = scan.nextLine().toLowerCase();
					}
				}

				// CAMBIAR MODO
				System.out.println("==================================\n");
				System.out.println("Quieres cambiar de modo de juego?\n");
				System.out.println("Si");
				System.out.println("No\n");
				System.out.println("==================================");

				seguir_jugando = scan.nextLine().toLowerCase();

				while (!seguir_jugando.equals("si") && !seguir_jugando.equals("no")) {

					System.out.println("Introduce una respuesta válida (si/no):");
					seguir_jugando = scan.nextLine().toLowerCase();
				}

				if (seguir_jugando.equals("si")) {

					System.out.println("==================================\n");
					System.out.println("Elige el modo de juego\n");
					System.out.println("MODO JUGADOR CONTRA JUGADOR (1)");
					System.out.println("MODO JUGADOR CONTRA IA (2)\n");
					System.out.println("==================================");

					modo_de_juego = scan.nextLine();

					while (!modo_de_juego.equals("1") && !modo_de_juego.equals("2")) {

						System.out.println("Introduce un modo de juego válido (1-2):");
						modo_de_juego = scan.nextLine();
					}

					seguir_jugando = "si";

				} else {
					seguir_jugando = "no";
				}
			}

			// MODO JUGADOR CONTRA IA
			else if (modo_de_juego.equals("2")) {

				seguir_jugando = "si";

				while (seguir_jugando.equals("si")) {

					resultado_ia = random.nextInt(upperbound);

					System.out.println("==================================\n");
					System.out.println("Jugador 1 - Introduce tu tirada\n");
					System.out.println("Piedra (0)");
					System.out.println("Papel (1)");
					System.out.println("Tijera (2)");
					System.out.println("Lagarto (3)");
					System.out.println("Spock (4)\n");
					System.out.println("==================================");

					respuestaj1 = scan.nextLine();

					while (!respuestaj1.equals("0") && !respuestaj1.equals("1") && !respuestaj1.equals("2")
							&& !respuestaj1.equals("3") && !respuestaj1.equals("4")) {

						System.out.println("Tirada no permitida. Introduce una tirada válida (0-4):");
						respuestaj1 = scan.nextLine();
					}

					// COMPROBACIÓN RESULTADOS
					if ((respuestaj1.equals("0") && (resultado_ia == 3 || resultado_ia == 2))
							|| (respuestaj1.equals("1") && (resultado_ia == 0 || resultado_ia == 4))
							|| (respuestaj1.equals("2") && (resultado_ia == 1 || resultado_ia == 3))
							|| (respuestaj1.equals("3") && (resultado_ia == 4 || resultado_ia == 1))
							|| (respuestaj1.equals("4") && (resultado_ia == 0 || resultado_ia == 2))) {

						System.out.println("==================================\n");
						System.out.println("Jugador 1 ha ganado\n");

					} else if (respuestaj1.equals(String.valueOf(resultado_ia))) {

						System.out.println("==================================\n");
						System.out.println("Empate\n");

					} else {

						System.out.println("==================================\n");
						System.out.println("IA ha ganado\n");
					}

					if (resultado_ia == 0) {
						System.out.println("La IA ha tirado: Piedra\n");
					} else if (resultado_ia == 1) {
						System.out.println("La IA ha tirado: Papel\n");
					} else if (resultado_ia == 2) {
						System.out.println("La IA ha tirado: Tijera\n");
					} else if (resultado_ia == 3) {
						System.out.println("La IA ha tirado: Lagarto\n");
					} else if (resultado_ia == 4) {
						System.out.println("La IA ha tirado: Spock\n");
					}

					System.out.println("Quieres seguir jugando?\n");
					System.out.println("Si");
					System.out.println("No\n");
					System.out.println("==================================");

					seguir_jugando = scan.nextLine().toLowerCase();

					while (!seguir_jugando.equals("si") && !seguir_jugando.equals("no")) {

						System.out.println("Introduce una respuesta válida (si/no):");
						seguir_jugando = scan.nextLine().toLowerCase();
					}
				}

				// CAMBIAR MODO
				System.out.println("==================================\n");
				System.out.println("Quieres cambiar de modo de juego?\n");
				System.out.println("Si");
				System.out.println("No\n");
				System.out.println("==================================");

				seguir_jugando = scan.nextLine().toLowerCase();

				while (!seguir_jugando.equals("si") && !seguir_jugando.equals("no")) {

					System.out.println("Introduce una respuesta válida (si/no):");
					seguir_jugando = scan.nextLine().toLowerCase();
				}

				if (seguir_jugando.equals("si")) {

					System.out.println("==================================\n");
					System.out.println("Elige el modo de juego\n");
					System.out.println("MODO JUGADOR CONTRA JUGADOR (1)");
					System.out.println("MODO JUGADOR CONTRA IA (2)\n");
					System.out.println("==================================");

					modo_de_juego = scan.nextLine();

					while (!modo_de_juego.equals("1") && !modo_de_juego.equals("2")) {

						System.out.println("Introduce un modo de juego válido (1-2):");
						modo_de_juego = scan.nextLine();
					}

					seguir_jugando = "si";

				} else {
					seguir_jugando = "no";
				}
			}
		}

		System.out.println("==================================\n\n");
		System.out.println("Hasta la próxima!\n\n");
		System.out.println("==================================");

		scan.close();
	}
}