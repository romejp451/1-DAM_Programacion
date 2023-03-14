package tema5_ej09;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class TrabajadorTecleante extends Trabajador{
    //VALORES
    private final int pulsacionesMinuto;
    
    public TrabajadorTecleante(String n, int s, int ndni, char ldni, int ppm){
        super(n,s,ndni,ldni);
        this.pulsacionesMinuto = ppm;
    }
    
    //SETTER

    public int getPulsacionesMinuto(){
        return this.pulsacionesMinuto;
    }
}
