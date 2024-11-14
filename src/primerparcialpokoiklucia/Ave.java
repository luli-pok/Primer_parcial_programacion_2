/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
class Ave extends Animal implements Vacunable{
    private double envergaduraAlas ;

    public Ave(double envergaduraAlas, String nombre, String edad) {
        super(nombre, edad);
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
