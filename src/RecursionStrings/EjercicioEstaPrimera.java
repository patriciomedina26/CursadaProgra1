package RecursionStrings;

public class EjercicioEstaPrimera {

	public static void main(String[] args) {
		System.out.println(estaPrimera("heladera","agua"));
	}
	
	public static String estaPrimera(String a, String b) {
		if (a=="") {
			return a;
		}
		if (b=="") {
			return b;
		}
		if (a.charAt(0)>b.charAt(0)) {
			return b;
		}
		if (a.charAt(0)<b.charAt(0)) {
			return a;
		}
		if (a.charAt(0)==b.charAt(0)) {
			return estaPrimera(resto(a),resto(b));
		}
		return "";
	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
