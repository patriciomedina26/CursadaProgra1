package introduccion;

import java.util.Scanner;

public class EjercicioString6 {

	public static void main(String[] args) {
		String prefijo = pedirPalabra();
		String palabra = pedirPalabra();
		boolean resultado = esSubstring(prefijo, palabra);
		if (resultado) {
		    System.out.println("Si es substring");
		} else {
		    System.out.println("No es substring");
		}

	}
	public static boolean esSubstring(String s1, String s2) {
	    for (int i = 0; i <= s2.length() - s1.length(); i++) {
	        if (esPrefijoDesde(s1, s2, i)) {
	            return true;
	        }
	    }
	    return false;
	}
    public static boolean esPrefijoDesde(String prefijo, String s, int pos) {
    	for (int i=0;i<prefijo.length();i++) {
    		if (prefijo.charAt(i)!= s.charAt(pos + i)) {
    			return false;
    			
    		}
    	}
    	return true;
    }
    public static String pedirPalabra() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        return scan.nextLine();
    }
}
