package introduccion;

import java.util.Scanner;

public class Ejercicio2PalabrasIguales {

	public static void main(String[] args) {
		String palabra1=pedirPalabra();
		String palabra2=pedirPalabra();
		boolean valor=sonIguales(palabra1,palabra2);
		System.out.println(valor);
	}

	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();
	}
	
	public static boolean sonIguales(String palabra1,String palabra2) {
		if (palabra1.length()!=palabra2.length())
			return false;
		for (int i=0;i<palabra1.length();i++) {
			if (palabra1.charAt(i)!=palabra2.charAt(i))
				return false;
			}
			return true;
	}
	
}
