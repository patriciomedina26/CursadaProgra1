package ObjetosYClases;

public class Producto {
	String nombre;
	double precio;
	int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}
	
	public boolean esMasCaroQue(Producto otro) {
		return this.precio>otro.precio;
	}
	
	public void aplicarDescuento(double porcentaje) {
		this.precio=this.precio*(1-porcentaje/100);
	}
	
	public static Producto masBarato(Producto[] inventario) {
		Producto barato=inventario[0];
		for (int i=1;i<inventario.length;i++) {
			if (inventario[i].precio<barato.precio) {
				barato=inventario[i];
			}
		}
		return barato;
	}
	
	
	
}

