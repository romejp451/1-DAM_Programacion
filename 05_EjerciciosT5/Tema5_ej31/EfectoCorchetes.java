package efectos.clases;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EfectoCorchetes extends EfectoEspecial{

    EfectoCorchetes() {
        super("EfectoCorchetes");
        efectos.add(this);
    }

    @Override
    public String aplicarEfecto(String frase) {
        if (!frase.startsWith("[") && !frase.endsWith("]")) {
            frase = "[" + frase + "]";
        }
        return frase;
    }
    
}
