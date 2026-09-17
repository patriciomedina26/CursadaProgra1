package Recursion;

public class EjercicioCantidadParesCuadradosEntre {

	public static void main(String[] args) {
		System.out.println(cantidadParesCuadradosEntre(0,200));
	}

	public static int cantidadParesCuadradosEntre(int a, int b) {
		if  (b==a) {
			if (esCuadradoPerfecto(a) && a%2==0) {
			return 1;
		}
			return 0;
		}
		if (esCuadradoPerfecto(b)==true) {
			if (b%2==0) {
				return 1+cantidadParesCuadradosEntre(a,b-1);
			}
		}
		return cantidadParesCuadradosEntre(a,b-1);
	}
	public static boolean esCuadradoPerfecto(int a) {
		if (a<0) {
			return false;
		}
		for (int i=0;i*i<=a;i++) {
		if (i*i==a) {
			return true;
		}
		}
		return false;
	}		
}
