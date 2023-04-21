package tema5_ej30;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
import tema5_ej27.*;
import tema5_ej27.FiguraGeometrica;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej30 {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        int s1;
        
        do{
            System.out.println("1. Añadir un rectangulo");
            System.out.println("2. Añadir un cuadrado");
            System.out.println("3. Añadir un circulo");
            System.out.println("4. Añadir un triangulo");
            System.out.println("5. Dibujar todo");
            s1 = new Scanner(System.in) . nextInt();
            switch(s1){
                case 1:
                    System.out.println("Dame las coordenadas de la "
                            + "esquinaSuperiorIzquierda (primero x y luego y)");
                    int esiRx = new Scanner (System.in). nextInt();
                    int esiRy = new Scanner (System.in). nextInt();
                    System.out.println("Dame las coordenadas de la "
                            + "esquinaInferiorDerecha (primero x y luego y)");
                    int eidRx = new Scanner (System.in). nextInt();
                    int eidRy = new Scanner (System.in). nextInt();
                    System.out.println("Dame el color en numeros");
                    String color = new Scanner (System.in). nextLine();
                    Point esiR = new Point(esiRx, esiRy);
                    Point eidR = new Point(eidRx, eidRy);
                    Color c1 = Color.decode("#"+color);
                    Rectangulo r1 = new Rectangulo(esiR, eidR, c1);
                    figuras.add(r1);
                break;
                
                case 2:
                    System.out.println("Dame las coordenadas de la "
                            + "esquinaSuperiorIzquierda (primero x y luego y)");
                    int esiCux= new Scanner (System.in). nextInt();
                    int esiCuy = new Scanner (System.in). nextInt();
                    System.out.println("Dame la longitud del lado");
                    int longitudLado = new Scanner (System.in). nextInt();
                    System.out.println("Dame el color en numeros");
                    String colorCu = new Scanner (System.in). nextLine();
                    Point esiCu = new Point(esiCux, esiCuy);
                    Color c2 = Color.decode("#"+colorCu);
                    Cuadrado cu1 = new Cuadrado(esiCu, longitudLado, c2);
                    figuras.add(cu1);
                break;
                
                case 3:
                    System.out.println("Dame las coordenadas 'x' primero y "
                            + "'y' despues del centro del circulo");
                    int centrox = new Scanner (System.in). nextInt();
                    int centroy = new Scanner (System.in). nextInt();
                    System.out.println("Dame el radio del circulo");
                    int radio = new Scanner (System.in). nextInt();
                    System.out.println("Dame el color en numeros");
                    String colorCi = new Scanner (System.in). nextLine();
                    Point centro = new Point(centrox, centroy);
                    Color c3 = Color.decode("#"+colorCi);
                    Circulo ci1 = new Circulo(centro, radio, c3);
                    figuras.add(ci1);
                break;
                
                case 4:
                    System.out.println("Dame las coordenadas 'x' primero y "
                            + "'y' despues del vertice1");
                    int v1x = new Scanner (System.in). nextInt();
                    int v1y = new Scanner (System.in). nextInt();
                    System.out.println("Dame las coordenadas 'x' primero y "
                            + "'y' despues del vertice2");
                    int v2x = new Scanner (System.in). nextInt();
                    int v2y = new Scanner (System.in). nextInt();
                    System.out.println("Dame las coordenadas 'x' primero y "
                            + "'y' despues del vertice3");
                    int v3x = new Scanner (System.in). nextInt();
                    int v3y = new Scanner (System.in). nextInt();
                    Point v1 = new Point(v1x, v1y);
                    Point v2 = new Point(v2x, v2y);
                    Point v3 = new Point(v3x, v3y);
                    Triangulo t1 = new Triangulo(v1, v2, v3);
                    figuras.add(t1);
                break;
                
                case 5:
                    System.out.println("Donde lo quieres dibujar? "
                            + "PDF o ConsolaDAW");
                    String lugar = new Scanner(System.in). nextLine();
                    for (int i = 0; i < figuras.size(); i++) {
                        try{
                            Thread.sleep(3000);
                        }catch(InterruptedException e){}
                        System.out.println("Dibujo numero "+(i+1)+ " terminado");
                    }
                    System.out.println("Dibujos terminados");
                    break;
            }
        }while(s1 <= 5 || s1 > 0);
        System.out.println("Programa terminado");
    }
}
