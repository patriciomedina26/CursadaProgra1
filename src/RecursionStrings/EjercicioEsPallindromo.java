package RecursionStrings;

public class EjercicioEsPallindromo {

	public static void main(String[] args) {
		System.out.println(esPalindromo("agua"));
	}
	
	public static boolean esPalindromo(String a) {
		if (a.length()<=1) {
			return true;
		}
		if (a.charAt(0)!=a.charAt(a.length()-1)) {
			return false;
		}
		return esPalindromo(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length()-1;i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
