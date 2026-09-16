package Recursion;

public class EjercicioSumaDesdeUnoHasta {

	public static void main(String[] args) {
		System.out.println(sumaDesdeUnoHasta(3));
		
	}

	public static int sumaDesdeUnoHasta(int a) {
		if (a==0) {
			return a;
		}
		return a+sumaDesdeUnoHasta(a-1);
	}
}
