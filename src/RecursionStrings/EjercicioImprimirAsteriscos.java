package RecursionStrings;

public class EjercicioImprimirAsteriscos {

	public static void main(String[] args) {
	imprimirAsteriscos("heladera");
	}
	
	public static void imprimirAsteriscos(String a) {
		if (a.length()==0) {
			return;
		}
		if (a.length()==1) {
			System.out.print(a.charAt(0));
			return;
		}
		System.out.print(a.charAt(0)+"*");
		imprimirAsteriscos(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
