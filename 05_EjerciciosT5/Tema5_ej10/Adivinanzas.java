package tema5_ej10;
import java.time.Duration;
import tema5_ej10.AdivinanzaException;
import java.time.Instant;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Adivinanzas {
    //VALORES
    private final String enunciado;
    private final String respuestaCorrecta;
    private Instant inicio;
    
    //CONSTRUCTOR
    Adivinanzas(String e, String rc){
        this.enunciado=e;
        this.respuestaCorrecta= rc;
    };
    
    //GETTERS
    public String getEnunciado(){
        this.inicio = Instant.now();
        return this.enunciado;
    };
    
    public void comprobar(String respuesta) throws AdivinanzaIncorrectaException,TiempoSuperadoException{
        Instant inicio2 = Instant.now();
        
        Duration tiempo = Duration.between(inicio, inicio2);
        if(tiempo.getSeconds() >= 30){
            throw new TiempoSuperadoException();
        }else{
            if(!respuesta.equals(this.respuestaCorrecta)){
                throw new AdivinanzaIncorrectaException();
            }else{
                System.out.println("Correcto");
            }
        }
    
    }
}
