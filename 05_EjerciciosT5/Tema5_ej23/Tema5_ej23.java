package tema5_ej23;
import daw.zoo.Animal;
import daw.zoo.Tigre;
import daw.zoo.Leon;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej23 {
    public static void main(String[] args) {
        Tigre t1 = new Tigre("Peter", 50);
        System.out.println(t1.toString());
        t1.setEncerrado(true);
        System.out.println(t1.toString());
        Leon l1 = new Leon("Michael", 50);
        System.out.println(l1.toString());
        l1.setEncerrado(true);
        System.out.println(l1.toString());
    }   
}
