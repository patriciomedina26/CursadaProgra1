package Recursion;

public class EjercicioEsPar {

	public static void main(String[] args) {
		System.out.println(esPar(459));
	}
	
	public static boolean esPar(int a) {
		if (a==0) {
			return true;
		}
		if (a==1) {
			return false;
		}
		return esPar(a-2);
	}
	
}

