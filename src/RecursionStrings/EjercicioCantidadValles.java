package RecursionStrings;

public class EjercicioCantidadValles {

	public static void main(String[] args) {
		System.out.println(cantidadValles("pollolll"));
	}
	
	public static int cantidadValles(String a) {
		if (a.length()<2) {
			return 0;
		}
		if (a.charAt(0)==a.charAt(1)) {
			if (a.length()>2 && a.charAt(0)==a.charAt(2)) {
				return cantidadValles(resto(a));
			} else {
				return 1+cantidadValles(resto(a));
			}
		}
		if (a.charAt(0)!=a.charAt(1)) {
			return cantidadValles(resto(a));
		}
		return cantidadValles(resto(a));

	}
	
	public static String resto(String a) {
		String nuevo="";
		for (int i=1;i<a.length();i++) {
			nuevo=nuevo+a.charAt(i);
		}
		return nuevo;
	}

}
