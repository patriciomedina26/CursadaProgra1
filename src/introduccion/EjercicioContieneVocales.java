package introduccion;

import java.util.Scanner;

public class EjercicioContieneVocales {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		boolean valor=contieneVocales(palabraElegida);
		System.out.println(valor);
	
	}
	
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}
	
	public static boolean contieneVocales(String palabra) {
		String vocales="aeiouAEIOU";
		for (int i=0;i<palabra.length();i++) {
			if (vocales.indexOf(palabra.charAt(i))!=-1)
			return true;
		}
		return false;
	}

}
