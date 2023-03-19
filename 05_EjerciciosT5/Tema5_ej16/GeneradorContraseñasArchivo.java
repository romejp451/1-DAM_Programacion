package tema5_ej16;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class GeneradorContraseñasArchivo extends GeneradorContraseñas{
    //VALORES
    private File archivo;
    private Random random;
    
    //CONSTRUCTORES
    
    GeneradorContraseñasArchivo(String ruta){
        this.archivo = new File(ruta);
        this.random = new Random();
        
    };
    
    GeneradorContraseñasArchivo(String ruta, Random r){
        this.archivo = new File(ruta);
        this.random = r;
    };
    
    //SETTERS
    
    public String generarConstraseña(int longitud){
        String contraseña = GeneradorContraseñasArchivo.super.generarContraseña(longitud);
        try{
            FileWriter f1= new FileWriter(this.archivo);
            if (this.archivo.exists()) {
                f1.write(contraseña);
                f1.close();
            }else{
                this.archivo.createNewFile();
            }
        }catch(IOException e){}
            return contraseña;
        
    };
}
