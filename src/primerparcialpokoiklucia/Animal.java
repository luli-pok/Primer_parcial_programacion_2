/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private Dieta tipoDieta;

    public Animal(String nombre, int edad, double peso, Dieta tipoDieta) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipoDieta = tipoDieta;
    }

     public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public Dieta getTipoDieta() {
        return tipoDieta;
    }
    
    abstract public void vacunar();

    @Override
    public abstract String toString();
    
}
