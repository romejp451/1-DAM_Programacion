package daw.zoo;

import java.util.Objects;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public abstract class Animal {
    //VALORES
    private String nombre;
    private int peso;
    private boolean encerrado;
    
    //CONSTRUCTOR
    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
    //GETTERS Y SETTERS
    public int getPeso() {
        return peso;
    }

    public boolean isEncerrado() {
        return this.encerrado;
    }
    
    public void setEncerrado(boolean b){
        this.encerrado = b;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + this.nombre + ", peso=" + this.peso + ", encerrado=" 
                + this.encerrado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + this.peso;
        hash = 11 * hash + (this.encerrado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    //METODO ABSTRACTO
    public abstract void emitirSonido();
}
