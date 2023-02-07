package pruebasclases;
import pruebasclases.Dni;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalDate;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Persona {
    private String nombre;
    private Dni dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    
    //CONSTRUCTORES
    public Persona(String n, Dni d) {
        dni = d;
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003, 
                Month.JANUARY, 31);
    }
    
    public Persona(String n, Dni d, double s, LocalDate f) {
        dni = d;
        nombre = n;
        sueldo = s;
        fechaNacimiento = f;
    }
    
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate f) {
        String dni2 = "";
        String num = dni2.substring(0,7);
        int numero = Integer.parseInt(num);
        char letra = dni2.charAt(dni2.length()-1);
        numero = numDNI;
        letra = letraDNI;
        sueldo = s;
        fechaNacimiento = f;
        nombre = n;
    }
    
    public Persona(String n, int numDNI, char letraDNI) {
        String dni2 = "";
        String num = dni2.substring(0,7);
        int numero = Integer.parseInt(num);
        char letra = dni2.charAt(dni2.length()-1);
        numero = numDNI;
        letra = letraDNI;
        nombre = n;
        sueldo = 900;
        fechaNacimiento = LocalDate.of(2003,Month.JANUARY, 31);
    }
    
    //GETTERS
    public String toString() {
        String aux = "El dueño del DNI es "+nombre+" \nDNI: "+dni+" "
                + "\nCobra:"+sueldo+" \nNacimiento: "+fechaNacimiento;
        return aux;
    }
}
