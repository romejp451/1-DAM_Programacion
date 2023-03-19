package tema5_ej15;

import java.util.Random;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class GeneradorContraseñas {
    //VALORES
    private Random random;

    //CONSTRUCTOR
    GeneradorContraseñas(){
        this.random = new Random();
    };
    
    GeneradorContraseñas(Random random){
        this.random=random;
    };
    
    //GETTERS
    public String generarContraseña(int longitud){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int num;
        for (int i = 0; i < longitud; i++) {
            num = random.nextInt(3);
            switch (num) {
                case 0:
                    sb.append((char)(random.nextInt(10) + 48));
                    break;
                case 1:
                    sb.append((char)(random.nextInt(26) + 65));
                    break;
                case 2:
                    sb.append((char)(random.nextInt(26) + 97));
                    break;
            }
        }
        return sb.toString();
    }
    
    public String generarContraseña() {
        return generarContraseña(8);
    }
}
