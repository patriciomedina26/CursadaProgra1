package Recursion;

public class EjercicioCantidadPrimosEntre {

	public static void main(String[] args) {
		System.out.println(esPrimo(7));
		System.out.println(cantidadPrimosEntre(1,3));
	}
	
	public static int cantidadPrimosEntre(int a,int b) {
		if (b==a) {
			if (esPrimo(a)) {
				return 1;
			}
			return 0;
		}
		if (esPrimo(b)==true) {
			return 1+cantidadPrimosEntre(a,b-1);
		} else {
		return cantidadPrimosEntre(a,b-1);
		}
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
