package tema5_ej15;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class GeneradorContraseñasUnicas extends GeneradorContraseñas{
    //VALORES
    Set<String> contraseñasGeneradas;
    
    //CONSTRUCTOR
    GeneradorContraseñasUnicas(){
        this.contraseñasGeneradas = new HashSet<>();
    };
    
    GeneradorContraseñasUnicas(Random r){
        super(r);
        this.contraseñasGeneradas = new HashSet<>();
    };
    
    //GETTERS
    @Override
    public String generarContraseña(int longitud){
        String aux;
        do{
            aux = super.generarContraseña(longitud);
        }while(!this.contraseñasGeneradas.contains(aux));
        this.contraseñasGeneradas.add(aux);
        return aux;
    };
    
    @Override
    public String generarContraseña() {
        return generarContraseña(12);
    }
}
