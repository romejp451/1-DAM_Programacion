package tema5_ej03;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Rectangulo {
    //VALORES
    public int base;
    public int altura;
    private int area;
    
    //CONSTRUCTOR
    Rectangulo(int base, int altura){
        this.base= base;
        this.altura= altura;
    };
    
    //SETTERS
    public void setBase(int b){
        this.base= b;
    };
    
    public void setAltura(int a){
        this.altura= a;
    };
    
    //GETTERS
    public int getArea(){
        return this.area= (this.base*this.altura);
    };
    
    public int getBase(){
        return this.base;
    };
    
    public int getAltura(){
        return this.altura;
    };

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", area=" 
                + area + '}';
    }
    
    
}
