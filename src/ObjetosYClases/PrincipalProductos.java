package ObjetosYClases;

public class PrincipalProductos {

	public static void main(String[] args) {
		Producto coca=new Producto("coca",100,100);
		Producto pepsi=new Producto("pepsi",80,80);
		Producto manaos=new Producto("manaos",40,40);
		Producto fanta=new Producto("fanta",60,60);
		
		System.out.println(coca.esMasCaroQue(fanta));
		
		coca.aplicarDescuento(50);
		System.out.println(coca.precio);
		
		Producto[] inventario={coca,pepsi,manaos,fanta};
		Producto Barato=Producto.masBarato(inventario);
		System.out.println(Barato.nombre);
		
	}

}
