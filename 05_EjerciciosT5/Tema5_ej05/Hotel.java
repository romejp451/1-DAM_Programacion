package tema5_ej05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Hotel extends Edificio{
    //VALORES 
    private List <String> clientes = new ArrayList<>();
    private int maximo;
    
    //CONSTRUCTOR
    public Hotel(String d, int np, int m) {
        super(d, np);
        this.maximo= m;
    }
    
    //SETTERS
    public void añadirCliente(String c){
        clientes.add(c);
    };
    
    public void retirarCliente(String c){
        for (int i = 0; i < (clientes.size())-1; i++) {
            if (clientes.get(i).equals(c)) {
                clientes.remove(i);
            }
        }
    };
    
    
}
