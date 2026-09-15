package Arrays;

public class EjercicioMultiplicarPorSumas {

	public static void main(String[] args) {
	System.out.println(multiplicarS(4,3));
	}

	public static int multiplicarS(int a, int b) {
		if (a==0) {
		}
		return a + multiplicarS(a,b-1);
		
	}
}
