package tema5_ej27;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Cuadrado extends Rectangulo{
    //VALORES
    private int logitudLado;
    
    //CONSTRUCTOR
    public Cuadrado(Point esi, int longitudLado, Color c) {
        super(esi, new Point(esi.x + longitudLado, esi.y + longitudLado), c);
    }   
}
