package programació_apunts_proves;
import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {

		Scanner numeros = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		double n1 = numeros.nextDouble();

		System.out.println("Introduce el segundo numero");
		double n2 = numeros.nextDouble();

		double suma = n1 + n2;
		double resta = n1 - n2;
		double mult = n1 * n2;
		double div = n1 / n2;

		System.out.println("La suma de los numeros es " + suma + ", la resta es " + resta + ", la multiplicación es "
				+ mult + " y la división es " + div);

		numeros.close();

	}
}