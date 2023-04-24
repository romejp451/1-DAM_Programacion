package efectos.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public abstract class EfectoEspecial {
    //VALORES
    public static List<EfectoEspecial> efectos;
    private String nombre;
    
    //METODOS
    public EfectoEspecial(String n){
        this.nombre = n;
        efectos = new ArrayList<EfectoEspecial>();
    };
    
    public String getNombre(){
        return this.nombre;
    }
    
    public abstract String aplicarEfecto(String frase);
}
