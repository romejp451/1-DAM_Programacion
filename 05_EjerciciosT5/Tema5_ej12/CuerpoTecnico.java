package tema5_ej11;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class CuerpoTecnico extends Empleado{
    
    //VALORES
    private String puesto;
    
    //CONSTRUCTOR
    public CuerpoTecnico(String n, double s, String p) {
        super(n, s);
        this.puesto=p;
    }
    
    //GETTERS
    public String getPuesto(){
        return this.puesto;
    };
    
}
