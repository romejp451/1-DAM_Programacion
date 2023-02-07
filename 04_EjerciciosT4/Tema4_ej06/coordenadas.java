package clases06;
import java.awt.Toolkit;
import java.lang.Math;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class coordenadas {
    private int x;
    private int y;
    
    public coordenadas (){
        x=0;
        y=0;
    };
    
    public coordenadas (int x1, int y1){
        if (Toolkit.getDefaultToolkit().getScreenSize().getHeight()>y1) {
            
            y =(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            x =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }
        else{
            if (Toolkit.getDefaultToolkit().getScreenSize().getWidth()>x1) {
            
                y =(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
                x =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            }
            else{
                x=x1;
                y=y1;
            }
        }
    };
    
    public coordenadas (coordenadas punto){
        punto.x = punto.x/2;
        punto.y = punto.y/2;
    };
    
    public coordenadas (double angulo, double distancia){
        x = (int) (distancia*Math.cos(angulo));
        y = (int) (distancia*Math.sin(angulo));
    };
    
    //GETTERS
    public int getCoordenadaX(){
        return x;
    };
    public int getCoordenadaY(){
        return y;
    };
}
