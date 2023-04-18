package daw.zoo;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tigre extends Animal{
    //CONSTRUCTOR
    public Tigre(String nombre, int peso) {
        super(nombre, peso);
    }
    
    
    @Override
    public void emitirSonido() {
        String aux = "El tigre hace grr";
    }
    
    @Override
    public String toString() {
        return "Tigre: " + super.toString();
    }
}
