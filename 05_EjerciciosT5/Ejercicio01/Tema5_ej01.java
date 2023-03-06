package tema5_ej01;
import tema5_ej01.Sorteo;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej01 {
    public static void main(String[] args) {
        Sorteo s1= new Sorteo(5, 20);
        System.out.println(s1.getDineroRecogido());
        System.out.println(s1.getParticipantes());
        s1.apuntarNuevoParticipante();
        s1.apuntarNuevoParticipante();
        System.out.println(s1.getPagosPendientes());
        System.out.println(s1.getPagosRealizados());
        s1.registrarPago();
        System.out.println(s1.getPagosPendientes());
        System.out.println(s1.getPagosRealizados());
    }
    
}
