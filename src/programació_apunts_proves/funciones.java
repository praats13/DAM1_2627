package programació_apunts_proves;

public class funciones {

	public static void main(String[] args) {

		int[] tablero = { 1, 2, 3, 4, 5 };

		imprimirTabla(tablero);
		System.out.println();
		tablero[0] = 30;
		imprimirTabla(tablero);

		String palabra = "Marc";
		int numero = 19;

		System.out.println();
		decirHola(palabra, numero);
	}

	// public/private static tipo nombre_funcion (parametros) {
	// **CODE**
	// }
	public static void imprimirTabla(int[] tabla) {

		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}
	}

	public static void decirHola(String nombre, int años) {
		System.out.println("Hola " + nombre);
		System.out.println("Tienes " + años + " años");
	}
}
