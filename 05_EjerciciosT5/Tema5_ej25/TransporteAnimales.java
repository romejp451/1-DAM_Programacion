package daw.zoo;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class TransporteAnimales extends Jaula{
    public TransporteAnimales() {
        super(6, 500);
    }

    @Override
    public boolean comprobarDisponibilidadPlaza(Animal a) {
        int numLeon = 0;
        int numTigre = 0;
        this.animales.add(a);
        for (Animal leon : this.animales) {
            if (leon instanceof Leon) {
                numLeon+=1;
            }else{
                numTigre+=1;
        }
        if (numLeon <= 6 && numTigre == 0) {
            this.animales.remove(a);
            return true;
        }else{
            if (numTigre <= 6 && numLeon == 0) {
                this.animales.remove(a);
                return true;
            }else{
                this.animales.remove(a);
                return false;
            }
        }
    }
    
    
}
