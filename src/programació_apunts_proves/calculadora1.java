package programació_apunts_proves;
import java.util.Scanner;

public class calculadora1 {
	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);
		Scanner calc = new Scanner(System.in);

		System.out.println("introduce el primer número");
		double n1 = numeros.nextDouble();

		System.out.println("introduce el segundo número");
		double n2 = numeros.nextDouble();

		System.out.println("Introduce la operación");
		String operacion = calc.nextLine();

		if (operacion.equals("+")) {
			double suma = n1 + n2;
			System.out.println("La suma de " + n1 + " y " + n2 + " es " + suma);
		} else if (operacion.equals("-")) {
			double resta = n1 - n2;
			System.out.println("La resta de " + n1 + " y " + n2 + " es " + resta);
		} else if (operacion.equals("*")) {
			double multi = n1 * n2;
			System.out.println("La multiplicación de " + n1 + " y " + n2 + " es " + multi);
		} else if (operacion.equals("/")) {
			double div = n1 / n2;
			System.out.println("La división de " + n1 + " y " + n2 + " es " + div);
		} else {
			System.out.println("Error!!");
		}

		numeros.close();
		calc.close();
	}
}