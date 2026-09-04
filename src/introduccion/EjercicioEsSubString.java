package introduccion;

import java.util.Scanner;

public class EjercicioEsSubString {

	public static void main(String[] args) {
		String palabra1=pedirPalabra();
		String palabra2=pedirPalabra();
		boolean valor=esSubString(palabra1,palabra2);
		System.out.println(valor);
	}

	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();
	}
	
	public static boolean esSubString(String palabrauno,String palabrados) {
		if (palabrauno.length()<palabrados.length())
			return false;
		for (int i=0;i<palabrauno.length();i++) {
			if (palabrados.indexOf(i)!=palabrauno.charAt(i))
				return false;
			
		}
		return true;
	}
}
