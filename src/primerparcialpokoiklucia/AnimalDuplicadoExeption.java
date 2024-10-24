/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcialpokoiklucia;

/**
 *
 * @author Usuario
 */
public class AnimalDuplicadoExeption extends RuntimeException {
    private final static String MENSSAGE = "Animal repetido"; 
    public AnimalDuplicadoExeption() {
        super(MENSSAGE);
    }
    
}
