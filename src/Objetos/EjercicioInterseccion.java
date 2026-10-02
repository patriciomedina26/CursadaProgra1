package Objetos;

import java.awt.Rectangle;

public class EjercicioInterseccion {

	public static void main(String[] args) {

	}
	
	public static Rectangle interseccion(Rectangle a, Rectangle b) {
        // 1. Verificamos si hay un "hueco de aire" entre ambos (no se tocan)
        if (a.x + a.width < b.x || a.x > b.x + b.width || 
            a.y + a.height < b.y || a.y > b.y + b.height) {
            return null;
        }

        // 2. Calculamos el punto de origen (superior izquierdo) del área en común.
        // Buscamos la pared que esté más "hacia adentro" (los máximos)
        int interX;
        if (a.x > b.x) {
            interX = a.x;
        } else {
            interX = b.x;
        }

        int interY;
        if (a.y > b.y) {
            interY = a.y;
        } else {
            interY = b.y;
        }

        // 3. Calculamos hasta dónde llega la zona de cruce (los mínimos)
        int maxX;
        if (a.x + a.width < b.x + b.width) {
            maxX = a.x + a.width;
        } else {
            maxX = b.x + b.width;
        }

        int maxY;
        if (a.y + a.height < b.y + b.height) {
            maxY = a.y + a.height;
        } else {
            maxY = b.y + b.height;
        }

        // 4. Convertimos los límites finales en magnitud (ancho y alto)
        int anchoTotal = maxX - interX;
        int altoTotal = maxY - interY;

        // 5. Devolvemos el rectángulo gris correspondiente al cruce
        return new Rectangle(interX, interY, anchoTotal, altoTotal);
    }
}
