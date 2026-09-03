package introduccion;

import java.util.Scanner;

public class EjercicioSoloE {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		boolean valorFinal=soloE(palabraElegida);
		if (valorFinal==true) {
			System.out.println("La palabra esta compuesta de solo e o E");
		} else {
			System.out.println("La palabra no esta compuesta de solo e o E");
			}
	}
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();
	}

	public static boolean soloE(String palabra) {
		int contador=0;
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)=='e' || palabra.charAt(i)=='E') {
			contador++;
			}
			if (contador==palabra.length()) {
				return true;
			}
		}
		return false;
	}
}
