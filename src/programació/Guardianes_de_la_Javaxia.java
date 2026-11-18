package programació;

public class Guardianes_de_la_Javaxia {

	public static void main(String[] args) {

		int[][] matriz = new int[3][4];

		// Star-Lord
		matriz[0][0] = 85;
		matriz[0][1] = 90;
		matriz[0][2] = 78;
		matriz[0][3] = 92;

		// Gamora
		matriz[1][0] = 95;
		matriz[1][1] = 88;
		matriz[1][2] = 91;
		matriz[1][3] = 87;

		// Rocket
		matriz[2][0] = 70;
		matriz[2][1] = 85;
		matriz[2][2] = 80;
		matriz[2][3] = 88;

		int cambio = 1;
		int grande = matriz[0][0];
		int fila = 0;
		int mision = 0;
		int puntuacion = 0;
		String guardian = "";

		System.out.println("=== TABLA DE PUNTUACIONES ===");

		for (int i = 0; i < matriz.length; i++) {
			if (cambio == 1) {
				System.out.print("Star-Lord: ");
				cambio++;
			} else if (cambio == 2) {
				System.out.print("Gamora:    ");
				cambio++;
			} else if (cambio == 3) {
				System.out.print("Rocket:    ");
			}
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("");

		System.out.println("=== PUNTUACIONES TOTALES ===");
		System.out.println("Star-Lord: " + (matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3]) + " puntos");
		System.out.println("Gamora: " + (matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3]) + " puntos");
		System.out.println("Rocket: " + (matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3]) + " puntos\n");

		System.out.println("=== PUNTUACIÓN MÁS ALTA ===");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (grande < matriz[i][j]) {
					grande = matriz[i][j];
					mision = j;
					fila = i;
				}
				if (matriz[i][j] >= 90) {
					puntuacion++;
				}
			}
		}
		if (fila == 0) {
			guardian = "Star-Lord (fila 0)";
		} else if (fila == 0) {
			guardian = "Gamora (fila 1)";
		} else if (fila == 0) {
			guardian = "Rocket (fila 3)";
		}
		System.out.println("Mejor puntuación: " + grande + " puntos");
		System.out.println("Guardian: " + guardian);
		System.out.println("Misión: " + mision + "\n");
		System.out.println("=== PUNTUACIONES PERFECTAS (>= 90) ===");
		System.out.println("Total puntuaciones perfectas" + puntuacion);
	}

}
