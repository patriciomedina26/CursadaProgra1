package RecursionStrings;

public class EjercicioContieneCantidadDeChar {

	public static void main(String[] args) {
		System.out.println(contieneCantidadDeChar("loperamida",'a',2));

	}
	
	public static boolean contieneCantidadDeChar(String a, char b, int c) {
		if (c<=0) {
			return true;
		}
		if (a=="") {
			return false;
		}
		if (a.charAt(0)==b) {
			return contieneCantidadDeChar(resto(a),b,c-1);
		}
		return contieneCantidadDeChar(resto(a),b,c);
	}

	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
