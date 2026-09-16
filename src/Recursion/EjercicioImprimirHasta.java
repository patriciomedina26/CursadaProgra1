package Recursion;

public class EjercicioImprimirHasta {

	public static void main(String[] args) {
		imprimirHastaD(5);
	}
	
	public static void imprimirHasta(int a) {
		if (a==0) {
		return;
		}
		imprimirHasta(a-1);
		System.out.println(a);
	}
	
	public static void imprimirHastaD(int a) {
		if (a==0) {
			System.out.println(0);
			return;
		}
		System.out.println(a);
		imprimirHastaD(a-1);
	}

}
