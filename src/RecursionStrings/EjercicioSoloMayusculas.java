package RecursionStrings;

public class EjercicioSoloMayusculas {

	public static void main(String[] args) {
		System.out.println(soloMayuscula("ARRegloEGLO"));
	}
	
	public static String soloMayuscula(String a) {
		if (a=="") {
			return "";
		}
		String mayus="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		if (mayus.indexOf(a.charAt(0))!=-1) {
		return a.charAt(0)+soloMayuscula(resto(a));
		} else {
		return soloMayuscula(resto(a));
		}
	}

	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
