package tema5_ej06;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Edificio {
    //VALORES
    private String direcion;
    int numeroPlantas;
    
    //CONSTRUCTOR
    Edificio(String d, int np){
        this.direcion= d;
        if (np > 0) {
            this.numeroPlantas= np;
        }
    };
    
    //GETTERS
    public String getDireccion(){
        return this.direcion;
    };
    
    public int getNumeroPlantas(){
        return this.numeroPlantas;
    };
}
