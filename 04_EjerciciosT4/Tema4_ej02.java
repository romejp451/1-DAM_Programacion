package pruebasclases;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Caja {
    private boolean abierto;
    private String mensaje;
    
    //CONSTRUCTORES
    Caja(String m){
        abierto=false;
        mensaje=m;
    };
    
    Caja(boolean a, String m){
        abierto =a;
        mensaje=m;
    };
    
    Caja(){
        abierto=false;
        mensaje= "Viva el tema 7";
    };
    
    //GETTERS
    public boolean cajaAbierta(){
        return abierto;
    };
    public String mensajeCaja(){
        return mensaje;
    };
}
