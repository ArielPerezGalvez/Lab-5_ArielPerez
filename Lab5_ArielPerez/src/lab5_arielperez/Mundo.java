/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_arielperez;

/**
 *
 * @author ariel
 */
public class Mundo {
    private String nombre;
    private String peso;
    private String edad;

    public Mundo() {
    }

    public Mundo(String nombre, String peso, String edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mundo{" + "nombre=" + nombre + ", peso=" + peso + ", edad=" + edad + '}';
    }

   
    
    
}
