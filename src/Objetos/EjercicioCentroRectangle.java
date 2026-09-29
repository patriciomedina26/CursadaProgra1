package Objetos;

import java.awt.Point;
import java.awt.Rectangle;

public class EjercicioCentroRectangle {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(3,4,50,30);
		System.out.println(centro(r));

	}

	public static Point centro(Rectangle r) {
		int x=r.x+r.width/2;
		int y=r.y+r.height/2;
		Point c=new Point(x,y);
		return c;
	}
}
