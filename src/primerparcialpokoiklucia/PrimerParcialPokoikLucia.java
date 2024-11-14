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

    
    public static void main(String[] args) {
        // Crear un zoológico
        Zologico zoo = new Zologico(); 

        Mamifero leon = new Mamifero(145.6, Dieta.CARNIVORO, "Simba", 6);
        Ave aguila = new Ave(15.7, "Eze", 4);
        Reptil cocodrilo = new Reptil("Drago", 9, "Dura", "Sangre fria");
        Mamifero elefante = new Mamifero(5000.0,Dieta.HERBIVORO,"Elefante",  10 );

        try {
            // Agregar animales al zoológico
            zoo.agregarAnimal(leon);
            zoo.agregarAnimal(aguila);
            zoo.agregarAnimal(cocodrilo);
            zoo.agregarAnimal(elefante);

            // Intentar agregar un animal duplicado para probar la excepción
            zoo.agregarAnimal(leon);  // Esto lanzará AnimalRepetidoException
        } catch (AnimalDuplicadoExeption e) {
            System.out.println(e.getMessage());
        }

        // Mostrar todos los animales en el zoológico
        System.out.println("Animales en el Zoológico:");
        zoo.mostrarAnimales();

        // Vacunar los animales que se pueden vacunar
        System.out.println("\nVacunando animales:");
        zoo.vacunarAnimales();
    }
    
}
