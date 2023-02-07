package pruebasclases;

import java.time.LocalDate;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class baloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    
    //CONSTRUCTORES
    baloncesto(String nL, String nV){
        nombreLocal = nL;
        puntosLocal = 0;
        nombreVisitante = nV;
        puntosVisitante = 0;
        fecha = LocalDate.now();
        
    };
    
    baloncesto(String nL, String nV, LocalDate f){
        nombreLocal = nL;
        puntosLocal = 0;
        nombreVisitante = nV;
        puntosVisitante = 0;
        fecha = f;
    };
    
    baloncesto(String nL, int pL, String nV, int pV, LocalDate f){
        nombreLocal = nL;
        puntosLocal = pL;
        nombreVisitante = nV;
        puntosVisitante = pV;
        fecha = f;
    };
    
    //GETTERS
    /*
    Muestra el nombre del equipo Local.
    */
    public String getnombreLocal(){
        return nombreLocal;
    };
    /*
    Muestra el nombre del equipo Visitante.
    */
    public String getnombreVisitante(){
        return nombreVisitante;
    };
    /*
    Muestra los puntos del equipo Local.
    */
    public int getpuntosLocal(){
        return puntosLocal;
    };
    /*
    Muestra los puntos del equipo Visitante.
    */
    public int getpuntosVisitante(){
        return puntosVisitante;
    /*
    Muestra la fecha que sea. 
    */
    };
    public LocalDate getfecha(){
        return fecha;
    };
}
