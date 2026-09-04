package introduccion;

import java.util.Scanner;

public class EjercicioEsPrefijoDesde {

	public static void main(String[] args) {
		String palabra1=pedirPalabra();
		String palabra2=pedirPalabra();
		int posision=pedirPosicion();
		boolean valor=esPrefijoDesde(palabra1,palabra2,posision);
		System.out.println(valor);

	}
	
	public static String pedirPalabra() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();
	}
	
	public static int pedirPosicion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese de donde arranaca la posision a contar: ");
		return scan.nextInt();
	}

	public static boolean esPrefijoDesde(String palabra,String prefijo,int pos) {
		if (pos<0||pos+prefijo.length()>palabra.length())
			return false;
		for (int i=0;i<prefijo.length();i++) {
			if (prefijo.charAt(i)!=palabra.charAt(i+pos))
				return false;
		}
		return true;
	}
}
