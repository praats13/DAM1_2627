package programació;

import java.util.Scanner;

public class motocicletas {

	public static void main(String[] args) {

		Scanner marca = new Scanner(System.in);
		Scanner precio = new Scanner(System.in);

		String m = "";
		Double p = 0.0;

		Double descuento_h = 5.0;
		Double descuento_y = 8.0;
		Double descuento_s = 10.0;
		Double descuento_o = 2.0;

		System.out.println("Introduce la marca de la moto");
		m = marca.nextLine();

		System.out.println("Introduce el precio de la moto");
		p = precio.nextDouble();

		m = m.toLowerCase();

		if (m.equals("honda")) {
			double precio_f = p * (descuento_h / 100);
			System.out.println("El precio de tu moto " + m + " es de " + p + "€ y con el descuento del " + descuento_h
					+ "% se queda en " + (p - precio_f) + "€");
		} else if (m.equals("yamaha")) {
			double precio_f = p * (descuento_y / 100);
			System.out.println("El precio de tu moto " + m + " es de " + p + "€ y con el descuento del " + descuento_y
					+ "% se queda en " + (p - precio_f) + "€");
		} else if (m.equals("suzuki")) {
			double precio_f = p * (descuento_s / 100);
			System.out.println("El precio de tu moto " + m + " es de " + p + "€ y con el descuento del " + descuento_s
					+ "% se queda en " + (p - precio_f) + "€");
		} else {
			double precio_f = p * (descuento_o / 100);
			System.out.println("El precio de tu moto " + m + " es de " + p + "€ y con el descuento del " + descuento_o
					+ "% se queda en " + (p - precio_f) + "€");
		}

		marca.close();
		precio.close();
	}

}
