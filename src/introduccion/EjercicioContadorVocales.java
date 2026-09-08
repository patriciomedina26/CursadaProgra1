package introduccion;

import java.util.Scanner;

public class EjercicioContadorVocales {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		int cantidadVocales=contarVocales(palabraElegida);
		System.out.println(cantidadVocales);

	}

	public static String pedirPalabra() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}
	
	public static int contarVocales(String palabra) {
		String vocales="aeiouAEIOU";
		int contador=0;
		for (int i=0;i<palabra.length();i++) {
			if (vocales.indexOf(palabra.charAt(i))!=-1)
					contador++;
		}
		return contador;
	}
}
