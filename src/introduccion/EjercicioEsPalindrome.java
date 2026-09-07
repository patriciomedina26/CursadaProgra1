package introduccion;

import java.util.Scanner;

public class EjercicioEsPalindrome {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		boolean valor=esPalindromo(palabraElegida);
		System.out.println(valor);


	}
	
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}

	public static boolean esPalindromo(String palabra) {
		for (int i=0;i<palabra.length()/2;i++) {
			if (palabra.charAt(i)==palabra.charAt(palabra.length()-1-i))
				return true;
		}
		return false;
	}
}
