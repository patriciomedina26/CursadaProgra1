package Recursion;

public class EjercicioBasicoRecursion {

	public static void main(String[] args) {
		suma(50);
		System.out.println(suma(3));
		System.out.println(multiplicar(10,3));

	}
	
	public static int suma(int n) {
		if (n==1) {
			return 1;
		}
		return n + suma(n-1);
	}

	public static int multiplicar(int n, int m) {
		if (m==0) {
			return 0;
		}
		return n + multiplicar(n,m-1);
	}
	
	
}
