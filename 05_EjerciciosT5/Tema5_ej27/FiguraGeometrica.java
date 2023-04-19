package tema5_ej27;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public interface FiguraGeometrica extends Coloreable{
    public double getArea();
    public int getPerimetro();
    public void dibujar (Graphics g);
    default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorizquierda){
        double area = this.getArea();
        double lado = Math.sqrt(area);
        return new Cuadrado (esquinaSuperiorizquierda, (int)lado, Color.BLACK);
    }
}
