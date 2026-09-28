package Objetos;

import java.awt.*;

public class PointBasico {

	public static void main(String[] args) {
	Point p1=new Point(0,0);
	Point p2=new Point(3,4);
	System.out.println(distancia(p1,p2));
	}
	
	public static double distancia(Point p1, Point p2) {
		int dx = p2.x - p1.x;
		int dy = p2.y - p1.y;
		
		int dxCuadrado = dx*dx;
		int dyCuadrado = dy*dy;
		return Math.sqrt(dxCuadrado + dyCuadrado);
	}

}
