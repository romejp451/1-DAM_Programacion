package tema5_ej06;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Hotel extends Edificio{
    //VALORES 
    private List <String> clientes = new ArrayList<>();
    private int maximo;
    
    //CONSTRUCTOR
    public Hotel(String d, int np, int m) throws IllegalArgumentException{
        super(d, np);
        if (m<0) {
            IllegalArgumentException e = new IllegalArgumentException("Numero "
                    + "negativo");
            throw e;
        }else{
            this.maximo= m;
        }
    }
    
    //SETTERS
    public void añadirCliente(String c) throws IllegalStateException{
        if (clientes.size() > this.maximo) {
            IllegalStateException e = new IllegalStateException("El numero "
                    + "maximo de clientes no se puede superar");
            throw e;
        }else{
            clientes.add(c);
        }
    };
    
    public void retirarCliente(String c) throws NoSuchElementException{
        for (int i = 0; i < (clientes.size())-1; i++) {
            if (clientes.get(i).equals(c)) {
                clientes.remove(i);
            }else{
               NoSuchElementException e = new NoSuchElementException("No se pudo "
                       + "retirar al cliente ya que no está"); 
               throw e;
            }
        }
    };
    
    
}
