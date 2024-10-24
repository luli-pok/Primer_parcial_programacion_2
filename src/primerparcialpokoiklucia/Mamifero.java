/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
class Mamifero extends Animal {
    public Mamifero(String nombre, int edad, double peso, Dieta tipoDieta) {
        super(nombre, edad, peso, tipoDieta);
    }

    public void vacunar() {
        System.out.println("El mamífero " + getNombre() + " ha sido vacunado.");
    }

    @Override
    public String toString() {
        return "Mamifero{"+ "Peso: " + getPeso() + "kg, Dieta: " + getTipoDieta();
    }
}
