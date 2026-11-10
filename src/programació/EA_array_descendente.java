package programació;

public class EA_array_descendente {

	public static void main(String[] args) {

		int[] listaDesordenada = { 3, 1, 5, 4, 2 };
		int[] listaOrdenada = new int[listaDesordenada.length];

		int grande = 0;
		int posGrande = 0;

		for (int i = 0; i < listaOrdenada.length; i++) {
			for (int j = 0; j < listaDesordenada.length; j++) {
				if (grande < listaDesordenada[j]) {
					grande = listaDesordenada[j];
					posGrande = j;
				}
			}
			listaOrdenada[i] = grande;
			listaDesordenada[posGrande] = 0;
			grande = 0;
			posGrande = 0;
			System.out.println(listaOrdenada[i]);
		}
	}

}
