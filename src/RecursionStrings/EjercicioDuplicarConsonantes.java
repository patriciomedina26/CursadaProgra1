package RecursionStrings;

public class EjercicioDuplicarConsonantes {

	public static void main(String[] args) {
		System.out.println(duplicarConsonantes("heladera"));
	}
	
	public static String duplicarConsonantes(String a) {
		if (a=="") {
			return "";
		}
		String consonantes="bcdfghjklmnñpqrstvwxyz";
		if (consonantes.indexOf(a.charAt(0))!=-1) {
			return a.charAt(0)+""+a.charAt(0)+duplicarConsonantes(resto(a));
		}
		return a.charAt(0)+duplicarConsonantes(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}

