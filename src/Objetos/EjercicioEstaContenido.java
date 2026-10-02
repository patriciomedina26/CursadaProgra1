package Objetos;

import java.awt.Rectangle;

public class EjercicioEstaContenido {

	public static void main(String[] args) {
		Rectangle a= new Rectangle (3,4,100,30);
		Rectangle b= new Rectangle (6,2,51,240);
		
		System.out.println(estaContenido(a,b));
	}
	
	public static boolean estaContenido(Rectangle a, Rectangle b) {
		if (a.x<b.x) {
			return false;
		}
		if (a.y<b.y) {
			return false;
		}
		if (a.x+a.width>b.x+b.width) {
			return false;
		}
		if (a.y+a.height>b.y+b.height) {
			return false;
		} else {
			return true;
		}
	}

}
