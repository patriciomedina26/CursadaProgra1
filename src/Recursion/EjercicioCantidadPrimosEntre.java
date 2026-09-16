package Recursion;

public class EjercicioCantidadPrimosEntre {

	public static void main(String[] args) {
		System.out.println(esPrimo(7));

	}
	
	public static boolean esPrimo(int a) {
		if (a <= 1) {
	        return false;
	    }
		int contador=0;
		for (int i=1;i<=a;i++) {
				if (a%i==0) {
					contador++;
				}
				if (contador>2) {
					return false;
				}
		}
		return true;
	}

}
