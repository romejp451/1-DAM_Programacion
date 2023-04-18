package daw.zoo;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Leon extends Animal{

    public Leon(String nombre, int peso) {
        super(nombre, peso);
    }
    
    @Override
        public void emitirSonido() {
            String aux = "El León hace roar";
    }
        
    @Override
    public String toString() {
        return "León: " + super.toString();
    }
}
