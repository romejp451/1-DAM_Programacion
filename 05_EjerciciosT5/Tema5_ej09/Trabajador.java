package tema5_ej09;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Trabajador {
    //VALORES
    private final String nombre;
    protected double sueldo;
    private final String dni;
    
    //CONSTRUCTOR
    public Trabajador(String nombre, int s, int ndni, char ldni){
        this.nombre = nombre;
        this.sueldo= s;
        this.dni = Integer.toString(ndni)+ldni;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public String getDni(){
        return this.dni;
    }
}
