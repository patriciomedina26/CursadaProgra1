package introduccion;

import java.util.Scanner;

public class EjercicioEsPrefijo {

	public static void main(String[] args) {
		String palabra1=pedirPalabra();
		String palabra2=pedirPalabra();
		boolean valor=esPrefijo(palabra1,palabra2);
		System.out.println(valor);

	}
	
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();	
	}
	
	public static boolean esPrefijo(String palabra, String prefijo) {
		if (prefijo.length()>palabra.length())
			return false;
		if (prefijo.length()==palabra.length())
			return true;
		for (int i=0;i<prefijo.length();i++) {
			if (prefijo.charAt(i)!=palabra.charAt(i))
				return false;
		}
		return true;
	}

}
