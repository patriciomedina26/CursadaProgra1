package introduccion;

import java.util.Scanner;

public class EjercicioReemplazarLetra {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		char vieja=pedirPalabra().charAt(0);
		char nueva=pedirPalabra().charAt(0);
		String nuevaPalabra=reemplazarLetra(palabraElegida,vieja,nueva);
		System.out.println(nuevaPalabra);
	
	}
	
	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}
	
	public static String reemplazarLetra(String palabra,char vieja, char nueva) {
		String nuevo="";
		for (int i=0;i<palabra.length();i++) {
			if (palabra.charAt(i)==vieja)
			nuevo+=nueva;
		 else {
			nuevo+=palabra.charAt(i);
		}
		}
		return nuevo;
	}
}