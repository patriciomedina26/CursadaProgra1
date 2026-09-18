package RecursionStrings;

public class EjercicioLongitud {

	public static void main(String[] args) {
	System.out.println(longitud("heladera"));
	}
	
	public static int longitud(String a) {
		if (a=="") {
			return 0;
		}
		return 1+longitud(resto(a));
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
