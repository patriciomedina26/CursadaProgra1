package introduccion;

import java.util.Scanner;

public class EjercicioEsSubStringDos {

	public static void main(String[] args) {
		String palabrauno=pedirPalabra();
		String palabrados=pedirPalabra();
		boolean valor=esSubString(palabrauno,palabrados);
		System.out.println(valor);

	}

	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}
	
	public static boolean esSubString(String palabrauno, String palabrados) {
		if (palabrauno.length()>palabrados.length())
			return false;
		for (int pos=0;pos<=palabrados.length()-palabrauno.length();pos++) {
			int contadorCoincidencias=0;
					for (int i=0;i<palabrauno.length();i++) {
						if (palabrauno.charAt(i)==palabrados.charAt(pos+i)) {
							contadorCoincidencias++;	
						}
					}
					if (contadorCoincidencias==palabrauno.length())
						return true;
		}
		return false;
	}
}
