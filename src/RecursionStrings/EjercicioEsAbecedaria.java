package RecursionStrings;

public class EjercicioEsAbecedaria {

	public static void main(String[] args) {
		System.out.println(esAbecedaria("aadios"));
	}
	
	public static boolean esAbecedaria(String a) {
		if (a.length()<=1) {
			return true;
		}
		if (a.charAt(0)>a.charAt(1)) {
			return false;
		}
			return esAbecedaria(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
