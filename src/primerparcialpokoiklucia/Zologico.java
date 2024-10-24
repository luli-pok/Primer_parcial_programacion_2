/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        for (Animal a : animales) {
            try {
                a.vacunar();
            } catch (UnsupportedOperationException e) {
                System.out.println("El animal " + a.getNombre() + " no puede ser vacunado.");
            }
        }
    }
    
}
