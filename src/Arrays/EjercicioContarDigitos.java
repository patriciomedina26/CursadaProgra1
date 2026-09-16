package Arrays;

public class EjercicioContarDigitos {

	public static void main(String[] args) {
		System.out.println(contarDigitos(445616516));

	}
	public static int contarDigitos(int a) {
		if (a<10) {
			return 1;
		}
		return 1+(contarDigitos(a/10));
	}
}
