package tema5_ej05;
import tema5_ej05.Edificio;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej05 {
    public static void main(String[] args) {
        Edificio e1 = new Edificio("Los carmenes", 4);
        System.out.println(e1.getDireccion());
        System.out.println(e1.numeroPlantas);
        
        Hotel h1= new Hotel("San Anton", 5, 30);
        System.out.println(h1.getDireccion());
        System.out.println(h1.getNumeroPlantas());
        h1.añadirCliente("Antonio");
        h1.retirarCliente("Antonio");
        
        try{
            Rascacielos r1 = new Rascacielos("Mi casa", 3, 34);
            System.out.println(r1.getAltura());
        }catch (IllegalArgumentException e){
            System.out.println("Error"+ e.getMessage());
        }
        
        CasaRural c1 = new CasaRural("La marimorena");
    }
    
}
