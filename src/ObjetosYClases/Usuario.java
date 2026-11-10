package ObjetosYClases;

public class Usuario {

		String nombre;
		double saldo;
		Reserva[] historial;
		
		public Usuario(String nombre, int capacidadMaxima) {
			this.nombre=nombre;
			this.saldo=0.0;
			this.historial=new Reserva[capacidadMaxima];
		}
		
		public void cargarSaldo(double monto) {
			this.saldo=this.saldo+monto;
		}
		
		public boolean registarReserva(Reserva nuevaReserva, double costo) {
			if (this.saldo>=costo) {
				for (int i=0;i<this.historial.length;i++) {
					if (this.historial[i]==null) {
						this.historial[i]=nuevaReserva;	
						this.saldo=this.saldo-costo;
						return true;
					}
				}
			}
			return false;
		}
		
		public int minutosTotales() {
			int total=0;
			for (int i=0;i<this.historial.length;i++) {
				if (this.historial[i]!=null) {
					total=total+this.historial[i].getDuracion();
				}
			}
			return total;
		}
}
