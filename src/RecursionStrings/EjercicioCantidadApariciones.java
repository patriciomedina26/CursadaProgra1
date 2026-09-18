package RecursionStrings;

import java.util.Scanner;

public class EjercicioCantidadApariciones {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		char letraElegida=pedirLetra();
	System.out.println(cantidadApariciones(palabraElegida,letraElegida));	
	}
	
	public static int cantidadApariciones(String a,char b) {
		if (a.length()==0) {
			return 0;
		}
		if (a.charAt(0)==b) {
			return 1+cantidadApariciones(resto(a),b);
		} else {
			return cantidadApariciones(resto(a),b);
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
		System.out.println("Ingrese su palabra");
		return scan.nextLine();
	}
	
	public static char pedirLetra() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su letra");
		return scan.nextLine().charAt(0);
	}
}
