package programació_apunts_proves;

public class matrices {

	public static void main(String[] args) {
		
		//tipo[] nombre = new tipo[tamaño];
		int[] lista = new int[5];
		
		//tipo[][] nombre = new tipo[filas][solumnas]
		int[][] matriz1 = new int[2][3];
		int[][] matriz2 = new int[4][4];
		int[][] matriz3 = { {1,2,3},
							{4,5,6},
							{7,8,9} };
		
		for (int filas = 0; filas < matriz3.length; filas++) {
			for (int columnas = 0; columnas < matriz3[filas].length; columnas++) {
				System.out.print(matriz3[filas][columnas]+" ");
			}
			System.out.println(" ");
		
		}
	}


}