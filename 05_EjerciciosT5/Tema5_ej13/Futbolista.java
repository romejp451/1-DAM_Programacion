package tema5_ej12;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Futbolista extends EmpleadoPrimable{
    
    //VALORES
    private int dorsal;
    
    //CONSTRUCTOR
    public Futbolista(String n, double s, int d) {
        super(n, s);
        this.dorsal=d;
    }
    
}
