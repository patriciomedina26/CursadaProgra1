package RecursionStrings;

public class EjercicioContarA {

	public static void main(String[] args) {
	System.out.println(cantidadApariciones("priltenk 10 x 60 ninguna a aca",'a'));
	}
	
	public static int cantidadApariciones(String a, char b) {
		if (a.length()==0) {
			return 0;
		}
		if (a.charAt(0)==b) {
			return 1+cantidadApariciones(resto(a),b);
		} else {
			return cantidadApariciones(resto(a),b);
		}
		
	}
	
	public static String resto(String s) {
		String nuevo="";
		for (int i=1;i<s.length();i++) {
			nuevo=nuevo+s.charAt(i);
		}
		return nuevo;
	}

}
