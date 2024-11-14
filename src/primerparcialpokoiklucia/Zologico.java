
package primerparcialpokoiklucia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Zologico {
    private List<Animal> animales = new ArrayList<>();

    // Método para agregar animales al zoológico
    public void agregarAnimal(Animal a) {
        if (animales.contains(a)) {
            throw new AnimalDuplicadoExeption();
        }
        if (a == null) {
            throw new NullPointerException("No se puede agregar un animal nulo.");
        }
        animales.add(a);
    }

    // Método para mostrar todos los animales en el zoológico
    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }

    // Método para vacunar a todos los animales vacunables
     public void vacunarAnimales() {
        for (Animal animal : animales) {
            if (animal instanceof Vacunable) {
                ((Vacunable) animal).vacunar();
            } else {
                System.out.println(animal.getNombre() + " no se puede vacunar.");
            }
        }
    
    }
    
}
