package introduccion;
import java.util.Scanner;

public class EjercicioString6plus {
	public static void main(String[] args) {
		
	}
	public static String pedirPalabra() {
		Scanner scan=new scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		return scan.nextLine();
	}

	public static boolean esPrefijoDesde(String prefijo,String s,int por) {
		for (int i=0;i<prefijo.length();i++) {
			if (prefijo.charAt(i)!=s.charAt(pos + i)) {
				return false;
			}
			
		}
		return true;	
	}
	
	
}
