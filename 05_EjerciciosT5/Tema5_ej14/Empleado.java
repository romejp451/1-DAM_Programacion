package tema5_ej11;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Empleado implements Nombrable{
    //VALORES
    private String nombre;
    private double sueldo;
    private double dinero;
    
    //CONSTRUCTOR
    Empleado(String n, double s){
        this.nombre=n;
        this.sueldo=s;
        this.dinero=0;
    }
    
    //SETTERS
    public void cobrar(double cantidad)throws CabreoException{
        if (cantidad<this.sueldo) {
            CabreoException e = new CabreoException("Cabreado");
            throw e;
        }else{
            this.dinero += cantidad;
        }
        
    };
    
    //GETTERS
    public double getSueldo(){
        return this.sueldo;
    };
    
    public double getDinero(){
        return this.dinero;
    };

    @Override
    public String getNombre() {
        return this.nombre;
    };
}
