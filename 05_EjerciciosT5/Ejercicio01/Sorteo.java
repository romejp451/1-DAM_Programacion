package tema5_ej01;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Sorteo {
    //VALORES
    
    public double dineroCupon;
    private int pagosRealizdos;
    private int pagosPendientes;
    public int totalParticipantes;
    private double dineroRecogido;
    
    //CONSTRUCTOR

    public Sorteo(double dineroCupon, int totalPersonas){
        this.dineroCupon= dineroCupon;
        this.totalParticipantes= totalPersonas;
        this.dineroRecogido = (totalPersonas * dineroCupon);
    };
    
    //SETTERS
    
    public void registrarPago(){
        this.pagosRealizdos++;
        this.pagosPendientes--;
        this.dineroRecogido += 5;
    };
    
    public void apuntarNuevoParticipante(){
        this.totalParticipantes++;
        this.pagosPendientes++;
    };
    
    //GETTERS
    
    public double getDineroRecogido(){
        return this.dineroRecogido;
    };
    
    public int getParticipantes(){
        return this.totalParticipantes;
    };
    
    public int getPagosPendientes(){
        return this.pagosPendientes;
    };
    
    public int getPagosRealizados(){
        int aux = (int)this.dineroRecogido / (int)this.dineroCupon;
        return aux;
    };
}
