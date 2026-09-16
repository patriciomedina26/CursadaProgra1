package Recursion;

public class EjercicioSumaDeCuadrados {

	public static void main(String[] args) {

		System.out.println(sumaDeCuadrados(5));
	}
	
	public static int sumaDeCuadrados(int a) {
		if (a==0) {
			return 0;
		}
		return a*a+sumaDeCuadrados(a-1);
	}

}
