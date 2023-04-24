package efectos.clases;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EfectoInverso extends EfectoEspecial implements Simetrico{

    EfectoInverso() {
        super("EfectoInverso");
        efectos.add(this);
    }

    @Override
    public String aplicarEfecto(String frase) {
        StringBuilder sb1 = new StringBuilder(frase);
        String frase_reves = sb1.reverse().toString();
        return frase_reves;
    }
    
}
