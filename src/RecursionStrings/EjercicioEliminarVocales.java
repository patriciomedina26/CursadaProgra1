package RecursionStrings;

public class EjercicioEliminarVocales {

	public static void main(String[] args) {

		System.out.println(eliminarVocales2("heladera"));
	}
	
	public static String eliminarVocales(String a) {
		if (a=="") {
			return "";
		}
		if (a.charAt(0)=='a' || a.charAt(0)=='e'|| a.charAt(0)=='i' ||a.charAt(0)=='o'|| a.charAt(0)=='u') {
		return eliminarVocales(resto(a));
		}
		return a.charAt(0)+eliminarVocales(resto(a));
	}
	
	public static String eliminarVocales2(String a) {
		if (a=="") {
			return "";
		}
		String vocales="aeiouAEIOU";
		if (vocales.indexOf(a.charAt(0))!=-1) {
			return eliminarVocales2(resto(a));
		}
		return a.charAt(0)+eliminarVocales2(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
			}
		return nuevo;
	}

}
