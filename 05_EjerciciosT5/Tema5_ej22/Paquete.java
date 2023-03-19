package tema5_ej19;

import java.util.Objects;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Paquete {
    private static final int ALTA =1;
    private static final int MEDIA =2;
    private static final int BAJA =3;
    private String producto;
    private String direccionDestino;
    private int prioridad;

    public Paquete(String pro, String dd, int pri) throws IllegalArgumentException{
        this.producto = pro;
        this.direccionDestino = dd;
        if (pri<ALTA || pri >BAJA) {
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }else{
            this.prioridad = pri;
        }
    }

    public String getProducto() {
        return producto;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.producto);
        hash = 17 * hash + Objects.hashCode(this.direccionDestino);
        hash = 17 * hash + this.prioridad;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Paquete other = (Paquete) o;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return Objects.equals(this.direccionDestino, other.direccionDestino);
    }
    
    
    public int compareTo(Paquete p){
        return Integer.compare(this.getPrioridad(), p.getPrioridad());
    }
    
    
}
