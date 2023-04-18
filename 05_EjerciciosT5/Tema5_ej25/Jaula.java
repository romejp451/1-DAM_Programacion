package daw.zoo;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Jaula extends ContenedorAnimales{
    //VALORES
    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm, int pm) {
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }
    
    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        if (this.getNumeroAnimales() > this.capacidadMaxima || 
                this.getPesoActual() > this.pesoMaximo) {
            return false;
        }else{
            return true;
        }
    }
    
}
