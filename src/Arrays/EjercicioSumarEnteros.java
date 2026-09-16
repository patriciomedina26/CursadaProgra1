package Arrays;

public class EjercicioSumarEnteros {

	public static void main(String[] args) {
		System.out.println(sumarEnteros(586));
	
	}

	public static int sumarEnteros(int a) {
		if (a<10) {
			return a;
		}
		return (a%10) + (sumarEnteros(a/10));
	}
}
