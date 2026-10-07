package Objetos;

import java.awt.Rectangle;

public class EjercicioCompletamenteAdentro {

	public static void main(String[] args) {

	}

	public static boolean estaContenidoF(Rectangle a, Rectangle b) {
		if (b.x>=a.x && b.x+b.width<=a.x+a.width && b.y>=a.y && b.y+b.height<=a.y+a.height) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean estaContenidoFU(Rectangle a, Rectangle b) {
		return b.x>=a.x && b.x+b.width<=a.x+a.width && b.y>=a.y && b.y+b.height<=a.y+a.height; 
	}
}