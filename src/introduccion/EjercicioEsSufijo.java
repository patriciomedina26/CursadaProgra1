package introduccion;

import java.util.Scanner;

public class EjercicioEsSufijo {

	public static void main(String[] args) {
		String palabrauno=pedirPalabra();
		String palabrados=pedirPalabra();
		boolean valor=esSufijo(palabrauno,palabrados);
		System.out.println(valor);
	}
	
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}

	public static boolean esSufijo(String palabrauno, String palabrados) {
		if (palabrauno.length()>palabrados.length())
			return false;
		int inicio=palabrados.length()-palabrauno.length();
			for (int i=0;i<palabrauno.length();i++) {
				if (palabrauno.charAt(i)!=palabrados.charAt(inicio + i ))
					return false;
			}
			return true;
	}
}
