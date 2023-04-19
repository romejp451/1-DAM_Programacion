package tema5_ej27;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public interface Apoyable extends FiguraGeometrica{
    public int getLongitudBase();
    public int getLongitudAltura();
    
    default boolean esHorizontal(){
        if (this.getLongitudBase()>this.getLongitudAltura()) {
            return true;
        }else{
            return false;
        }
    };
    
    default boolean esVertical(){
        if (this.getLongitudAltura()>this.getLongitudBase()) {
            return true;
        }else{
            return false;
        }
    };
    
}
