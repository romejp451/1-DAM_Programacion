package tema5_ej02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Compras {
    //VALORES
    
    public double presupuesto;
    private List <Double> precios = new ArrayList<>();
    
    //CONSTRUCTOR
    
    Compras(double presupuesto){
        this.presupuesto = presupuesto;
    };
    
    //SETTERS
    
    public void registrarCompra(double dinero) throws Exception{
        if(dinero<=this.presupuesto&&dinero>=0){
            this.precios.add(dinero);
            this.presupuesto -= dinero;
        }else{
            throw new Exception("No hay suficiente presupuesto");
        }         
    }
}
