package tema5_ej12;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EmpleadoPrimable extends Empleado{
    //VALORES
    private boolean primado;
    
    
    public EmpleadoPrimable(String n, double s) {
        super(n, s);
        this.primado=false;
    };
    
    //SETTERS
    public void primar(){
        this.primado=true;
    };
    
    //GETTERS
    public boolean esPrimado(){
        return this.primado;
    };
    
}
