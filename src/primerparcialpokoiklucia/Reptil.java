/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
class Reptil extends Animal {
    private String tipoEscama;
    private String regulacionTemperatura;

    public Reptil(String nombre, int edad, double peso, Dieta tipoDieta, String tipoEscama, String regulacionTemperatura) {
        super(nombre, edad, peso, tipoDieta);
        this.tipoEscama = tipoEscama;
        this.regulacionTemperatura = regulacionTemperatura;
    }

    @Override
    public String toString() {
        return "Reptil{" + "tipoEscama=" + tipoEscama + ", regulacionTemperatura=" + regulacionTemperatura + '}';
    }

    @Override
    public void vacunar() {
        
    }

    
    
    
}
