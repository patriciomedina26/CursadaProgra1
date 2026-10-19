
public class EjercicioBasicoFecha {

	public static void main(String[] args) {
	Fecha f1=new Fecha();
	System.out.print("Fecha por defecto: ");
	f1.imprimir();
	
	int dias=Fecha.diaDelMes(12,2000);
	System.out.println(dias);
	
	Fecha f2=new Fecha(30,2,2000);
	Fecha f3=new Fecha(28,2,2024);
	System.out.println(f2.esValida());
	System.out.println(f3.esValida());
	
	f3.avanzarDia();
	f3.imprimir();
	f3.avanzarDia();
	f3.imprimir();
	}
}
