package RecursionStrings;

public class EjercicioProdCifras {

	public static void main(String[] args) {
		System.out.println(prodCifras(218));
	}
	
	public static int prodCifras(int a) {
		if (a==0) {
			return 1;
		}
		int ultimaCifra=a%10;
		if (ultimaCifra==0) {
			return prodCifras(a/10);
		} else {
			return ultimaCifra*prodCifras(a/10);
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
