/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
public class PrimerParcialPokoikLucia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un zoológico
        Zologico zoo = new Zologico(); 

        // Crear algunos animales
        Animal leon = new Mamifero("Tigre", 5, 190.5, Dieta.CARNIVORO);
        Animal aguila = new Ave("Alcon", 3, 15.2, Dieta.CARNIVORO, 2.1);
        Animal iguana = new Reptil("Lagartija", 2, 3.4, Dieta.HERBIVORO, "Escamas suaves", "Ectotérmico");

        // Agregar animales al zoológico
        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(aguila);
        zoo.agregarAnimal(iguana);

        // Mostrar los animales en el zoológico
        System.out.println("Animales en el zoológico:");
        zoo.mostrarAnimales();

        // Vacunar a los animales
        System.out.println("\nVacunando animales:");
        zoo.vacunarAnimales();
    }
    
}
