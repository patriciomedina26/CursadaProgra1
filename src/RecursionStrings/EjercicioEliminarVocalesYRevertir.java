package RecursionStrings;

public class EjercicioEliminarVocalesYRevertir {

	public static void main(String[] args) {
		System.out.println(eliminaryrevertir("heladera"));
	}
	
	public static String eliminaryrevertir(String a) {
		if (a=="") {
			return "";
		}
		String vocales="aeiouAEIOU";
		if (vocales.indexOf(a.charAt(0))!=-1) {
			return eliminaryrevertir(resto(a));
		}
		return eliminaryrevertir(resto(a))+a.charAt(0);
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
