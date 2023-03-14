package tema5_ej10;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class AdivinanzaIncorrectaException extends AdivinanzaException{
    public AdivinanzaIncorrectaException(){
        super("La Respuesta no es Correcta");
    }
}
