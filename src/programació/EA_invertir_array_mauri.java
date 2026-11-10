package programació;

public class EA_invertir_array_mauri {

	public static void main(String[] args) {

		int[] listaN = { 1, 2, 3, 4, 5 };
		int[] listaReves = new int[listaN.length];

		for (int i = listaN.length - 1; i >= 0; i--) {
			int indiceReves = listaN.length - 1 - i;
			listaReves[indiceReves] = listaN[i];
		}
		for (int i = 0; i < listaReves.length; i++) {
			System.out.println(listaReves[i]);
		}
	}
}
