/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Estudiantes
 */
public class Vehiculo {
    
    public String marca;
    private int cilindraje;
    private String modelo;
    private int año;

    void acelerar() {

        System.out.println("Estoy acelerando");
    }

    void frenar() {

        System.out.println("Estoy frenando");
    }
}
