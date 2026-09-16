package Arrays;

public class EjercicioPotencia {

	public static void main(String[] args) {
		System.out.println(potencia(4,3));
	}
	
	public static int potencia(int a, int b) {
		if (b==0) {
			return 1;
		}
		return a*potencia(a,b-1);
	}

}
