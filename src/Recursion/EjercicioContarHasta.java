package Recursion;

public class EjercicioContarHasta {

	public static void main(String[] args) {
		contarHasta(5);
		System.out.println(contarHasta(19));
	}

	public static int contarHasta(int n) {
		if (n==0) {
			return 0;
		}
		return n+contarHasta(n-1);
	}
}
