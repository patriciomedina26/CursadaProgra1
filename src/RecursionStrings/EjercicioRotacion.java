package RecursionStrings;

public class EjercicioRotacion {

	public static void main(String[] args) {
		System.out.println(rotacion("abcdefghi", 2));

	}

	public static String rotacion(String s, int n) {
	    if (n == 0 || s.isEmpty()) {
	        return s;
	    }
	    String unaRotacion = resto(s) + s.charAt(0);
	    return rotacion(unaRotacion, n - 1);
	}

	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
