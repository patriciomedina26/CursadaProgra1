package introduccion;

import java.util.Scanner;

public class EjercicioString3 {

	public static void main(String[] args) {
	String palabraElegida=pedirPalabra();
	boolean duodromo=esDuodromo(palabraElegida);
		if (duodromo==true)
		System.out.println("La palabra es duodromo");
		else
		System.out.print("La palabra no es duodromo");
	}
	public static String pedirPalabra() {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Ingrese una palabra: ");
	    return scan.nextLine();
	 }
	public static boolean esDuodromo(String palabra) {
		if (palabra.length()%2!=0) {
			return false;
		}
		for (int i=0;i<palabra.length();i+=2) {
			if (palabra.charAt(i)!=palabra.charAt(i+1)) {
			return false;
			}
		}
		return true;
}
}