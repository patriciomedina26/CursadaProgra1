package RecursionStrings;

public class EjercicioRepetirVocalesYConsonantes {

	public static void main(String[] args) {
		System.out.println(repetirLetras("cuando"));
	}
	
	public static String repetirLetras(String a) {
		if (a.length()<2) {
			return a;
		}
		String vocales="aeiouAEIOU";
		String consonantes="bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
		if (vocales.indexOf(a.charAt(0))!=-1 && vocales.indexOf(a.charAt(1))!=-1) {
			return a.charAt(0)+""+a.charAt(0)+repetirLetras(resto(a));
		}
		if (vocales.indexOf(a.charAt(0))!=-1 && consonantes.indexOf(a.charAt(1))!=-1) {
			return a.charAt(0)+repetirLetras(resto(a));
		}
		if (consonantes.indexOf(a.charAt(0))!=-1 && vocales.indexOf(a.charAt(1))!=-1) {
		return a.charAt(0)+repetirLetras(resto(a));
		}
		if (consonantes.indexOf(a.charAt(0))!=-1 && consonantes.indexOf(a.charAt(1))!=-1) {
			return a.charAt(0)+""+a.charAt(0)+""+a.charAt(0)+repetirLetras(resto(a));
		}
		return a.charAt(0)+repetirLetras(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
