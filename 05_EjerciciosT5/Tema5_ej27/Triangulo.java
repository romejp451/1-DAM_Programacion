package tema5_ej27;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Triangulo implements Apoyable{
    private Point[] vertices;
    
    public Triangulo (Point v1, Point v2, Point v3){
        vertices = new Point[3];
        this.vertices[0] = v1;
        this.vertices[1] = v2;
        this.vertices[2] = v3;
    }
    
    private double getLongitud(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) 
                + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public int getLongitudBase() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        int aux = (int) Math.round(lado1);
        return aux;
    }

    @Override
    public int getLongitudAltura() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        double lado2 = getLongitud(vertices[1], vertices[2]);
        double lado3 = getLongitud(vertices[2], vertices[0]);
        double semiperimetro = (lado1 + lado1 + lado2) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado1) * (semiperimetro - lado2));
        return (int)(2 * area / lado1);
    }

    @Override
    public double getArea() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        double lado2 = getLongitud(vertices[1], vertices[2]);
        double lado3 = getLongitud(vertices[2], vertices[0]);
        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        return area;
    }

    @Override
    public int getPerimetro() {
        double lado1 = getLongitud(vertices[0], vertices[1]);
        double lado2 = getLongitud(vertices[1], vertices[2]);
        double lado3 = getLongitud(vertices[2], vertices[0]);
        double perimetro = lado1 + lado2 + lado3;
        return (int) perimetro;
    }

    @Override
    public void dibujar(Graphics g) {
        g.create();
    }

    @Override
    public Color getColor() {
        return this.getColor();
    }
}
