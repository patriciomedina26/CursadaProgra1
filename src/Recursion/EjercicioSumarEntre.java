package Recursion;

public class EjercicioSumarEntre {

	public static void main(String[] args) {
		System.out.println(sumarEntre(2,89));
	}

	public static int sumarEntre(int a, int b) {
		if (b==a) {
			return a; 
		}
		return b+sumarEntre(a,b-1);
	}
}
