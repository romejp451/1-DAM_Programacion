package tema5_ej27;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Rectangulo implements Apoyable, Centrable{
    //ATRIBUTOS
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    //CONSTRUCTOR
    public Rectangulo(Point esi, Point eid, Color c) {
        this.esquinaSuperiorIzquierda = esi;
        this.esquinaInferiorDerecha = eid;
        this.color = c;
    }

    @Override
    public int getLongitudBase() {
        return this.getLongitudBase();
    }

    @Override
    public int getLongitudAltura() {
        return this.getLongitudAltura();
    }

    @Override
    public double getArea() {
        return this.getArea();
    }

    @Override
    public int getPerimetro() {
        return this.getPerimetro();
    }

    @Override
    public void dibujar(Graphics g) {
        g.create();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public Point getCentro() {
        int x = (int)(this.esquinaSuperiorIzquierda.getX() 
                + esquinaInferiorDerecha.getX()) / 2;
        int y = (int)(esquinaSuperiorIzquierda.getY() 
                + esquinaInferiorDerecha.getY()) / 2;
        return new Point(x, y);
    }
    
}
