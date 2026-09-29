package Objetos;

import java.awt.Point;
import java.awt.Rectangle;

public class EjercicioDiagonalRectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(3,4,50,30);
		System.out.println(diagonal(r));
	}
	
	public static double diagonal(Rectangle r) {
		Point p1=new Point(r.x, r.y);
		Point p2= new Point(r.x + r.width, r.y + r.height);
		return distancia(p1,p2);
	}
	
	public static double distancia(Point p1, Point p2) {
		int dx=p2.x-p1.x;
		int dy=p2.y-p1.y;
		
		int dxCuadrado=dx*dx;
		int dyCuadrado=dy*dy;
		
		return Math.sqrt(dyCuadrado+dxCuadrado);
		
		
	}

}
