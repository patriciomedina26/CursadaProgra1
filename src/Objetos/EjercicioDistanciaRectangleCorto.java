package Objetos;

import java.awt.Rectangle;

public class EjercicioDistanciaRectangleCorto {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(3,4,50,30);
		System.out.println(diagonal(r));
	}
	
	public static double diagonal(Rectangle r) {
		return Math.sqrt(r.width*r.width + r.height*r.height);
	}

}
