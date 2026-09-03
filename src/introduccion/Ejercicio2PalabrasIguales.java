package introduccion;

import java.util.Scanner;

public class Ejercicio2PalabrasIguales {

	public static void main(String[] args) {
		String palabra1=pedirPalabra();
		String palabra2=pedirPalabra();
		System.out.println(palabra1);
		System.out.println(palabra2);
	}

	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();
	}
}
