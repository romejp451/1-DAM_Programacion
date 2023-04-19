package tema5_ej27;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Circulo implements FiguraGeometrica, Centrable{
    private Point centro;
    private int radio;
    private Color color;

    public Circulo(Point centro, int radio, Color color) {
        this.centro = centro;
        this.radio = radio;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public int getPerimetro() {
        return (int) Math.round(2*Math.PI* this.radio);
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
        return this.centro;
    }
    
    
}
