/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
class Mamifero extends Animal implements Vacunable{
    private double peso;
    private Dieta tipoDieta;

    public Mamifero(double peso, Dieta tipoDieta, String nombre, int edad) {
        super(nombre, edad);
        this.peso = peso;
        this.tipoDieta = tipoDieta;
    }
    
    @Override
    public void vacunar() {
        System.out.println("El mamífero " + getNombre() + " ha sido vacunado.");
    }

   

    @Override
    public String toString() {
        return "Mamifero{" + "peso=" + peso + ", tipoDieta=" + tipoDieta + '}';
    }
    
}
