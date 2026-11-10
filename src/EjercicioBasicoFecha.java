
public class EjercicioBasicoFecha {

	public static void main(String[] args) {
	Fecha f1=new Fecha();
	System.out.print("Fecha por defecto: ");
	f1.imprimir();
	
	int dias=Fecha.diaDelMes(12,2000);
	System.out.println(dias);
	
	Fecha f2=new Fecha(9,9,1999);
	Fecha f3=new Fecha(19,1,2000);
	System.out.println(f2.esValida());
	System.out.println(f3.esValida());
	
	System.out.println(f3.diaDelAño());
	
	System.out.println(f2.diasDeDiferenciaCon(f3));
	
	f2.agregarDias(2);
	f2.imprimir();
	f3.avanzarDia();
	f3.imprimir();
	f3.avanzarDia();
	f3.imprimir();
	
	System.out.println(f3.antesQue(f2));
	
	System.out.println(f3.diaDelAño());
	
	}
}
