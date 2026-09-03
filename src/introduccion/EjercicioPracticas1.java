package introduccion;

import java.util.Scanner;

public class EjercicioPracticas1 {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		int cantidadVocales=contadorVocales(palabraElegida);
		System.out.println("La palabra " + palabraElegida + " tiene " + cantidadVocales + " vocales.");
	}
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
		}
	public static int contadorVocales(String palabra) {
		int contador = 0;
		String vocales="AEIOUaeiou";
		for (int i=0;i<palabra.length();i++) {
			if (vocales.indexOf(palabra.charAt(i))!=-1)
				contador++;
		}
		return contador;
	}
}
