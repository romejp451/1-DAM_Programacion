package tema5_ej05;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Rascacielos extends Edificio{
    //VALORES 
    private int altura;
    
    //CONSTRUCTOR
    public Rascacielos(String d, int np, int a) throws IllegalArgumentException{
        super(d, np);
        if (a<0) {
            IllegalArgumentException e = new IllegalArgumentException("La "
                    + "altura no debe ser negativa");
            throw e;
        }else{
            this.altura= a;
        }
        
    }
    
    //GETTERS
    public int getAltura(){
        return this.altura;
    };
    
}
