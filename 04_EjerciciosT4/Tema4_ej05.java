package pruebasclases;
import pruebasclases.Clase_Persona;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Oficina {
    private String nombre;
    private ArrayList <Clase_Persona> trabajadores;
    
    //CONSTRUCTORES
    public Oficina() {
        nombre = "Industrias DAW";
        
        trabajadores = new ArrayList<Clase_Persona>();
        trabajadores.add(new Clase_Persona("Ana Diaz Diaz",
                33333333, 'P', 1200,
                LocalDate.parse("21/05/1985",
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        trabajadores.add(new Clase_Persona("Luis Lopez Lopez",
                22222222, 'J', 1000,
                LocalDate.parse("10/09/1995",
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        trabajadores.add(new Clase_Persona("Antonio Perez Perez",
                11111111, 'H', 900,
                LocalDate.parse("28/02/2000",
                        DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
    
    public Oficina(String n) {
        nombre = n;
        trabajadores = null;
    }
    
    public Oficina(String n, int t) {
        nombre = n;    
        if(t <= 0 || t > 3) {
            trabajadores = null;
        } else if(t == 1) {
            trabajadores.add(new Clase_Persona("Antonio Perez Perez",11111111, 'H', 
                900,LocalDate.of(2000, 2, 28)));
        } else if(t == 2) {
            trabajadores.add(new Clase_Persona("Luis Lopez Lopez",22222222, 'J', 
                1000,LocalDate.of(1995, 10, 9)));
            trabajadores.add(new Clase_Persona("Antonio Perez Perez",11111111, 'H', 
                900,LocalDate.of(2000, 2, 28)));
        } else if(t == 3) {
            trabajadores.add(new Clase_Persona("Ana Diaz Diaz",33333333, 'P', 
                1200,LocalDate.of(1985, 5, 21)));
            trabajadores.add(new Clase_Persona("Luis Lopez Lopez",22222222, 'J', 
                1000,LocalDate.of(1995, 10, 9)));
            trabajadores.add(new Clase_Persona("Antonio Perez Perez",11111111, 'H', 
                900,LocalDate.of(2000, 2, 28)));
        }
    }
    
    
   //GETTERS
    public String getNombre(){
        return nombre;
    };
    @Override
    public String toString(){
        String aux = "Nombre:" +this.nombre + "\n";
        for(Clase_Persona p : trabajadores){
            aux += p.toString()+"\n";
        }
        return aux;
    };
}
