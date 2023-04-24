package efectos.clases;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EfectoMayusculas extends EfectoEspecial{

    EfectoMayusculas() {
        super("EfectoMayuscula");
        efectos.add(this);
    }

    @Override
    public String aplicarEfecto(String frase) {
        String frase_mayuscula = frase.toUpperCase();
        return frase_mayuscula;
    }
    
}
