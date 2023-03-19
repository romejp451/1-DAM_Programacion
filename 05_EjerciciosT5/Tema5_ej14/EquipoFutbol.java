package tema5_ej13;

import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EquipoFutbol extends Empleado{
    
    //VALORES
    private String nombre;
    private List <Empleado> empleados = new ArrayList();
    private double presupuesto;
    
    
    //CONSTRUCTOR
    public EquipoFutbol(String n, double s, double p) {
        super(n, s);
        this.presupuesto=p;
    }
    
    //SETTERS
    public void addEmpleado(Empleado e) throws IllegalArgumentException{
        int jugadores = 0;
        int entrenador=0;
        for (Empleado em1 : this.empleados) {
            if (em1 instanceof Entrenador) {
                entrenador ++;
            }
            if (entrenador>1) {
                IllegalArgumentException ex= new IllegalArgumentException();
                throw ex;
            }else{
                this.empleados.add(e);
            }
        };
        
        for (Empleado em2 : this.empleados) {
            if (em2 instanceof Futbolista) {
                jugadores ++;
            }
            if (jugadores>25) {
                IllegalArgumentException ex= new IllegalArgumentException();
                throw ex;
            }else{
                this.empleados.add(e);
            }
        }
    };
    
    public void pagarSueldoEmpleados(){
        int empleadosSinPagar = 0;
        double newPresupuesto;
        for (Empleado e : this.empleados) {
            
            empleadosSinPagar++;
            
            if (this.presupuesto<e.getSueldo()) {
            
            if (e instanceof EmpleadoPrimable ex) {
                    
                if (ex.esPrimado()) {
                        
                    try{
                        e.cobrar(e.getSueldo());
                        this.presupuesto -= e.getSueldo()*1.1;
                        empleadosSinPagar--;
                    }
                    catch (CabreoException exception){
                        System.out.println("Error"+exception.getMessage());
                    }
                        
                }else{
                        
                    try{
                        e.cobrar(e.getSueldo());
                        this.presupuesto -= e.getSueldo();
                        empleadosSinPagar--;
                    }
                    catch (CabreoException exception){
                        System.out.println("Error"+exception.getMessage());
                    }
                }
            }
            }
        }
        
        newPresupuesto = (this.presupuesto/empleadosSinPagar);
        
        for (int i = empleadosSinPagar; empleadosSinPagar!=0; i--) {
            Empleado e = this.empleados.get(i);
            try{
                e.cobrar(newPresupuesto);
            }catch (CabreoException ex){
                System.out.println("Error"+ex.getMessage());
            }
        }
        
    };
}
