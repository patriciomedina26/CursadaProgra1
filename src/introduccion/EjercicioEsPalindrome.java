package introduccion;

import java.util.Scanner;

public class EjercicioEsPalindrome {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();


	}
	
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}

}
