package introduccion;

import java.util.Scanner;

public class EjercicioDeDuodromos {

	public static void main(String[] args) {
		String palabraElegida=pedirPalabra();
		boolean valor=esDuodromo(palabraElegida);
		System.out.println(valor);

	}

	public static String pedirPalabra() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		return scan.nextLine();
	}
	
	public static boolean esDuodromo(String palabra) {
		if (palabra.length()%2!=0)
			return false;
		for (int i=0;i<palabra.length()-1;i+=2) {
			if (palabra.charAt(i)!=palabra.charAt(i+1))
				return false;
		}
		return true;
	}
}
