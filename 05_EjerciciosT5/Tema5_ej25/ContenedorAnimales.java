package daw.zoo;
import  daw.zoo.Animal;
import java.util.*;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public abstract class ContenedorAnimales {
    //VALORES
    protected Set <Animal> animales;
    
    //CONSTRUCTOR

    public ContenedorAnimales() {
        this.animales = new HashSet<Animal>();
    }
    
    public boolean añadir(Animal a){
        if (this.comprobarDisponibilidadPlaza(a) == true) {
            this.animales.add(a);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean retirar(Animal a){
        if (this.animales.contains(a)) {
            this.animales.remove(a);
            return true;
        }else{
            return false;
        }
    }
    
    public int getPesoActual(){
        int aux = 0;
        for (Animal animal : animales) {
            int peso = animal.getPeso();
            aux += peso;
        }
        return aux;
    }
    
    public int getNumeroAnimales(){
        return animales.size();
    }
    
    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);
}
