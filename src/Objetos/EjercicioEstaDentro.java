package Objetos;

import java.awt.Point;
import java.awt.Rectangle;

public class EjercicioEstaDentro {

	public static void main(String[] args) {
	Rectangle r=new Rectangle(3,4,50,30);
	Point p=new Point(10,10);
	System.out.println(estaDentro(p,r));
	}
	
	public static boolean estaDentro(Point p, Rectangle r) {
		if (p.x<0) {
			return false;
		}
		if (p.x>=r.x && p.y>=r.y && p.x<=r.x+r.width && p.y<=r.y+r.height) {
			return true;
		}
		return false;
	}

}
