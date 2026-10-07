package Clases;

public class EjercicioFechaDiasDelMes {

	public static void main(String[] args) {
		Fecha hoy= new Fecha(7,10,2027);
		System.out.println(hoy.dia+"/"+hoy.mes+"/"+hoy.año);
	}
}

	class Fecha {
		int dia;
		int mes;
		int año;
	
		public Fecha(int a,int b, int c) {
			this.dia=a;
			this.mes=b;
			this.año=c;
		}
	}





