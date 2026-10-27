package programació_apunts_proves;
import java.util.Scanner;

public class edad1 {
	public static void main(String[] args) {

		Scanner scan_edad = new Scanner(System.in);

		System.out.println("Dime cuantos años tienes");
		int edad = scan_edad.nextInt();

		if (edad < 18) {
			System.out.println("Eres un niño.");
		} else if (edad >= 18 && edad <= 55) {
			System.out.println("Eres adulto");
		} else if (edad > 55) {
			System.out.println("Eres viejo.");
		}

		scan_edad.close();

	}
}

// || = o
// && = y