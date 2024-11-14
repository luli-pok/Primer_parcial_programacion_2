
package primerparcialpokoiklucia;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
abstract class Animal {
    private String nombre;
    private int edad;
    

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

     public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        if(obj instanceof String str){
            return str.equals(nombre);
        }
        if(obj instanceof Animal a){
            return nombre.equals(a.nombre) && edad.equals(a.edad);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
    
    
    

    
    
}
