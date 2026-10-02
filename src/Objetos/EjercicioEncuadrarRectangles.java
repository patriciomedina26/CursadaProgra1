package Objetos;

import java.awt.Rectangle;

public class EjercicioEncuadrarRectangles {

	public static void main(String[] args) {
		Rectangle a= new Rectangle (3,4,100,30);
		Rectangle b= new Rectangle (6,2,51,240);
		
		System.out.println(encuadrar(a,b));
	}
	
	public static Rectangle encuadrar(Rectangle a, Rectangle b) {
		int minx;
		if (a.x<b.x) {
			minx=a.x;
		} else {
			minx=b.x;
		}
		int miny;
		if (a.y<b.y) {
			miny=a.y;
		} else {
			miny=b.y;
		}
		int maxw;
		if (a.x+a.width>b.x+b.width) {
			maxw=a.x+a.width;
		} else {
			maxw=b.x+b.width;
		}
		int maxh;
		if (a.y+a.height>b.y+b.height) {
			maxh=a.y+a.height;
		} else {
			maxh=b.y+b.height;
		}
		int anchoTotal=maxw-minx;
		int altoTotal=maxh-miny;
		Rectangle c=new Rectangle(minx,miny,anchoTotal,altoTotal);
		return c;
	}

}
