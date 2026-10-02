package Objetos;

import java.awt.Point;

public class EjercicioPuntoMedio {

	public static void main(String[] args) {
	Point a=new Point(4,8);
	Point b=new Point(12,16);
	System.out.println(puntoMedio(a,b));
	}

	public static Point puntoMedio(Point p1, Point p2) {
		int x=(p1.x+p2.x)/2;
		int y=(p1.y+p2.y)/2;
		Point medio=new Point(x,y);
		return medio;
	}
}
