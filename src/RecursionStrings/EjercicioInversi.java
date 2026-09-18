package RecursionStrings;

public class EjercicioInversi {

	public static void main(String[] args) {
		System.out.println(inverso("ayalp al ne oxes"));
	}
	
	public static String inverso(String a) {
		if (a.length()==0) {
			return "";
		}
		return inverso(resto(a))+a.charAt(0);
	}

	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}
}
