
public class Foto {
		  int ancho; 
		  int alto; 
		  boolean vertical; 
		  double tamanio;
		  public Foto(int ancho, int alto, boolean vertical, double tamanio) {
			    
			    // 1. Validar que el ancho y el alto sean válidos
			    if (ancho <= 0 || alto <= 0) {
			        throw new IllegalArgumentException("El ancho y el alto deben ser mayores a 0.");
			    }
			    
			    // 2. Validar que el tamaño en MB sea positivo
			    if (tamanio <= 0) {
			        throw new IllegalArgumentException("El tamaño de la foto debe ser mayor a 0.");
			    }
			    
			    // 3. Validar la coherencia de la variable 'vertical'
			    // Si el alto es mayor que el ancho, 'vertical' obligatoriamente tiene que ser true.
			    // Si no se cumple esa lógica, hay una contradicción y el objeto nace roto.
			    if (alto > ancho && !vertical) {
			        throw new IllegalArgumentException("La foto es más alta que ancha, por lo tanto vertical debe ser true.");
			    }
			    
			    if (alto <= ancho && vertical) {
			        throw new IllegalArgumentException("La foto no es más alta que ancha, por lo tanto vertical no puede ser true.");
			    }

			    // Si pasa todas las aduanas, guardamos los datos
			    this.ancho = ancho;
			    this.alto = alto;
			    this.vertical = vertical;
			    this.tamanio = tamanio;
			}
}
