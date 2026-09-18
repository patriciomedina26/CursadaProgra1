package RecursionStrings;

import java.util.Scanner;

public class EjercicioCompararStrings {

	public static void main(String[] args) {
		String palabraElegida1=pedirPalabra();
		String palabraElegida2=pedirPalabra();
	System.out.println(compararString(palabraElegida1,palabraElegida2));
	}

	public static String compararString(String a, String b) {
		if (a.equals("")) {
			return b;
		}
		if (b.equals("")) {
			return a;
		}
		if (a.charAt(0)<b.charAt(0)) {
			return a.charAt(0)+compararString(resto(a),resto(b));
		} else {
			return b.charAt(0)+compararString(resto(a),resto(b));
		}
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
	
	public static String pedirPalabra() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}
}
