package programació_apunts_proves;
import java.util.Scanner;

public class bucles {

	public static void main(String[] args) {

		/*
		 * int numero = 100;
		 * 
		 * while (numero > 0) { numero = numero - 1; System.out.println(numero); }
		 */

		/*
		Scanner scan = new Scanner(System.in);
		String contraseña = "Patata";
		String palabra = "";

		System.out.println("Dame la contraseña");
		palabra = scan.nextLine();

		while (!(palabra.equals(contraseña))) {
			System.out.println("Contraseña incorrecta, vuelve a introducirla:");
			palabra = scan.nextLine();
		}

		System.out.println("Contraseña correcta");

		scan.close();
		*/
		
		for(int numero = 0; numero < 100; numero++) {
			System.out.println(numero);
		}
		
	}

}
