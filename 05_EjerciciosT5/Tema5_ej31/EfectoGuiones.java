package efectos.clases;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EfectoGuiones extends EfectoEspecial{

    EfectoGuiones() {
        super("EfectoGuiones");
        efectos.add(this);
    }

    @Override
    public String aplicarEfecto(String frase) {
        String frase_guiones = frase.replace( " ", "_");
        return frase_guiones;
    }
    
}
