package tema5_ej09;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Programador extends TrabajadorTecleante{
    //VALORES
    private Map<String,String> lenguajes  = new HashMap<>();
    
    //CONSTRUCTOR

    public Programador(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
    }
    
    
    //SETTERS
    public void aprenderLenguaje(String nombreLenguaje, String codigoFuente){
        this.lenguajes.put(nombreLenguaje, codigoFuente);
    }
    
    //GETTERS
    public String programarHolaMundo(String lenguaje) throws IllegalStateException{
        IllegalStateException e= new IllegalStateException("Legunaje no reconocido");
        if (!this.lenguajes.containsKey(lenguaje)) {
            throw e;
        }else{
            return this.lenguajes.get(lenguaje);
        }
    };
}
