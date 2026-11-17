package programació;

import java.util.Scanner;

public class Actividad4_TresEnJava {

	public static void main(String[] args) {

		String[][] tablero = new String[3][3];
		String J1 = "X";
		String J2 = "O";
		int fila = 0;
		int columna = 0;
		Scanner scan_l = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		int turno = 1;

		for (int z = 0; z < 9; z++) {
			System.out.println("Introduce una fila (0-2):");
			fila = scan_n.nextInt();

			System.out.println("Introduce una columna (0-2)");
			columna = scan_n.nextInt();

			while (!tablero[fila][columna].equals(" ")) {
				System.out.println("Posición ocupada, dale de nuevo:");
				System.out.println("Introduce una fila (0-2):");
				fila = scan_n.nextInt();

				System.out.println("Introduce una columna (0-2)");
				columna = scan_n.nextInt();
			}

			tablero[fila][columna] = J1;

			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[i].length; j++) {
					System.out.print(tablero[i][j] + " ");
				}
				System.out.println();
			}
			if (tablero[0][0].equals(tablero[0][1]) && tablero[0][0].equals(tablero[0][2])) {
				System.out.println("Ganador");
			} else if (tablero[1][0].equals(tablero[1][1]) && tablero[1][0].equals(tablero[1][2])) {
				System.out.println("Ganador");
			}
		}
	}

}
