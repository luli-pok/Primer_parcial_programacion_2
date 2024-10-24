/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
class Ave extends Animal {
    private double envergaduraAlas;

    public Ave(String nombre, int edad, double peso, Dieta tipoDieta, double envergaduraAlas) {
        super(nombre, edad, peso, tipoDieta);
        this.envergaduraAlas = envergaduraAlas;
    }

    public void vacunar() {
        System.out.println("El ave " + getNombre() + " ha sido vacunada.");
    }

    @Override
    public String toString() {
        return  "Ave{" + "envergaduraAlas=" + envergaduraAlas + '}';
    }
    
    
}
